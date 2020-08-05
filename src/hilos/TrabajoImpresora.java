package hilos;

import modelos.Documento;

import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TrabajoImpresora implements Runnable {
  private final Queue<Documento> documentos;
  private final ImpresoraCabeza impresoraCabeza;
  private final String tipo;
  private final Lock colaLock = new ReentrantLock();

  public TrabajoImpresora(Queue<Documento> documentos, ImpresoraCabeza impresoraCabeza, String tipo) {
    this.documentos = documentos;
    this.impresoraCabeza = impresoraCabeza;
    this.tipo = tipo;
  }

  @Override
  public void run() {
    while (!documentos.isEmpty()) {
      if (documentos.peek().getTipo().equals(tipo)) {
        colaLock.lock();
        impresoraCabeza.printJob(documentos.poll());
        colaLock.unlock();
      }
  }
}
}
