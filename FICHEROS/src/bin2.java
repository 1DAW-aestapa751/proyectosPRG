import java.io.*;

public class bin2 {
    public static void main(String[] args) {
        String arch = "cancionPirata.dat";
        String estrofa ="Con diez cañones por banda, \n" +
                "viento en popa a toda vela, \n" +
                "no corta el mar sino vuela \n" +
                "un velero bergantín";
        try {
            ObjectOutputStream dos = new ObjectOutputStream(new FileOutputStream(arch));
            dos.writeUTF(estrofa);

            dos.close();
        } catch (FileNotFoundException e) {
            System.out.println("No se encuentra el archivo");
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero");
        }

    }
}
