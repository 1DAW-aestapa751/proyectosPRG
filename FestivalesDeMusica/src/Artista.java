public class Artista {
    private String nombre;
    private String nif;
    private int nacimiento;
    private String discografica;
    private boolean grupo;

    public Artista(String nombre, String nif){
        this.nombre = nombre;
        this.nif = nif;
        if (this.nif.length()<9){
            do{
                this.nif = this.nif + "*";
            } while (this.nif.length()<9);
        }
        if (this.nif.length()>9){
            this.nif = this.nif.substring(0,9);
        }
    }
    public Artista(String nombre, String nif, String discografica){
        this.nombre = nombre;
        this.nif = nif;
        this.discografica = discografica;
        if (this.nif.length()<9){
            do{
                this.nif = this.nif + "*";
            } while (this.nif.length()<9);
        }
        if (this.nif.length()>9){
            this.nif = this.nif.substring(0,9);
        }
        if (discografica.length()>20){
            this.discografica = this.discografica.substring(0, 20);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNif(String nif) {
        this.nif = nif;
        if (this.nif.length()<9){
            do{
                this.nif = this.nif + "*";
            } while (this.nif.length()<9);
        }
        if (this.nif.length()>9){
            this.nif = this.nif.substring(0,9);
        }
    }

    public String getNif() {
        return nif;
    }

    public int getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getDiscografica() {
        return discografica;
    }

    public boolean isGrupo() {
        return grupo;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
        if (discografica.length()>20){
            this.discografica = this.discografica.substring(0, 20);
        }
    }

    public void setGrupo(boolean grupo) {
        this.grupo = grupo;
    }
}
