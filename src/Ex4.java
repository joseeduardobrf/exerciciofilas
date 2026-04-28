import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Queue<String> prioridade = new LinkedList<>();
        Queue<String> normal = new LinkedList<>();

        prioridade.add("Ana");
        prioridade.add("Carlos");
        prioridade.add("Maria");
        prioridade.add("Pedro");

        normal.add("João");
        normal.add("Lucas");
        normal.add("Paulo");

        int contador = 0;

        while (!prioridade.isEmpty() || !normal.isEmpty()) {
            if ((!prioridade.isEmpty() && contador < 3) || normal.isEmpty()) {
                System.out.println("Atendendo prioritário: " + prioridade.poll());
                contador++;
            } else {
                System.out.println("Atendendo normal: " + normal.poll());
                contador = 0;
            }
        }
    }
}