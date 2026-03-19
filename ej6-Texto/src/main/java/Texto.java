
import java.time.*;

public class Texto {

    private char[] caracteres;
    private LocalDate creacion;
    private LocalDateTime modificacion;

    public Texto(int size){
        this.caracteres = new char[size];
        this.modificacion = LocalDateTime.now();
        this.creacion = LocalDate.now();
    }

    public void mostrarTexto(){
        int ocupado = 0;
        for (int i=0; i<this.caracteres.length; i++){
            if(caracteres[i] != '\u0000'){
                ocupado++;
            }
        }
        for (int i = 0; i<ocupado; i++){
            System.out.print(caracteres[i]);
        }
        System.out.println();
    }

    public void addFront(char caracter){
        int ocupado = 0;
        for (int i=0; i<this.caracteres.length; i++){
            if(caracteres[i] != '\u0000'){
                ocupado++;
            }
        }
        if (ocupado+1 <= caracteres.length){
            this.caracteres[ocupado] = caracter;
        }
        else{
            System.out.println("no queda espacio suficiente");
        }
        this.modificacion = LocalDateTime.now();
    }

    public void addFront(String txt){
        int ocupado = 0;
        for (int i=0; i<this.caracteres.length; i++){
            if(caracteres[i] != '\u0000'){
                ocupado++;
            }
        }
        if (ocupado+txt.length() <= caracteres.length){
            for (int i=0; i<txt.length(); i++){
                caracteres[ocupado+i]=txt.charAt(i);
            }
        }
        else{
            System.out.println("no queda espacio suficiente");
        }
        this.modificacion = LocalDateTime.now();
    }

    public void addBack(char caracter){
        int ocupado = 0;
        for (int i=0; i<this.caracteres.length; i++){
            if(caracteres[i] != '\u0000'){
                ocupado++;
            }
        }
        if (ocupado+1 <= caracteres.length){
            char[] copia = new char[caracteres.length];
            copia[0] = caracter;
            for (int i = 0; i<ocupado; i++){
                copia[i+1] = caracteres[i];
            }
            for (int i=0; i<this.caracteres.length; i++){
                caracteres[i] = copia[i];
            }
        }
        else{
            System.out.println("no queda espacio suficiente");
        }
        this.modificacion = LocalDateTime.now();
    }

    public void addBack(String txt){
        int ocupado = 0;
        for (int i=0; i<this.caracteres.length; i++){
            if(caracteres[i] != '\u0000'){
                ocupado++;
            }
        }
        if (ocupado+txt.length() <= caracteres.length){
            char[] copia = new char[caracteres.length];
            for (int i = 0; i<txt.length(); i++){
                copia[i] = txt.charAt(i);
            }
            for (int i = 0; i<ocupado; i++){
                copia[i+txt.length()] = caracteres[i];
            }
            for (int i=0; i<this.caracteres.length; i++){
                caracteres[i] = copia[i];
            }
        }
        else{
            System.out.println("no queda espacio suficiente");
        }
        this.modificacion = LocalDateTime.now();
    }

    public int vocalesMayusculas(){
        int mayus = 0;
        for (int i = 0; i<caracteres.length; i++){
            if (caracteres[i] == 'A' || caracteres[i] == 'E' || caracteres[i] == 'I' || caracteres[i] == 'O' || caracteres[i] == 'U'){
                mayus++;
            }
        }
        return mayus;
    }

    public int vocalesMinusculas(){
        int minus = 0;
        for (int i = 0; i<caracteres.length; i++){
            if (caracteres[i] == 'a' || caracteres[i] == 'e' || caracteres[i] == 'i' || caracteres[i] == 'o' || caracteres[i] == 'u'){
                minus++;
            }
        }
        return minus;
    }

    public LocalDate getFechaCreacion() {
        return creacion;
    }

    public LocalDateTime getFechaHoraModificacion() {
        return modificacion;
    }
}
