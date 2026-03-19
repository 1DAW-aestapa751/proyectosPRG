
package pruebafechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAmount;
import java.time.temporal.TemporalUnit;
import java.util.List;


public class PruebaFechas {

    public static void main(String[] args) {
        
        LocalDate fechaAct = LocalDate.now();
        System.out.println(fechaAct);
        
        LocalTime horaACtual = LocalTime.now();
        System.out.println(horaACtual);
        
        LocalTime horaACtual2 = LocalTime.now();
        System.out.println(horaACtual2);
          
        LocalDate hoy = LocalDate.now();
        LocalTime ahora = LocalTime.now();
        
        LocalDateTime fechaYhora1 = LocalDateTime.now();
        
        LocalDateTime fechaYhora2 = LocalDateTime.of(hoy, ahora);
        
        
        System.out.println(fechaYhora1);
        System.out.println(fechaYhora2);

        Period periodo = Period.ofWeeks(1);
        // Fecha de hoy:
        System.out.println("Hoy es: " + hoy);
        // El periodo suma un solo día:
        System.out.println("Tras sumar el periodo: " + hoy.plus(periodo));
        
        System.out.println("Tras sumar el periodo: " + hoy.plusDays(1).plusMonths(1));
        System.out.println("Tras sumar el periodo: " + hoy.plusMonths(1).plusDays(12));
        System.out.println("Tras sumar el periodo (Observamos que no hemos modificado el objeto): " + hoy);
        
        
        
        //Formato Iso
        LocalDateTime fecha2 = LocalDateTime.now().plusDays(5);
        
        DateTimeFormatter isoFecha = DateTimeFormatter.ISO_LOCAL_DATE;
        System.out.println(fecha2.format(isoFecha));
      
        DateTimeFormatter isoHora = DateTimeFormatter.ISO_LOCAL_TIME;
        System.out.println(fecha2.format(isoHora));
        
        //Formato Propio
        LocalTime hora = LocalTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("'Son las' h 'y' mm");
        System.out.println(hora.format(f));
//        
        //OJO--> ERROR MM por mm confusión del mes y los minutos
        LocalDateTime hora2 = LocalDateTime.now();
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("hh_MM_YY");
        DateTimeFormatter f3 = DateTimeFormatter.ofPattern("hh_mm");
        System.out.println("Hora:mes = " + hora2.format(f2));
        System.out.println("Hora:minutos = " + hora2.format(f3));
        f3 = DateTimeFormatter.ofPattern("kk:mm");
        System.out.println("Hora:minutos = " + hora2.format(f3));
        System.out.println("Hora:mes = " + hora2.getDayOfWeek());
       
        //Parse
        LocalDateTime hoy3 = LocalDateTime.parse("2026-01-15T18:14:01.184");
        DateTimeFormatter f4 = DateTimeFormatter.ofPattern("'La fecha es' d 'del mes' MM 'del año' yyyy. 'Son las' kk 'horas'.");
        System.out.println(hoy3.format(f4));
        
    }

    
}
