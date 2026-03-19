import java.util.InputMismatchException;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        System.out.println(leerEntero());
    }

    public static Integer leerEntero() throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        int a = -1;
        a = sc.nextInt();
        return a;
    }
}
