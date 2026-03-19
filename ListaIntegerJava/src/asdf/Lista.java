package asdf;

import java.util.Arrays;

public class Lista {
    private Integer[] ls;

    public Lista(){
        this.ls = new Integer[0];
    }

    public Integer[] getLs() {
        return ls;
    }

    public int nElementos(){
        int contador = 0;
        for (int i = 0; i < ls.length; i++){
            if (ls[i] != null) {
                contador++;
            }
        }
        return contador;
    }

    public void insertarDelante(Integer num){
        this.ls = Arrays.copyOf(ls, ls.length + 1);
        this.ls[ls.length - 1] = num;
    }

    public void insertarDelante(Lista num){
        this.ls = Arrays.copyOf(ls, ls.length + num.getLs().length);
        for (int i = 0; i < num.getLs().length; i++){
            this.ls[ls.length - num.getLs().length + i] = num.getLs()[i];
        }
    }

    public void insertarDetras(Integer num){
        Integer[] copia = new Integer[ls.length+1];
        copia[0] = num;
        for (int i = 1; i < copia.length; i++) {
            copia[i] = ls[i-1];
        }
        this.ls = copia;
    }

    public void insertarIndex(Integer num, int index){
        Integer[] copia = new Integer[ls.length+1];
        copia[index] = num;
        int contador = 0;
        for (int i = 0; i < copia.length; i++) {
            if (i != index){
                copia[i] = ls[contador];
                contador++;
            }
        }
        this.ls = copia;
    }

    public void eliminarIndex(int index){
        Integer[] copia = new Integer[ls.length-1];
        int contador = 0;
        for (int i = 0; i < this.ls.length; i++) {
            if (i != index){
                copia[contador] = ls[i];
                contador++;
            }
        }
        this.ls = copia;
    }

    public Integer obtener(int index){
        return this.ls[index];
    }

    public int buscar(Integer num){
        int i = 0;
        while (i < this.ls.length && this.ls[i] != num){
            i++;
        }
        if (i == this.ls.length){
            i = -1;
        }
        return i;
    }

    public void imprimir(){
        System.out.print("( ");
        for (int i = 0; i < this.ls.length; i++) {
            System.out.print(this.ls[i]+" ");
        }
        System.out.println(")");
    }
}
