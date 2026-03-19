package ejercicio1.cadenas;

public class UtilidadesCadena {

    // 1. Método para invertir una cadena
    public static String invertir(String texto) {
        return new StringBuilder(texto).reverse().toString();
    }

    // 2. Método para invertir una cadena
    public static String obtenerFormatoFechaEuropeo() {
        return "dd/MM/yyyy";
    }

    public static String obtenerFormatoHora() {
        return "HH:mm:ss";
    }

    public static String obtenerFormatoFechaConHora() {
        return obtenerFormatoFechaEuropeo() + " " + obtenerFormatoHora();
    }




}
