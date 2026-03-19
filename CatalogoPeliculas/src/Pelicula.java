public class Pelicula {
    private static final String productoraD = "WARNER";
    private String productora;
    private String titulo;
    private String director;
    private int year;
    private String genero;

    public Pelicula(String titulo, int year, String genero){
        this.productora = productoraD;
        this.titulo = titulo;
        this.director = "";
        this.year = year;
        this.genero = genero;
        if (this.titulo.length()>30){
            this.titulo = this.titulo.substring(0,30);
        }
        if (this.year<1900){
            this.year = 1900;
        }
    }

    public Pelicula(String titulo, int year, String genero, String director){
        this.productora = productoraD;
        this.titulo = titulo;
        this.director = director;
        this.year = year;
        this.genero = genero;
        if (this.titulo.length()>30){
            this.titulo = this.titulo.substring(0,30);
        }
        if (this.year<1900){
            this.year = 1900;
        }
    }

    public void addGenero(String genero){
        if (!this.genero.contains(genero)){
            this.genero = this.genero+"/"+genero;
        }
    }

    public String getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getYear() {
        return year;
    }

    public String getProductora() {
        return productora;
    }
}
