public class cuentaBancaria {
    public static int dinero = 20;

    public static void main(String[] args) {
        System.out.println(dinero);
        retirarDinero(10);
        System.out.println(dinero);
        retirarDinero(10);
        System.out.println(dinero);
        retirarDinero(10);
        System.out.println(dinero);
    }

    public static void retirarDinero(int cantidad) {
        try {
            if (dinero - cantidad < 0) {
                throw new SaldoInsuficienteException("No tienes suficiente dinero");
            }
            dinero -= cantidad;
        } catch (SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }
}
