package exameneedd;

import java.util.Arrays;

public class Dicotomia {
    
    public static void main(String[] args) {
        int[] numerosIniciales = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int [] valoresBuscados = {3,2,7,11,18};
        int [] arraysalida1 = new int [0];
        int [] arraysalida2 = new int [0];
        
        //PRIMERA BÚSQUEDA
        System.out.println("PRIMERA BÚSQUEDA");
        for (int i=0; i<valoresBuscados.length ;i++){
            int v = valoresBuscados[i];
            int resultado = busquedaImpares(numerosIniciales, v);
            if(analizaResultado(resultado, v)){
                arraysalida1 = Arrays.copyOf(arraysalida1,arraysalida1.length +1);
                arraysalida1[arraysalida1.length -1] = v;
            }
        }
        
        System.out.println("SEGUNDA BÚSQUEDA");
        for (int i=0; i<valoresBuscados.length ;i++){
            int v2 = valoresBuscados[i];
            int resultado = busquedaPares(numerosIniciales, v2);
            if(!analizaResultado(resultado, v2)){
                arraysalida2= Arrays.copyOf(arraysalida2,arraysalida2.length +1);
                arraysalida2[arraysalida2.length -1] = v2;
            }
        }
        
    }
    
    public static int busquedaImpares(int[] array, int v) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == v) {
                return i;
            }
        }
        return -1;
    }
    
    public static int busquedaPares(int[] array, int v) {
        int pos = -1;
        boolean encontrado= false;
        int izquierda = 0;
        int derecha = array.length - 1;
        while (izquierda <= derecha && !encontrado) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (array[medio] == v) {
                pos = medio;
                encontrado=true;
            } else if (array[medio] < v) {
                izquierda = medio + 1; 
            } else {
                derecha = medio - 1; 
            }
        }
        return pos; 
    }

    public static boolean analizaResultado(int resultado, int v) {
        boolean encontrado = false;
        if (resultado != -1) {
                System.out.println("Valor encontrado en la posición: " + resultado);
                encontrado = true;
        } else {
                System.out.println("Valor no encontrado: " + v);
        }
        return encontrado;
    }
}
