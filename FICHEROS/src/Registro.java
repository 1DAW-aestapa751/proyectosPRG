import java.io.Serializable;
import java.time.LocalDateTime;

public class Registro implements Serializable {
    LocalDateTime ldt;
    double temperatura;

    public Registro(double temperatura){
        this.ldt = LocalDateTime.now();
        this.temperatura = temperatura;
    }
}
