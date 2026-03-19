import java.io.*;
import java.util.Scanner;

public class bin7 {
    public static void main(String[] args){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("numeros.dat"));
            int num = 0;
            Scanner sc = new Scanner(System.in);
            while (num != -1) {
                num = sc.nextInt();
                oos.writeInt(num);
            }
            oos.close();
            sc.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("numeros.dat"));
            num = ois.readInt();
            while (true) {
                System.out.println(num);
                num = ois.readInt();
            }
        } catch (EOFException e) {
            System.out.println("Archivo leido completo");
        } catch (IOException e) {
            System.out.println("Error al escribir/leer en el archivo");
        }
    }
}
