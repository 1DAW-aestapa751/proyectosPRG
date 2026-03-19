public class CuentaCorriente {
    String dni = "";
    public String nombreTitular = "";
    private int  saldo = 0;
    private String nombreBanco = "Santander";

    public CuentaCorriente(String dni, String nombreTitular){
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = 0;
    }
    public CuentaCorriente(String dni, int saldo){
        this.dni = dni;
        this.saldo = saldo;
    }
    public CuentaCorriente(String dni, String nombreTitular, int saldo){
        this.dni = dni;
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void meterDinero(int cantidad){
        saldo = saldo+cantidad;
    }

    public void sacarDinero(int cantidad){
        if (cantidad<=saldo){
            saldo = saldo-cantidad;
        }
        else{
            System.out.println("Error");
        }
    }

    public void mostrarInfo(){
        System.out.println("dni = "+dni);
        System.out.println("nombre del titular ="+nombreTitular);
        System.out.println("saldo = "+saldo);
        System.out.println("Banco "+nombreBanco);
    }

    public void cambiarBanco(String nombreBanco){
        nombreBanco
        System.out.println("tu banco se ha cambiado a "+nombreBanco);
    }


}
