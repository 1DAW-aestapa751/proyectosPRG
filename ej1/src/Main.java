import java.util.Scanner;
public class Main{
    int estado;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el tamaño del array: ");
        int size = sc.nextInt();
        Persona[] arrayPersonas = new Persona[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Dime el nombre de la persona:");
            String nombre = sc.next();
            System.out.println("Dime la edad de la persona:");
            int edad = sc.nextInt();
            System.out.println("Dime el DNI de la persona:");
            String DNI = sc.next();
            System.out.println("Dime el peso de la persona:");
            double peso = sc.nextDouble();
            System.out.println("Dime la altura de la persona:");
            double altura = sc.nextDouble();
            System.out.println("Dime el sexo de la persona:");
            char sexo = sc.next().charAt(0);
            arrayPersonas[i] = new Persona(nombre, edad, DNI, peso, altura, sexo);

        }
        for (int i = 0; i < size; i++) {
            if (arrayPersonas[i].calcularIMC() == -1){
                System.out.println(arrayPersonas[i].getNombre()+" está por debajo de su peso ideal");
            }
            else if (arrayPersonas[i].calcularIMC() == 0){
                System.out.println(arrayPersonas[i].getNombre()+" está en su peso ideal");
            }
            else{
                System.out.println(arrayPersonas[i].getNombre()+" está por encima de su peso ideal");
            }
        }

        Persona tu = new Persona();
        tu.getCorazon().setDueño("Yo");

        Persona Naoya = new Persona("Naoya", "TojiBiggestFan");
        Persona Yo = new Persona();

        if (arrayPersonas[1].getSexo() == 'M'){
            Yo.setNombre(Naoya.getNombre());
        }
    }
}