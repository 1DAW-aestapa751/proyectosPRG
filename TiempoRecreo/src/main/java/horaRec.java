import java.time.LocalDate;
import java.time.*;

public class horaRec {
    public static void main(String[] args){
        LocalTime rec = LocalTime.of(11, 30,0,0);
        Duration falta = Duration.between(LocalTime.now(), rec);
        System.out.println("Falta:"+falta.toHours()+":"+falta.toMinutes()+":"+falta.toSeconds());
    }
}
