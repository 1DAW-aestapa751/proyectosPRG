public class main {
    public static void main(String[] args) {
        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[10];

        listaElectrodomesticos[0] = new Lavadora(200, colores.blanco, 'A', 40, 35);
        listaElectrodomesticos[1] = new Television(150, colores.negro, 'B', 15, 50, true);
        listaElectrodomesticos[2] = new Electrodomestico(100, colores.gris, 'C', 20);
        listaElectrodomesticos[3] = new Lavadora(300, 50);
        listaElectrodomesticos[4] = new Television(250, 30);
        listaElectrodomesticos[5] = new Electrodomestico();
        listaElectrodomesticos[6] = new Lavadora(180, colores.rojo, 'D', 60, 15);
        listaElectrodomesticos[7] = new Television(500, colores.azul, 'E', 10, 32, false);
        listaElectrodomesticos[8] = new Electrodomestico(120, colores.blanco, 'F', 85);
        listaElectrodomesticos[9] = new Lavadora();

        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisiones = 0;

        for (Electrodomestico e : listaElectrodomesticos) {
            double precioFinal = e.getPrecioFinal();
            System.out.println(e.toString());

            if (e instanceof Lavadora) {
                precioTotalLavadoras += precioFinal;
            } else if (e instanceof Television) {
                precioTotalTelevisiones += precioFinal;
            } else {
                precioTotalElectrodomesticos += precioFinal;
            }
        }

        System.out.println("\n--- RESUMEN DE PRECIOS ---");
        System.out.println("Total Lavadoras: " + precioTotalLavadoras);
        System.out.println("Total Televisiones: " + precioTotalTelevisiones);
        System.out.println("Total Electrodomésticos: " + (precioTotalElectrodomesticos + precioTotalLavadoras + precioTotalTelevisiones));
    }
}
