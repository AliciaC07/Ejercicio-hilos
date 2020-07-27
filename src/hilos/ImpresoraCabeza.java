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
            Long duration = (long) (Math.random() * 1000);
            System.out.println(Thread.currentThread().getName() + ": PrintQueue: " + (duration / 1000) + " seconds :: time -" + new Date());
            Thread.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.printf("%s: El documento ha sido terminado \n", Thread.currentThread().getName());
            colaLock.unlock();
        }
    }
}
