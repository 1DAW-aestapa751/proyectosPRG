package seis;

public class CajaCarton extends Caja{
    public CajaCarton(double ancho, double alto, double profundidad) {
        super(ancho, alto, profundidad, Unidades.cm);
    }

    @Override
    public double getVolumen() {
        return super.getVolumen() * 0.8;
    }
}
