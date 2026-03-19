package seis;

public class Caja {
    private double ancho;
    private double alto;
    private double profundidad;
    private Unidades u;

    public Caja(double ancho, double alto, double profundidad, Unidades u){
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
        this.u = u;
    }

    public double getVolumen(){
        double volumen = ancho * alto * profundidad;
        return volumen;
    }

    @Override
    public String toString(){
        String r = ancho + " " + u + " x " + alto + " " + u + " x " + profundidad + " " + u;
        return r;
    }

}
