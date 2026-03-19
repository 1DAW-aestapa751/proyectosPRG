public class Coche extends Vehiculo implements Comparable{
    private String matricula;

    public Coche(String marca, String modelo, String matricula){
        super(marca, modelo);
        this.matricula = matricula;
    }

    public Coche(String marca, String modelo){
        super(marca, modelo);
    }

    public String toString(){
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", matricula='" + matricula + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o){
        int resultado = 0;
        if (o instanceof Coche){
            Coche a = (Coche) o;
            if(this.matricula != null && a.matricula == null){
                resultado = -1;
            }
            else if(this.matricula == null && a.matricula !=null){
                resultado = 1;
            }
            else if (this.matricula != null && a.matricula != null){
                resultado = this.matricula.compareTo(a.matricula);
            }
            else{
                resultado = super.compareTo(a);
            }
        }
        else{
            resultado = super.compareTo(o);
        }
        return resultado;

    }
}
