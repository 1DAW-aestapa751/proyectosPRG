public class Main {
    public static void main(String[] args){
        Restaurante restaurante = new Restaurante("Bar Manolo");
        Plato chocos = new Plato("Chocos", 2.5);
        Plato tortilla = new Plato("Tortilla", 3.0, Plato.TipoPlato.TAPA, 10);
        Plato paella = new Plato("Paella", 12.0, Plato.TipoPlato.RACION, 30);
        restaurante.addPlato(chocos);
        restaurante.addPlato(tortilla);
        restaurante.addPlato(paella);
        Empleado carlos = new Empleado("Carlos", "Perez", 123456789);
        Empleado ana = new Empleado("Ana", "Lopez", 987654321);
        Empleado juan = new Empleado("Juan", "Garcia", 666777888, Empleado.tipoEmpleado.GERENTE);
        restaurante.addEmpleado(carlos);
        restaurante.addEmpleado(ana);
        restaurante.addEmpleado(juan);
        restaurante.eliminarEmpleado(0);
        restaurante.mostrarPlatos();
        restaurante.totalPlatos();
        restaurante.mostrarEmpleados();
    }
}