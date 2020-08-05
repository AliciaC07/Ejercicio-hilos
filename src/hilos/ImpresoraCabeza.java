package hilos;

import modelos.Documento;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ImpresoraCabeza {

  private final Lock colaLock = new ReentrantLock();

  public void printJob(Documento documento) {
    colaLock.lock();
    try {
      if(documento.getI() == 19) {
        throw new RuntimeException();
      }
      Long duration = (long) (documento.getPagina() * 1000);
      System.out.printf(Thread.currentThread().getName() + " El documento %s se está imprimiendo (%d)\n", documento.getTipo(), documento.getI());
      Thread.sleep(duration);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      colaLock.unlock();
      System.out.printf(Thread.currentThread().getName() + " El documento %s se imprimió (%d)\n", documento.getTipo(), documento.getI());
    }
  }
}
