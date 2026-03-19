package biblioteca;

import java.util.Arrays;

public class Libro {
    private String autor;
    private String titulo;
    private int ejemplaresVendidos;
    private Libro secuela;
    private Libro precuela;

    public Libro(String titulo, String autor) {
        setTitulo (titulo);
        this.ejemplaresVendidos = 0;
        setAutor(autor);
    }

    public String obtenerInformacion (){
        return "El libro " + this.getTitulo() + " es de " + this.getAutor() + " y ha vendido un total " +
                this.ejemplaresVendidos + " ejemplares vendidos";
    }

    public void registrarVenta (int cantidadVendido){
        this.ejemplaresVendidos += cantidadVendido;
    }

    public String obtenerTituloPrecuela (){
        String precuela = "";
        if(this.precuela !=null){
            precuela = this.precuela.getTitulo();
        }
        else{
            precuela = "<NINGUNA>";
        }
        return "La precuela de " + this.getTitulo()+ " es: " + precuela;
    }
    public String obtenerTituloSecuela (){
        String secuela = "";
        if(this.secuela !=null){
            secuela = this.secuela.getTitulo();
        }
        else{
            secuela = "<NINGUNA>";
        }
        return "La secuela de " + this.getTitulo()+ " es: " + secuela;
    }

    public void mostrarResumenSaga (){
        Libro primero = this;
        Libro ultimo = this;
        int miPosicion = 1; // cuento el this
        int total = 0; // no cuento el this, ya que antes lo conte
        int ejemplaresVendidos = this.getEjemplaresVendidos(); // lo inicializo con los ejemplares de this
        while (ultimo.precuela!=null){ //Miro directamente la precuela
            ultimo = ultimo.getPrecuela(); // cambio a su precuela
            ejemplaresVendidos += ultimo.getEjemplaresVendidos(); // sumo sus ejemplares
            miPosicion++; //suma mi posicion
        }
        while(primero.getSecuela() !=null){ //Miro directamente la secuela
            primero = primero.getSecuela(); //cambio a su secuela
            ejemplaresVendidos += primero.getEjemplaresVendidos(); // Sumo sus ejemplares
            total ++; //sumo el total
        }
        total += miPosicion; // sumo el recorido del primer bucle con el segundo
        System.out.println("El libro " + this.titulo + " es el numero " + miPosicion + " de una saga que tiene un total de " + total
                + " libros que ha vendido " + ejemplaresVendidos + " ejemplares" );

    }

    public void anadirSecuela (Libro secuela){
        this.secuela = secuela;
        if(secuela !=null){
            this.secuela.precuela = this;
        }
    }

    public void anadirPrecuela (Libro precuela){
        this.precuela = precuela;
        if(precuela !=null){
            this.precuela.secuela = this;
        }
    }

    public Libro[] obtenerSaga (){
        Libro actual = this;
        while(actual.getPrecuela() !=null){
            actual = actual.getPrecuela();
        }

        int tamanio = 0;
        Libro auxiliar = actual;
        while (auxiliar != null){
            auxiliar = auxiliar.getSecuela();
            tamanio++;
        }

        Libro [] arraysLibros= new Libro[tamanio];
        int i = 0;
        while(actual !=null){
            arraysLibros [i] = actual;
            i++;
            actual = actual.getSecuela();
        }
        return arraysLibros;
    }

    // NUEVAS MODIFICACIONES

    public void anadirAnteriorEnSaga(Libro nuevo){
        //la secuela del libro nuevo será el libro actual
        nuevo.setSecuela(this);
        if(this.precuela != null){
            //la precuela del libro nuevo pasa a ser la precuela del actual si tiene precuela
            nuevo.setPrecuela(this.getPrecuela());
            //la secuela de la precuela del libro actual pasa a ser el nuevo
            this.precuela.setSecuela(nuevo);
        }
        //La precuela del libro actual será el libro nuevo
        this.setPrecuela(nuevo);
    }

    public Libro[] obtenerLibrosAnteriores(){
        Libro actual = this;
        Libro[] anteriores = new Libro[0];
        //se recorren todas las precuelas y se añaden a la array una a una.
        while (actual.precuela != null){
            actual = actual.precuela;
            anteriores = Arrays.copyOf(anteriores, anteriores.length+1);
            anteriores[anteriores.length-1] = actual;
        }
        return anteriores;
    }



    //Geters and Setters


    public Libro getSecuela() {
        return secuela;
    }

    public void setSecuela(Libro secuela) {

        this.secuela = secuela;
    }

    public Libro getPrecuela() {
        return precuela;
    }

    public void setPrecuela(Libro precuela) {

        this.precuela = precuela;
    }

    public int getEjemplaresVendidos() {
        return ejemplaresVendidos;
    }

    public void setEjemplaresVendidos(int ejemplaresVendidos) {
        this.ejemplaresVendidos = ejemplaresVendidos;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if(autor ==null){
            this.autor = "<NINGUNO>";
        }
        else{
            this.autor = autor;
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if(titulo ==null){
            this.titulo = "<NINGUNO>";
        }
        else{
            this.titulo = titulo;
        }
    }
}
