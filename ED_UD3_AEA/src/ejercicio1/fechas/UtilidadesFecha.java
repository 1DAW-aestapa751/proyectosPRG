package ejercicio1.fechas;

import ejercicio1.cadenas.UtilidadesCadena;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class UtilidadesFecha {
    // Método para obtener la fecha y hora actual
    public static LocalDateTime obtenerFechaHoraActual() {
        return LocalDateTime.now();
    }

    // Método para formatear una fecha y hora dada
    public static String formatearFechaHora(LocalDateTime fechaHora) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
                UtilidadesCadena.obtenerFormatoFechaEuropeo()
                        + " "
                        + UtilidadesCadena.obtenerFormatoHora());
        return fechaHora.format(formatter);
    }

}
