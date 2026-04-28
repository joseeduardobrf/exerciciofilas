import java.util.*;

class Paciente implements Comparable<Paciente> {
    String nome;
    int prioridade;

    Paciente(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }

    public int compareTo(Paciente p) {
        return this.prioridade - p.prioridade;
    }
}

public class Ex5 {
    public static void main(String[] args) {
        PriorityQueue<Paciente> fila = new PriorityQueue<>();

        fila.add(new Paciente("Ana", 2));
        fila.add(new Paciente("João", 1));
        fila.add(new Paciente("Carlos", 3));
        fila.add(new Paciente("Maria", 2));
        fila.add(new Paciente("Pedro", 1));
        fila.add(new Paciente("Lucas", 3));

        while (!fila.isEmpty()) {
            Paciente p = fila.poll();
            System.out.println("Atendido: " + p.nome);
        }
    }
}