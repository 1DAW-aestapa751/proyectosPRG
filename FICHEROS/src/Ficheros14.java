import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ficheros14 {
    public static void main(String[] args){
        try {
            FileReader fr = new FileReader("zlawn.txt");
            BufferedReader br = new BufferedReader(fr);
            try {
                String linea = br.readLine();
                String[] nums = linea.split(" ");
                int[] numls = new int[nums.length];
                for (int i = 0; i<nums.length; i++){
                    numls[i] = Integer.parseInt(nums[i]);
                }
                int total = 0;
                for (int i = 0; i<numls.length; i++){
                    total += numls[i];
                }
                int media = total /numls.length;
                System.out.println("total="+total);
                System.out.println("media="+media);
            } catch (IOException e) {
                System.out.println("Error al leer la linea");
            }
        } catch (FileNotFoundException e) {
            System.out.println("NO EXISTE EL FICHERO");
        }
    }
}
