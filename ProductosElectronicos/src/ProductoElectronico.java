public abstract class ProductoElectronico implements Comparable{
    protected double precio;
    protected String modelo;
    protected String marca;

    public ProductoElectronico(double precio, String modelo, String marca) {
        this.precio = precio;
        this.modelo = modelo;
        this.marca = marca;
    }

    @Override
    public String toString() {
        String res = "precio:"+precio+"\n" +
                "modelo:"+modelo+"\n" +
                "marca:"+marca+"\n";
        return res;
    }

    @Override
    public int compareTo(Object o) {
        ProductoElectronico p = (ProductoElectronico) o;
        int orden = 0;
        if(this.marca.equals(p.marca)){
            orden = this.modelo.compareTo(p.modelo);
        }
        else{
            orden = this.marca.compareTo(p.marca);
        }
        return orden;
    }

    public double obtenerPrecio(){
        return this.precio;
    }

    public abstract void encender();
}
