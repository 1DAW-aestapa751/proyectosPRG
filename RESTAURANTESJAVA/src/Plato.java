public class Plato {
    public static int totalPlatos;
    private String plato;
    private double precio;
    public enum TipoPlato {
        TAPA,
        MEDIA,
        RACION,
        MENU
    }
    private Plato.TipoPlato categoria;
    private int unidadesDisponibles;

    public Plato(String plato, double precio, Plato.TipoPlato categoria, int unidadesDisponibles){
        this.plato = plato;
        this.precio = precio;
        this.categoria = categoria;
        this.unidadesDisponibles = unidadesDisponibles;
        if (this.precio < 0.01){
            this.precio = 0.01;
        }
        if (this.precio > 999.99){
            this.precio = 999.99;
        }
        if (this.unidadesDisponibles < 1){
            this.unidadesDisponibles = 1;
        }
        if (this.unidadesDisponibles > 1000) {
            this.unidadesDisponibles = 1000;
        }
        if (this.categoria == null){
            this.categoria = TipoPlato.TAPA;
        }
        totalPlatos++;
    }

    public Plato(String plato, double precio){
        this.plato = plato;
        this.precio = precio;
        if (this.precio < 0.01){
            this.precio = 0.01;
        }
        if (this.precio > 999.99){
            this.precio = 999.99;
        }
        this.categoria = TipoPlato.TAPA;
        this.unidadesDisponibles = 1;
        totalPlatos++;
    }

    public static int getTotalPlatos(){
        return totalPlatos;
    }

    public String getPlato(){
        return plato;
    }

    public double getPrecio(){
        return precio;
    }

    public Plato.TipoPlato getCategoria(){
        return categoria;
    }

    public int getUnidadesDisponibles(){
        return unidadesDisponibles;
    }

    public void mostrarDatos(){
        System.out.println("Plato: " + this.plato);
        System.out.println("Precio: " + this.precio);
        System.out.println("Categoria: " + this.categoria);
        System.out.println("Unidades disponibles: " + this.unidadesDisponibles);
        System.out.println();
    }
}
