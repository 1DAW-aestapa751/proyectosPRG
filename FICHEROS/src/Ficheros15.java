import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ficheros15 {
    public static void main(String[] args){
        File arch = new File("caravan.txt");
        Scanner sc;
        {
            try {
                sc = new Scanner(arch);
                double suma = 0;
                while(sc.hasNextDouble()) {
                    suma += sc.nextDouble();
                }
                System.out.println("La suma total es:"+suma);
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("No existe el archivo");
            }
        }
    }
}
