import java.io.*;
import java.util.Scanner;

public class bin9 {
    public static void main(String[] args){
        System.out.println("+-----------------+");
        System.out.println("|     registros   |");
        System.out.println("+-----------------+");
        System.out.println();
        System.out.println("(1)-Añadir nuevo registro-");
        System.out.println("(2)-Ver registros-");
        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        switch (opt){
            case 1:
                System.out.println("Introduzca la temperatura");
                double temperatura = sc.nextDouble();
                Registro r = new Registro(temperatura);
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("registros.dat", true));
                    oos.writeObject(r);
                    oos.close();
                } catch (IOException e) {
                    System.out.println("Error al escribir el registro");
                }
                break;
            case 2:
                System.out.println("REGISTROS:");
                try {
                    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("registro.dat"));

                } catch (IOException e) {
                    System.out.println("Error al leer el archivo");
                }

        }
    }
}
