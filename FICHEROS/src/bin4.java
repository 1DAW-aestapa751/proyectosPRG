import java.io.*;

public class bin4 {
    public static void main(String[] args){
        int[] nums = new int[10];
        try {
            DataInputStream ois = new DataInputStream(new FileInputStream("C:\\Users\\1DAW-aestapa751\\IdeaProjects\\FICHEROS\\datos.dat"));
            for(int i = 0; i<nums.length; i++){
                nums[i] = ois.readInt();
            }
            for(int i = 0; i<nums.length; i++){
                System.out.println(nums[i]);
            }
            ois.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }
}
