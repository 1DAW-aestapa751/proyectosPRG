public class SmartPhone extends ProductoElectronico{
    protected String SO;
    protected int capacidad;
    protected int numeroDeTelefono;

    public SmartPhone(double precio, String modelo, String marca, String SO, int capacidad, int numeroDeTelefono) {
        super(precio, modelo, marca);
        this.SO = SO;
        this.capacidad = capacidad;
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public void hacerLLamada(){
        System.out.println("Llamando...");
    }

    public void enviarMensaje(){
        System.out.println("Enviando mensaje...");
    }

    @Override
    public void encender(){
        System.out.println("Encendiendo Movil...");
    }

    public String toString(){
        String res = super.toString();
        res += "SO:"+SO+"\n" +
                "capacidad:"+capacidad+"\n" +
                "numeroDeTelefono:"+numeroDeTelefono+"\n";
        return res;
    }
}
