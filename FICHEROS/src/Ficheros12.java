import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros12 {
    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("C:\\Users\\1DAW-aestapa751\\IdeaProjects\\Minecraft\\src\\Main.java");
            BufferedReader br = new BufferedReader(fr);
            String linea= br.readLine();
            while (linea != null){
                System.out.println(linea);
                linea= br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existe el archivo");
        } catch (IOException e) {
            System.out.println("Error al leer la linea");
        }
    }
}
