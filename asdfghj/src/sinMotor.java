public abstract class sinMotor extends vehiculo {
    private String tipoTraccion;

    public String getTipoTraccion() {
        return tipoTraccion;
    }

    public void setTipoTraccion(String tipoTraccion) {
        this.tipoTraccion = tipoTraccion;
    }

    @Override
    public String toString() {
        return super.toString() + " [tipoTraccion=" + tipoTraccion + "]";
    }

}
