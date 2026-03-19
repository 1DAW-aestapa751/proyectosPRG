import java.util.Random;

public class ej4 {
    static Random rnd=new Random();
    public static void main(String[] args) {
        int iterador = 0;
        while(iterador>=0) {
            iterador = aumentar(iterador);
            iterador = disminuir(iterador);
            System.out.println("Valor actual: " + iterador);
        }
    }
    public static int aumentar(int a) {
        int aumento = rnd.nextInt(50);
        System.out.println("Aumentando "+aumento);
        return (a + aumento);
    }
    public static int disminuir(int a) {
        int disminucion = rnd.nextInt(10);
        System.out.println("Disminuyendo " + disminucion);
        return (a - disminucion);
    }
}
