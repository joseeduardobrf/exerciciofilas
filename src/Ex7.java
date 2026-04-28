import java.util.*;

class Chamada {
    String nome;
    String assunto;

    Chamada(String nome, String assunto) {
        this.nome = nome;
        this.assunto = assunto;
    }
}

public class Ex7 {
    public static void main(String[] args) {
        Queue<Chamada> fila = new LinkedList<>();

        fila.add(new Chamada("Ana", "Suporte"));
        fila.add(new Chamada("João", "Pagamento"));
        fila.add(new Chamada("Maria", "Cadastro"));

        while (!fila.isEmpty()) {
            Chamada c = fila.poll();
            System.out.println("Atendendo: " + c.nome);
            System.out.println("Aguardando: " + fila.size());
        }
    }
}