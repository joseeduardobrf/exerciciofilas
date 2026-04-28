import java.util.*;

class Tarefa implements Comparable<Tarefa> {
    String nome;
    int prioridade;

    Tarefa(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public int compareTo(Tarefa t) {
        return this.prioridade - t.prioridade;
    }
}

public class Ex9 {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> fila = new PriorityQueue<>();

        fila.add(new Tarefa("Backup", 2));
        fila.add(new Tarefa("Antivírus", 1));
        fila.add(new Tarefa("Atualização", 3));

        while (!fila.isEmpty()) {
            System.out.println("Executando: " + fila.poll().nome);
        }
    }
}