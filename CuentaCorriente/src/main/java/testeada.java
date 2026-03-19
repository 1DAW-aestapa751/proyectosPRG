public class testeada {
    public static void main(String[] args){
        CuentaCorriente c1 = new CuentaCorriente("12345678X", "XXX XXX XXX", 50);
        System.out.println(c1.nombreTitular);
        System.out.println(c1.dni);
        c1.meterDinero(100);
        c1.sacarDinero(50);
        c1.mostrarInfo();
        c1.cambiarBanco("BBVA");
    }
}
