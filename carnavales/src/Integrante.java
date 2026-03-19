public class Integrante {
    private String nombre;
    private String localidad;
    private static int num = 1;
    private int numP;
    private int edad;

    public Integrante(String nombre){
        this.nombre = nombre;
        this.numP = num;
        num++;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumP() {
        return this.numP;
    }
}
