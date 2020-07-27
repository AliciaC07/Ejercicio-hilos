package hilos;

import modelos.Documento;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TrabajoImpresora implements Runnable {

    public Integer count = 0;

    private List<Queue<Documento>> documentos;
    private ImpresoraCabeza impresoraCabeza;

    public TrabajoImpresora(List<Queue<Documento>> documentos, ImpresoraCabeza impresoraCabeza) {
        this.documentos = documentos;
        this.impresoraCabeza = impresoraCabeza;
    }

    @Override
    public void run() {
        while(!documentos.get(count).isEmpty()) {
            System.out.println(count);
            impresoraCabeza.printJob(documentos.get(count).poll());
            count++;
        }
        System.out.printf("%s: A imprimir un documento\n", Thread.currentThread().getName());


    }
}
