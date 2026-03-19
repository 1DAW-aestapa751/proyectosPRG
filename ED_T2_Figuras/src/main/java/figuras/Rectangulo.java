package figuras;

public class Rectangulo {
    private int largo;
    private int ancho;

    public Rectangulo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    public float calcularPerimetro(){
        int i = (largo * 2) / (ancho * 2);
        return i;
    }
    public float calcularArea() {
        return largo*ancho;
    }
}
