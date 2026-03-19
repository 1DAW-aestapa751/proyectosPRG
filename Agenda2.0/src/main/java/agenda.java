import java.util.Arrays;

public class agenda {
    private contacto[] lista = new contacto[99];
    int nCont = 0;
    int eliminados = 0;

    public void addContact(contacto persona){  //Añadir contacto
        int i = -1;
        do {
            i++;
        } while (lista[i] != null);
        lista[i] = persona;
        this.nCont += 1;
        if (eliminados>0) {
            eliminados--;
        }
    }

    public void deleteContact(String nom){ //Borra el último contacto
        int i = 0;
        while (!nom.equals(lista[i].nombre) && !nom.equals(lista[i].numero) && i<this.nCont+eliminados){
            i++;
        }
        if (i == this.nCont+eliminados){
            System.out.println("No se ha encontrado el contacto");
        }
        else{
            lista[i] = null;
            System.out.println("Se ha eliminado el contacto");
            this.eliminados++;
        }
        this.nCont -= 1;
    }

    public void searchContact(String name){
        int coincidencias = 0;
        for (int i = 0; i < this.nCont; i++){
            if (lista[i].nombre.contains(name) || lista[i].numero.contains(name)){
                System.out.println("se ha encontrado el contacto "+(i+1)+". "+lista[i].nombre+" | "+lista[i].numero);
                coincidencias++;
            }
        }
        if (coincidencias == 0) {
            System.out.println("No se ha encontrado el contacto");
        }
    }

    public void showList(){
        for (int i = 0; i < (this.nCont+eliminados); i++){
            if (lista[i] != null) {
                System.out.println((i + 1) + ". " + lista[i].nombre + " | " + lista[i].numero);
            }
            else{
                System.out.println((i + 1) + ". Vacio");
            }
        }
    }
}
