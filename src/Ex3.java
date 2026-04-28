import java.util.*;

class ClienteMercado {
    String nome;
    int produtos;

    ClienteMercado(String nome, int produtos) {
        this.nome = nome;
        this.produtos = produtos;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        Queue<ClienteMercado> fila = new LinkedList<>();

        fila.add(new ClienteMercado("Ana", 10));
        fila.add(new ClienteMercado("João", 4));
        fila.add(new ClienteMercado("Maria", 7));
        fila.add(new ClienteMercado("Carlos", 3));
        fila.add(new ClienteMercado("Pedro", 12));

        while (!fila.isEmpty()) {
            ClienteMercado c = fila.poll();
            System.out.println("Atendendo: " + c.nome);
            System.out.println("Restam " + fila.size() + " clientes");
        }
    }
}