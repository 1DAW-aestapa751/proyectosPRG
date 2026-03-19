import java.util.InputMismatchException;
import java.util.Scanner;

public class test {
    public static void main(String[] args){
        System.out.println(leerEntero());
    }

    public static Integer leerEntero(){
        Scanner sc = new Scanner(System.in);
        int a = -1;
        boolean correcto = false;
        do {
            try {
                a = sc.nextInt();
                correcto = true;
            } catch (InputMismatchException e) {
                System.out.println("No es un entero");
                sc.next();
            }
        } while (!correcto);
        return a;
    }
}
