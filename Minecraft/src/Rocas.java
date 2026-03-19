public class Rocas extends Materiales implements Mezclar{
    int dureza;
    public Rocas(String nombre, int masa, int resistenciaFuego, int disolucion, boolean movible, int dureza) {
        super(nombre, masa, resistenciaFuego, disolucion, movible);
        this.dureza = dureza;
    }
    public int getDureza(){
        return dureza;
    }
    @Override
    public String toString(){
        return "Rocas{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", resistenciaFuego=" + resistenciaFuego +
                ", disolucion=" + disolucion +
                ", movible=" + movible +
                ", dureza=" + dureza +
                '}';

    }

    @Override
    public void MezclarConMaterial(Materiales material) {
        System.out.println("Crafteo disponible:");
        if (material.getClass().getSimpleName().equals("Rocas")){
            System.out.println("Pizarra");
        }
        if (material.getClass().getSimpleName().equals("Metal")){
            System.out.println("Magnetita");
        }
        if (material.getClass().getSimpleName().equals("Cristal")){
            System.out.println("Cuarzo");
        }
    }

}
