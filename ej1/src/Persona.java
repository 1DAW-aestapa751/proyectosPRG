public class Persona {
    private String nombre;
    private int edad;
    private String DNI;
    private double peso;
    private double altura;
    private static final char sexoD = 'H';
    private char sexo;
    private Corazon corazon;

    public Persona(){
        this.nombre = "";
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0.0;
        this.sexo = sexoD;
        this.DNI = "";
        this.corazon = new Corazon();
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public Persona(String nombre, int edad, String DNI, double peso, double altura, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
        this.DNI = DNI;
    }

    public Persona(String nombre, String DNI){
        this.nombre = nombre;
        this.edad = 0;
        this.peso = 0.0;
        this.altura = 0.0;
        this.sexo = sexoD;
        this.DNI = DNI;
    }

    public int calcularIMC(){
        double imc = this.peso / (this.altura * this.altura);
        int respuesta;
        if (imc < 20){
            respuesta = -1;
        } else if (imc >= 20 && imc <= 25){
            respuesta = 0;
        } else {
            respuesta = 1;
        }
        return respuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

}
