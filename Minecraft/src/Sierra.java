public class Sierra extends Herramienta{
    private int diametro;
    public Sierra(String nombre, int masa, int resistenciaFuego, int disolucion, boolean movible, int diametro) {
        super(nombre, masa, resistenciaFuego, disolucion, movible);
        this.diametro = diametro;
    }
    public int getDiametro() {
        return diametro;
    }
    @Override
    public String toString(){
        return "Sierra{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", resistenciaFuego=" + resistenciaFuego +
                ", disolucion=" + disolucion +
                ", movible=" + movible +
                ", diametro=" + diametro +
                '}';

    }

}
