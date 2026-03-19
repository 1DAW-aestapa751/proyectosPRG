public abstract class Agrupacion {

    public void cantar_la_presentacion(){
        System.out.println("Haciendo la presentación del "+this.getClass().getSimpleName()+" con nombre "+this.getNombre());
    }

    public abstract String getNombre();

    public abstract String getTipo();

    public void hacer_tipo() {
        System.out.println("El "+this.getClass().getSimpleName()+" "+this.getNombre()+" va de "+this.getTipo());
    }
}
