import java.io.FileWriter;
import java.io.IOException;

public class OUTPUT1 {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("o1.txt");
            String frase = "En un lugar de La Mancha,";
            for (int i = 0; i<frase.length(); i++){
                fw.write(frase.charAt(i));
            }
            fw.write("\n");
            fw.write("de cuyo nombre no quiero acordarme");
            fw.close();
        } catch (IOException e) {
            System.out.println("no va");
        }

    }
}
