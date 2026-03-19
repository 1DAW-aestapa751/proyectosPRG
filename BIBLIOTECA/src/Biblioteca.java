import java.util.Arrays;

public class Biblioteca {
    private String nombre;
    private String localidad;
    private Libro[] libros;
    public String red = "RED DE BIBLIOTECAS PÚBLICAS";

    public Biblioteca(String nombre){
        this.nombre = nombre;
        this.localidad = "";
        this.libros = new Libro[0];
    }

    public void addLibro(Libro libro){
        this.libros = Arrays.copyOf(this.libros, this.libros.length+1);
        this.libros[this.libros.length] = libro;
    }

    public boolean borrarLibro(int codigo){
        Libro[] copia = new Libro[this.libros.length-1];
        boolean encontrado = false;
        int contador = 0;
        for (int i = 0; i < this.libros.length; i++){
            if (this.libros[i].getCodigo() == codigo) {
                encontrado = true;
                for (int j = 0; j < this.libros.length; j++){
                    if (this.libros[j].getCodigo() != codigo){
                        copia[contador] = this.libros[j];
                        contador++;
                    }
                }
                this.libros = copia;
            }
        }
        return encontrado;
    }

    public void mostrarCatalogo(){
        for (int i = 0; i < this.libros.length; i++){
            System.out.println(this.libros[i].getTitulo());
        }
    }

    public double calcularValorStock(){
        double valor = 0;
        for (int i = 0; i < this.libros.length; i++){
            valor += this.libros[i].getPrecio();
        }
        return valor;
    }
}
