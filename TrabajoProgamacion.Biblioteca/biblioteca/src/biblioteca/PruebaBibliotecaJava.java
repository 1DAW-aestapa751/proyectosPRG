package biblioteca;

public class PruebaBibliotecaJava {
    public static void main(String[] args){
//        System.out.println("********CASO 1********");
//        Libro libro1 = new Libro("HARRY POTTER Y LA PIEDRA FILOSOFAL", "J.K ROWLING");
//        System.out.println(libro1.obtenerInformacion());
//
//        System.out.println("********CASO 2********");
//        libro1.registrarVenta(10000);
//        System.out.println(libro1.obtenerInformacion());
//
//        System.out.println("********CASO 3********");
//        Libro libro2 = new Libro("HARRY POTTER Y LA CAMARA SECRETA", "J.K ROWLING");
//        libro2.registrarVenta(20000);
//        System.out.println(libro2.obtenerInformacion());
//
//        System.out.println("********CASO 4********");
//        System.out.println(libro1.obtenerTituloPrecuela());
//        System.out.println(libro1.obtenerTituloSecuela());
//        System.out.println(libro2.obtenerTituloPrecuela());
//        System.out.println(libro2.obtenerTituloSecuela());
//        libro1.mostrarResumenSaga();
//
//        System.out.println("********CASO 5********");
//        libro1.anadirSecuela(libro2);
//        System.out.println(libro1.obtenerTituloPrecuela());
//        System.out.println(libro1.obtenerTituloSecuela());
//        System.out.println(libro2.obtenerTituloPrecuela());
//        System.out.println(libro2.obtenerTituloSecuela());
//
//        System.out.println("********CASO 6********");
//        libro1.mostrarResumenSaga();
//
//        System.out.println("********CASO 7********");
//        libro2.mostrarResumenSaga();
//
//        System.out.println("********CASO 8********");
//        Libro[] saga = libro2.obtenerSaga();
//        for(int i = 0; i < saga.length; i++){
//            System.out.println("El libro "+(i+1)+" de la saga es: "+saga[i].obtenerInformacion());
//        }
//
//        System.out.println("********CASO 9********");
//        Libro libro3 = new Libro("HARRY POTTER Y EL PRISIONERO DE AZKABAN", "J.K ROWLING");
//        libro3.registrarVenta(50000);
//        libro3.mostrarResumenSaga();
//
//        System.out.println("********CASO 10********");
//        libro2.anadirSecuela(libro3);
//        libro3.mostrarResumenSaga();
//
//        System.out.println("********CASO 11********");
//        libro1.mostrarResumenSaga();
//        libro2.mostrarResumenSaga();
//
//        System.out.println("********CASO 12********");
//        Libro[] sagaNueva = libro2.obtenerSaga();
//        for (int i = 0; i < sagaNueva.length; i++){
//            System.out.println("El libro "+(i+1)+" de la saga es: "+sagaNueva[i].obtenerInformacion());
//        }

        //Nuevo Main

        Libro HarryPotter1 = new Libro("HARRY POTTER Y LA PIEDRA FILOSOFAL", "J.K ROWLING");
        HarryPotter1.registrarVenta(10000);
        Libro HarryPotter2 = new Libro("HARRY POTTER Y LA CAMARA SECRETA", "J.K ROWLING");
        HarryPotter2.registrarVenta(20000);
        Libro HarryPotter3 = new Libro("HARRY POTTER Y EL PRISIONERO DE AZKABAN", "J.K ROWLING");
        HarryPotter3.registrarVenta(50000);

        HarryPotter3.anadirAnteriorEnSaga(HarryPotter2);
        HarryPotter2.anadirAnteriorEnSaga(HarryPotter1);

        Libro Berserk1 = new Libro("Berserk (tomo 1)", " ");
        Berserk1.registrarVenta(3500);
        Libro Berserk2 = new Libro("Berserk (tomo 2)", " ");
        Berserk2.registrarVenta(2800);
        Libro Berserk3 = new Libro("Berkserk (tomo 3)", " ");
        Berserk3.registrarVenta(3000);

        Berserk3.anadirAnteriorEnSaga(Berserk2);
        Berserk2.anadirAnteriorEnSaga(Berserk1);

        Libro[] sagaHP = HarryPotter1.obtenerSaga();
        Libro[] sagaBK = Berserk1.obtenerSaga();

        //Probando el método de obtenerLibrosAnteriores();
        Libro[] precuelasHP3 = HarryPotter3.obtenerLibrosAnteriores();
        for(int i = 0; i<precuelasHP3.length; i++){.
            System.out.println(precuelasHP3[i].obtenerInformacion());
        }
        System.out.println();

//        for(int i = 0; i<sagaHP.length; i++){
//            System.out.println(sagaHP[i].obtenerInformacion());
//        }
//        for(int i = 0; i<sagaBK.length; i++){
//            System.out.println(sagaBK[i].obtenerInformacion());
//        }

        obtenerSagaMenosVendida(Berserk1, HarryPotter3);

    }

    public static void obtenerSagaMenosVendida(Libro libro1, Libro libro2){
        Libro actual = libro1;
        int totalSaga1 = 0;
        int totalSaga2 = 0;

        //ir al primer libro de la saga 1
        while (actual.getPrecuela() != null){
            actual = actual.getPrecuela();
        }
        //recorrer la saga sumando ventas
        while (actual.getSecuela() != null){
            totalSaga1 += actual.getEjemplaresVendidos();
            actual = actual.getSecuela();
        }
        //añadir el ultimo de la saga
        totalSaga1 += actual.getEjemplaresVendidos();

//        System.out.println(totalSaga1);

        //Cambiamos a la saga 2
        actual = libro2;
        //ir al primer libro de la saga 2
        while (actual.getPrecuela() != null){
            actual = actual.getPrecuela();
        }
        //recorrer la saga sumando ventas
        while (actual.getSecuela() != null){
            totalSaga2 += actual.getEjemplaresVendidos();
            actual = actual.getSecuela();
        }
        //añadir el ultimo de la saga
        totalSaga2 += actual.getEjemplaresVendidos();

//        System.out.println(totalSaga2);


        if (totalSaga1 == totalSaga2){
            System.out.println("Ambas han vendido lo mismo");
        } else if (totalSaga1 > totalSaga2) {
            System.out.println("La saga de "+libro1.getTitulo()+" ha vendido más. ("+totalSaga1+" libros)");
        } else {
            System.out.println("La saga de "+libro2.getTitulo()+" ha vendido más. ("+totalSaga2+" libros)");
        }
    }
}
