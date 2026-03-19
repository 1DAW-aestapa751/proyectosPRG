import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class bin1 {
    public static void main(String[] args){
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("datos.dat"));
            for(int i = 0; i<numeros.length; i++){
                dos.writeInt(numeros[i]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no existe");
        } catch (IOException e) {
            System.out.println("Error al crear la tabla");
        }

    }
}
