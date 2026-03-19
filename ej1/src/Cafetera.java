public class Cafetera {
    private int capacidadMaxima;
    private int cantidadActual;
    public Persona owner;
    private static final Persona pepe = new Persona("Pepe", "12345678A");

    public Cafetera() {
        this.capacidadMaxima = 1000;
        this.cantidadActual = 0;
        this.owner = pepe;
    }

    public Cafetera(int capacidadMaxima, int cantidadActual, Persona owner) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
        this.owner = owner;
        if (this.cantidadActual > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    public void llenarCafetera() {
        this.cantidadActual = this.capacidadMaxima;
    }

    public void servirTaza(int cantidad){
        this.cantidadActual -= cantidad;
        if (this.cantidadActual < 0){
            this.cantidadActual = 0;
        }
    }

    public void vaciarCafetera(){
        this.cantidadActual = 0;
    }

    public void agregarCafe(int cantidad){
        this.cantidadActual += cantidad;
        if (this.cantidadActual > this.capacidadMaxima){
            this.cantidadActual = this.capacidadMaxima;
        }
    }

    public void mostrarCafeDisponible(){
        System.out.println("La cafetera de "+this.owner+" tiene "+this.cantidadActual+"ml de café");
    }
}
