import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class bin3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe un numero entero:");
        try {
            int num = sc.nextInt();
            double[] nums = new double[num];
            for(int i = 0; i<num; i++){
                System.out.println("Double:");
                nums[i] = sc.nextDouble();
            }
            sc.close();
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("doubles.dat"));
            for(int i = 0; i<nums.length; i++){
                dos.writeDouble(nums[i]);
            }
            dos.close();
        }catch (InputMismatchException e){
            System.out.println("Dato erroneo");
        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero");
        } catch (IOException e) {
            System.out.println("Error al escribir");
        }

    }
}
