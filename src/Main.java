import hilos.ImpresoraCabeza;
import hilos.TrabajoImpresora;
import modelos.Documento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        List<Queue<Documento>> documentos = new ArrayList<>();
        LinkedList<Documento> l1 = new LinkedList<>();
        l1.add(new Documento());
        l1.add(new Documento());
        l1.add(new Documento());
        l1.add(new Documento());
        l1.add(new Documento());
        l1.add(new Documento());
        l1.add(new Documento());
        documentos.add(l1);
        documentos.add(new LinkedList<>());
        documentos.add(new LinkedList<>());
        documentos.add(new LinkedList<>());
        documentos.add(new LinkedList<>());
        documentos.add(new LinkedList<>());
        documentos.add(new LinkedList<>());
        documentos.add(new LinkedList<>());
        documentos.add(new LinkedList<>());
        documentos.add(new LinkedList<>());

        Thread th = new Thread(new TrabajoImpresora(documentos, new ImpresoraCabeza()),"Thread " + 1);

        th.start();


    }

}
