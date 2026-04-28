import java.util.*;

class DocumentoUrgente implements Comparable<DocumentoUrgente> {
    String nome;
    int paginas;
    int prioridade;

    DocumentoUrgente(String nome, int paginas, int prioridade) {
        this.nome = nome;
        this.paginas = paginas;
        this.prioridade = prioridade;
    }

    public int compareTo(DocumentoUrgente d) {
        return this.prioridade - d.prioridade;
    }
}

public class Ex6 {
    public static void main(String[] args) {
        PriorityQueue<DocumentoUrgente> fila = new PriorityQueue<>();

        fila.add(new DocumentoUrgente("Doc1", 5, 2));
        fila.add(new DocumentoUrgente("Doc2", 2, 1));
        fila.add(new DocumentoUrgente("Doc3", 8, 3));

        while (!fila.isEmpty()) {
            System.out.println("Imprimindo: " + fila.poll().nome);
        }
    }
}