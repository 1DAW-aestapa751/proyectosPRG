import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ficheros16 {
    public static void main(String[] args){
        File arch = new File("Enteros.txt");
        try {
            FileInputStream fis = new FileInputStream(arch);
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
        Scanner sc;
        {
            try {
                sc = new Scanner(arch);
                int suma = 0;
                while(sc.hasNextDouble()) {
                    suma += sc.nextInt();
                }
                System.out.println("La suma total es:"+suma);
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("No existe el archivo");
            }
        }
    }
}
