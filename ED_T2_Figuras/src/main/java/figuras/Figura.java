package figuras;

public abstract class Figura {
    private int X;
    private int Y;

    public abstract float calcularPerimetro();
    public abstract float calcularArea();

    public void moverA(int X, int Y) {
        this.X = X;
        this.Y = Y;
    }
}
