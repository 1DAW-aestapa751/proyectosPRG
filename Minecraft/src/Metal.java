public class Metal extends Materiales implements Mezclar{
    private boolean imantable;
    public Metal(String nombre, int masa, int resistenciaFuego, int disolucion, boolean movible, boolean imantable) {
        super(nombre, masa, resistenciaFuego, disolucion, movible);
        this.imantable = imantable;
    }
    public boolean getImantable(){
        return imantable;
    }

    @Override
    public String toString(){
        return "Metal{" +
                "nombre='" + nombre + '\'' +
                ", masa=" + masa +
                ", resistenciaFuego=" + resistenciaFuego +
                ", disolucion=" + disolucion +
                ", movible=" + movible +
                ", imantable=" + imantable +
                '}';

    }

    @Override
    public void MezclarConMaterial(Materiales material) {
        System.out.println("Crafteo disponible:");
        if (material.getClass().getSimpleName().equals("Rocas")){
            System.out.println("Magnetita");
        }
        if (material.getClass().getSimpleName().equals("Metal")){
            System.out.println("Acero");
        }
        if (material.getClass().getSimpleName().equals("Cristal")){
            System.out.println("Espejo");
        }
    }
}
