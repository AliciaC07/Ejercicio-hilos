import hilos.ImpresoraCabeza;
import hilos.TrabajoImpresora;
import modelos.Documento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

  public static void main(String[] args) {
    Queue<Documento> documentos = new ConcurrentLinkedQueue<>();
    for(int i = 0; i < 10; i++) {
      if (i % 2 == 0) {
        documentos.add(new Documento("A", i, (i + 1) * 2));
      } else {
        documentos.add(new Documento("B", i, (i + 1) * 2));
      }
    }

    Thread th = new Thread(new TrabajoImpresora(documentos, new ImpresoraCabeza(), "A"), "Impresora A");
    Thread th2 = new Thread(new TrabajoImpresora(documentos, new ImpresoraCabeza(), "B"), "Impresora B");
    Thread th3 = new Thread(new TrabajoImpresora(documentos, new ImpresoraCabeza(), "A"), "Impresora A2");
    Thread th4 = new Thread(new TrabajoImpresora(documentos, new ImpresoraCabeza(), "B"), "Impresora B2");
    th.start();
    th2.start();
    th3.start();
    th4.start();


  }

}
