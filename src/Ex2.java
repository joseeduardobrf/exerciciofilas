import java.util.*;

class Cliente {
    String nome;
    int senha;

    Cliente(String nome, int senha) {
        this.nome = nome;
        this.senha = senha;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Queue<Cliente> fila = new LinkedList<>();

        fila.add(new Cliente("Ana", 101));
        fila.add(new Cliente("Carlos", 102));
        fila.add(new Cliente("João", 103));
        fila.add(new Cliente("Maria", 104));
        fila.add(new Cliente("Pedro", 105));
        fila.add(new Cliente("Lucas", 106));

        while (!fila.isEmpty()) {
            Cliente c = fila.poll();
            System.out.println("Chamando senha: " + c.senha);
        }

        System.out.println("Fila vazia.");
    }
}