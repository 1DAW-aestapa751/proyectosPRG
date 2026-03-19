import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class bin6 {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\1DAW-aestapa751\\IdeaProjects\\FICHEROS\\cancionPirata.dat"))) {
            // Leemos el String que contiene la estrofa
            String estrofa = in.readUTF();

            System.out.println("--- Estrofa de la Canción del Pirata ---");
            System.out.println(estrofa);
        } catch (IOException e) {
            System.out.println("No se pudo recuperar la canción: " + e.getMessage());
        }
    }
}
