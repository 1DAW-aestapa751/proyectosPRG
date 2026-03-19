public abstract class Materiales implements Comparable{
    protected String nombre;
    protected int masa;
    protected int resistenciaFuego;
    protected int disolucion;
    protected boolean movible;

    @Override
    public int compareTo(Object o) {
        Materiales c = (Materiales) o;
        int res = this.masa - c.getMasa();
        if (res == 0){
            res = this.nombre.compareTo(c.nombre);
        }
        return res;
    }

    public Materiales(String nombre, int masa, int resistenciaFuego, int disolucion, boolean movible) {
        this.nombre = nombre;
        if (masa > 1000 || masa < 0){
            this.masa = 0;
        }
        else{
            this.masa = masa;
        }
        if (resistenciaFuego > 100 || resistenciaFuego < 0){
            this.resistenciaFuego = 0;
        }
        else{
            this.resistenciaFuego = resistenciaFuego;
        }
        if (disolucion > 100 || disolucion < 0){
            this.disolucion = 0;
        }
        else{
            this.disolucion = masa;
        }
        this.movible = movible;
    }
    public String getNombre(){
        return nombre;
    }
    public int getMasa() {
        return masa;
    }

    public int getResistenciaFuego() {
        return resistenciaFuego;
    }

    public int getDisolucion() {
        return disolucion;
    }

    public boolean isMovible() {
        return movible;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }
}
