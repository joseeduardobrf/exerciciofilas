import java.util.*;

class Documento {
    String nome;
    int paginas;

    Documento(String nome, int paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }
}

public class Ex1 {
    public static void main(String[] args) {
        Queue<Documento> fila = new LinkedList<>();

        fila.add(new Documento("Trabalho.pdf", 10));
        fila.add(new Documento("Relatorio.docx", 5));
        fila.add(new Documento("Foto.jpg", 2));
        fila.add(new Documento("Contrato.pdf", 8));
        fila.add(new Documento("Livro.pdf", 20));

        while (!fila.isEmpty()) {
            Documento doc = fila.poll();
            System.out.println("Imprimindo: " + doc.nome);
        }
    }
}