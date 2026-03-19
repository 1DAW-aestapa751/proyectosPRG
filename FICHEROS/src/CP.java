import java.io.*;
import java.util.Scanner;

public class CP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre del archivo a copiar: ");
        String ruta = sc.next();
        sc.close();
        String nombreCP = "copia_de_"+ruta;

        try {
            FileReader fr = new FileReader(ruta);
            BufferedReader br = new BufferedReader(fr);
            try {
                FileWriter fw = new FileWriter(nombreCP);

                String linea = br.readLine();
                while (linea != null){
                    fw.write(linea+"\n");
                    linea= br.readLine();
                }

                fr.close();
                br.close();
                fw.close();

            } catch (IOException e) {
                System.out.println("Error al copiar el archivo");
            }
        } catch (FileNotFoundException e) {
            System.out.println("El archivo no existe");
        }
    }
}
