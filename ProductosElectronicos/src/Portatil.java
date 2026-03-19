public class Portatil extends ProductoElectronico{
    protected int pulgadas;
    protected int capacidad;
    protected int ram;

    public Portatil(double precio, String modelo, String marca, int pulgadas, int capacidad, int ram) {
        super(precio, modelo, marca);
        this.pulgadas = pulgadas;
        this.capacidad = capacidad;
        this.ram = ram;
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo Portátil...");
    }

    @Override
    public String toString() {
        String res = super.toString();
        res += "pulgadas:" + pulgadas + "\n" +
                "capacidad:" + capacidad + "\n" +
                "ram:" + ram + "\n";
        return res;
    }

    public void iniciarPrograma() {
        System.out.println("Ejecutando programa...");
    }

    public void apagar() {
        System.out.println("Apagando portátil...");
    }

}
