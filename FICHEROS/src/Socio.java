import java.io.Serializable;

public class Socio implements Serializable {
    String nombre;
    int edad;

    public Socio(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
}
