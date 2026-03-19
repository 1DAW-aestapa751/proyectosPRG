import java.time.LocalDate;

public class Empleado {
    public static int totalEmpleados;
    public static int codigoEmpleados;
    private String nombre;
    private String apellido;
    private String nombreCompleto;
    private int codigo;
    private int telefono;
    private LocalDate fechaContr;
    public enum tipoEmpleado{
        CAMARERO,
        COCINERO,
        GERENTE,
        RESPONSABLE
    }
    private tipoEmpleado oficio;

    public Empleado(String nombre, String apellido, int telefono, tipoEmpleado oficio){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreCompleto = this.nombre+" "+this.apellido;
        this.telefono = telefono;
        this.fechaContr = LocalDate.now();
        this.oficio = oficio;
        this.codigo = codigoEmpleados;
        codigoEmpleados++;
        totalEmpleados++;
    }

    public Empleado(String nombre, String apellido, int telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreCompleto = this.nombre+" "+this.apellido;
        this.telefono = telefono;
        this.fechaContr = LocalDate.now();
        this.oficio = tipoEmpleado.CAMARERO;
        this.codigo = codigoEmpleados;
        codigoEmpleados++;
        totalEmpleados++;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: " + this.nombreCompleto);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Fecha de contratacion: " + this.fechaContr);
        System.out.println("Oficio: " + this.oficio);
        System.out.println();
    }

    public static int getTotalEmpleados(){
        return totalEmpleados;
    }

    public String getNombreCompleto(){
        return nombreCompleto;
    }

    public int getCodigo(){
        return codigo;
    }

    public int getTelefono(){
        return telefono;
    }

    public LocalDate getFechaContr(){
        return fechaContr;
    }

    public tipoEmpleado getOficio(){
        return oficio;
    }

}
