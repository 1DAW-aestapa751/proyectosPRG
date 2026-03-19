public class Lavadora extends Electrodomestico {
    private int carga;

    public Lavadora() {
        super();
        this.carga = 5;
    }

    public Lavadora(double precio, int peso) {
        super(precio, peso);
        this.carga = 5;
    }

    public Lavadora(double precio, colores color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    @Override
    public double getPrecioFinal() {
        double precioFinal = super.getPrecioFinal();
        if (this.carga > 30) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precio=" + precio +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", carga=" + carga +
                ", precio final=" + getPrecioFinal() +
                '}';
    }

}
