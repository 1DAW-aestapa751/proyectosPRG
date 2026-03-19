import java.util.Arrays;

public class PruebaProductos {
    public static void main(String[] args){

        Tablet t1 = new Tablet(350.0, "Galaxy Tab S9", "Samsung", 11, 1600, 128);
        Tablet t2 = new Tablet(299.99, "iPad Air", "Apple", 10, 2360, 64);
        SmartPhone s1 = new SmartPhone(899.0, "iPhone 15", "Apple", "iOS", 128, 600123456);
        SmartPhone s2 = new SmartPhone(750.0, "Pixel 8", "Google", "Android", 256, 611987654);
        Portatil p1 = new Portatil(1200.0, "MacBook Air", "Apple", 13, 512, 16);
        Portatil p2 = new Portatil(950.0, "ZenBook", "Asus", 14, 1024, 16);

        ProductoElectronico[] pe = {t1, t2, s1, s2, p1, p2};

        System.out.println("--- Orden Natural (Marca y Modelo) ---");
        Arrays.sort(pe);
        for (int i = 0; i < pe.length; i++) {
            System.out.println(pe[i]);
        }

        System.out.println("--- Orden por Precio ---");
        Arrays.sort(pe, new ComparadorPrecio());
        for (int i = 0; i < pe.length; i++) {
            System.out.println(pe[i]);
        }

        System.out.println("--- Orden por precio de mayor a menor ---");
        Arrays.sort(pe, new ComparadorPrecio().reversed());
        for (int i = 0; i < pe.length; i++) {
            System.out.println(pe[i]);
        }

    }
}
