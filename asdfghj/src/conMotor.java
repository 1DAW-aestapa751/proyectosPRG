public abstract class conMotor extends vehiculo {
    private int cilindrada;
    private String combustible;

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    @Override
    public String toString() {
        return super.toString() + " [cilindrada=" + cilindrada + ", combustible=" + combustible + "]";
    }

}
