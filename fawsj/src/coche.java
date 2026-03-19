public class coche implements Comparable{
    String marca;
    String matricula;
    int anioMatriculacion;

    public coche(String marca, int anioMatriculacion) {
        this.marca = marca;
        this.anioMatriculacion = anioMatriculacion;
    }

    @Override
    public String toString(){
        return this.marca+" : "+this.anioMatriculacion;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
