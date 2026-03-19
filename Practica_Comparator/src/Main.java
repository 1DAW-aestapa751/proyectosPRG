import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Coche c1 = new Coche("Nissan", "Silvia s13", "1340PWD");
        Coche c2 = new Coche("Volkswagen", "Polo", "7891HTM");
        Coche c3 = new Coche("Toyota", "Celica", "1550FBL");
        Coche c4 = new Coche("Citröen", "Xsara Picasso");
        Coche c5 = new Coche("Peugeot", "205 mito");

        Moto m1 = new Moto("Honda", "Navi");
        Moto m2 = new Moto("Yamaha", "Aerox");
        Moto m3 = new Moto("Suzuki", "burgman");

        Coche[] coches = {c1, c2, c3, c4, c5};
        Moto[] motos = {m1, m2, m3};

        Vehiculo[] vehiculos = {c1, m1, c2, m2, c3, m3, c4, c5};

        Arrays.sort(coches);
        Arrays.sort(motos);
        Arrays.sort(vehiculos);

        System.out.println(Arrays.toString(coches));
        System.out.println(Arrays.toString(motos));
        System.out.println(Arrays.toString(vehiculos));

    }
}
