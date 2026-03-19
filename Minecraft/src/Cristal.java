public class Cristal extends Materiales implements Mezclar{
    public enum TipoCristal{
        Transparente,
        Translucido
    }
    private TipoCristal tipo;
    public Cristal(String nombre, int masa, int resistenciaFuego, int disolucion, boolean movible, TipoCristal tipo) {
        super(nombre, masa, resistenciaFuego, disolucion, movible);
        this.tipo = tipo;
    }
    public TipoCristal getTipo(){
        return tipo;
    }

    @Override
    public String toString(){
        return "Cristal{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", resistenciaFuego=" + resistenciaFuego +
                ", disolucion=" + disolucion +
                ", movible=" + movible +
                ", tipo=" + tipo +
                '}';

    }

    @Override
    public void MezclarConMaterial(Materiales material) {
        System.out.println("Crafteo disponible:");
        if (material.getClass().getSimpleName().equals("Rocas")){
            System.out.println("Cuarzo");
        }
        if (material.getClass().getSimpleName().equals("Metal")){
            System.out.println("Espejo");
        }
        if (material.getClass().getSimpleName().equals("Cristal")){
            System.out.println("Cristal perlado");
        }
    }
}
