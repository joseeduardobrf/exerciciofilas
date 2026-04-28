import java.util.*;

class Processo {
    String id;
    int tempo;

    Processo(String id, int tempo) {
        this.id = id;
        this.tempo = tempo;
    }
}

public class Ex8 {
    public static void main(String[] args) {
        Queue<Processo> fila = new LinkedList<>();

        fila.add(new Processo("P1", 5));
        fila.add(new Processo("P2", 3));
        fila.add(new Processo("P3", 8));

        while (!fila.isEmpty()) {
            Processo p = fila.poll();
            System.out.println("Executando: " + p.id);
        }
    }
}