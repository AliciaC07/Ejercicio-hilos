import modelos.Documento;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        List<Queue<Documento>> documentos = new ArrayList<>();
        documentos.add(new LinkedList<>());
        documentos.add(new LinkedList<>());
    }

}
