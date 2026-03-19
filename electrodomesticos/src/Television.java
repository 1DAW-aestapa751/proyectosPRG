public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television() {
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precio, int peso) {
        super(precio, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(double precio, colores color, char consumo, int peso, int resolucion, boolean sintonizadorTDT) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    @Override
    public double getPrecioFinal() {
        double precioFinal = super.getPrecioFinal();
        if (this.resolucion > 40) {
            precioFinal += precioFinal * 0.30;
        }
        if (this.sintonizadorTDT) {
            precioFinal += 50;
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Television{" +
                "precio=" + precio +
                ", color=" + color +
                ", consumo=" + consumo +
                ", peso=" + peso +
                ", resolucion=" + resolucion +
                ", sintonizadorTDT=" + sintonizadorTDT +
                ", precio final=" + getPrecioFinal() +
                '}';
    }

}
