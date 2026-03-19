public class Pico extends Herramienta implements Minar{
    int nigga;
    private int grosor;
    public Pico(String nombre, int masa, int resistenciaFuego, int disolucion, boolean movible, int grosor) {
        super(nombre, masa, resistenciaFuego, disolucion, movible);
        this.grosor = grosor;
    }
    public int getGrosor() {
        return grosor;
    }

    @Override
    public String toString(){
        return "Pico{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", resistenciaFuego=" + resistenciaFuego +
                ", disolucion=" + disolucion +
                ", movible=" + movible +
                ", grosor=" + grosor +
                '}';

    }

    public void deshacer(Materiales material){
        material.setMasa(material.getMasa()-100);
        if (material.getMasa()<0){
            material.setMasa(0);
        }
    }

    public void hacer(Materiales material){
        material.setMasa(material.getMasa()+100);
    }
}
