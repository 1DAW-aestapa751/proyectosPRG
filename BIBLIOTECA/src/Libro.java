public class Libro {
    private String titulo;
    private String autor;
    public static int CodigoG = 1;
    public static int totalLibros = 0;
    private int codigo;
    public enum genero{
        FICCION,
        ENSAYO,
        POESIA,
        INFANTIL
    }
    private genero genero;
    private double precio;
    private int stock;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Libro.genero getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getStock() {
        return stock;
    }


    public Libro(String titulo, String autor, genero genero, double precio, int stock) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.precio = precio;
        this.stock = stock;
        this.codigo = CodigoG;
        totalLibros++;
        CodigoG++;
        if (this.precio<0.50){
            this.precio = 0.50;
        }
        if (this.stock<1){
            this.stock = 1;
        }
        if (this.precio>50){
            this.precio = 50;
        }
        if (this.stock>50){
            this.stock = 50;
        }
    }

    public Libro(String titulo){
        this.titulo = titulo;
        this.autor = "";
        this.genero = genero.FICCION;
        this.precio = 0.50;
        this.stock = 1;
        this.codigo = CodigoG;
        totalLibros++;
        CodigoG++;
    }

    public static int totalLibros(){
        return totalLibros;
    }

}
