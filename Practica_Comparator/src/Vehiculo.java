public class Vehiculo implements Comparable {
    protected String marca;
    protected String modelo;

    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public int compareTo(Object o) {
        int resultado = 0;
        Vehiculo a1 = (Vehiculo) o;
        resultado = this.marca.compareTo(a1.marca);
        if(resultado == 0){
            resultado = this.modelo.compareTo(a1.modelo);
        }
        return resultado;
    }

    public String toString(){
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo +
                '}';
    }

}
