
import java.util.Random;

public class Aleatorios {

    public static void main(String args[]) {
        int i, x, N, MAX;

        N = 10; // N números aleatorios a generar
        MAX = 100; // Número aleatorio calculado entre [0, MAX-1]

        for (i = 0; i < N; i++) {
            x = new Random().nextInt(MAX);
            System.out.println(x);
        }
    }
}
