
import ejercicio1.cadenas.UtilidadesCadena;
import ejercicio1.fechas.UtilidadesFecha;
import java.time.LocalDateTime;

public class PruebaFechas {

    public static void main(String[] args) {
        // Obtener la fecha y hora actual
        LocalDateTime fechaHoraActual = UtilidadesFecha.obtenerFechaHoraActual();
        System.out.println("Fecha y hora actual: " + fechaHoraActual);

        // Formatear la fecha y hora actual
        String fechaHoraFormateada = UtilidadesFecha.formatearFechaHora(fechaHoraActual);
        System.out.println("Fecha y hora formateada: " + fechaHoraFormateada);

        System.out.println("PRUEBA DE Álvaro " + UtilidadesCadena.invertir(fechaHoraFormateada));

    }

}