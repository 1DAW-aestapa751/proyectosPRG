import com.misclases.Contacto;

public class Agenda {
    public static void main(String[] Args){
        Contacto nuevo = new Contacto("Álvaro Estévez Aparicio", "12345678Z");
        System.out.println("Contacto: "+nuevo.toString());
        System.out.println("Tras validar el DNI el resultado es: "+nuevo.esValido());
    }
}
