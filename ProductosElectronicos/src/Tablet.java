public class Tablet extends ProductoElectronico{
    protected int pulgadas;
    protected int resolucion;
    protected int capacidad;

    public Tablet(double precio, String modelo, String marca,int pulgadas, int resolucion, int capacidad) {
        super(precio, modelo, marca);
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.capacidad = capacidad;
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo Tablet...");
    }

    public String toString(){
        String res = super.toString();
        res += "pulgadas:"+pulgadas+"\n" +
                "resolucion:"+resolucion+"\n" +
                "capacidad:"+capacidad+"\n";
        return res;
    }

    public void navegarWeb(){
        System.out.println("Navegando Web...");
    }

    public void verVideos(){
        System.out.println("Ver videos...");
    }

}
