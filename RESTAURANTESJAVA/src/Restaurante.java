import java.util.Arrays;

public class Restaurante {
    private String nombre;
    private Empleado[] listaEmpleados;
    private Plato[] listaPlatos;
    public static String cadena = "BAR MANOLO";

    public Restaurante(String nombre){
        this.nombre = nombre;
        this.listaEmpleados = new Empleado[0];
        this.listaPlatos = new Plato[0];
    }

    public void addPlato(Plato plato){
        this.listaPlatos = Arrays.copyOf(this.listaPlatos, this.listaPlatos.length + 1);
        this.listaPlatos[this.listaPlatos.length - 1] = plato;
    }

    public void addEmpleado(Empleado empleado){
        this.listaEmpleados = Arrays.copyOf(this.listaEmpleados, this.listaEmpleados.length + 1);
        this.listaEmpleados[this.listaEmpleados.length - 1] = empleado;
    }

    public void eliminarEmpleado(int codigo){
        for (int i = 0; i < this.listaEmpleados.length; i++){
            if (this.listaEmpleados[i].getCodigo() == codigo){
                Empleado.totalEmpleados--;
                Empleado[] copiaLista = new Empleado[this.listaEmpleados.length - 1];
                int contador = 0;
                for (int j = 0; j < this.listaEmpleados.length; j++){
                    if (this.listaEmpleados[j].getCodigo() != codigo){
                        copiaLista[contador] = this.listaEmpleados[j];
                        contador++;
                    }
                }
                this.listaEmpleados = copiaLista;
            }
        }
    }

    public void mostrarPlatos(){
        for (int i = 0; i < this.listaPlatos.length; i++){
            System.out.println("plato "+(i + 1)+". "+this.listaPlatos[i].getPlato());
        }
    }

    public void totalPlatos(){
        System.out.println("Total de platos: " + Plato.totalPlatos);
    }

    public void mostrarEmpleados(){
        for (int i = 0; i < this.listaEmpleados.length; i++){
            System.out.println("empleado "+(i + 1)+". "+this.listaEmpleados[i].getNombreCompleto());
            System.out.println("codigo: "+this.listaEmpleados[i].getCodigo());
            System.out.println("telefono: "+this.listaEmpleados[i].getTelefono());
            System.out.println("fecha de contratacion: "+this.listaEmpleados[i].getFechaContr());
            System.out.println("oficio: "+this.listaEmpleados[i].getOficio());
            System.out.println();
        }
    }
}
