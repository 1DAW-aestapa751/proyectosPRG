import java.io.*;

public class bin8 {
    public static void main(String[] args){
        Socio s1 = new Socio("carlos", 32);
        Socio s2 = new Socio("Jorge", 20);
        Socio[] socios = {s1, s2};
        ObjectOutputStream oos;
        {
            try {
                oos = new ObjectOutputStream(new FileOutputStream("socios.dat"));
                oos.writeObject(socios);
                oos.close();
            } catch (IOException e) {
                System.out.println("Error al crear el archivo");
            }
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("socios.dat"));
            try {
                Socio[] socios2 = (Socio[]) ois.readObject();
                ois.close();
                for (int i = 0; i<socios2.length; i++){
                    System.out.println(socios2[i].edad+" "+socios2[i].nombre);
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("Error al leer el archivo");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }

    }
}
