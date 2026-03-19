import java.util.Arrays;

public abstract class AgrupacionOficial extends Agrupacion{
    private int puntos;
    private Integrante[] part;

    public AgrupacionOficial(){
        part = new Integrante[0];
    }

    public void insertar_integrante(Integrante i){
        part = Arrays.copyOf(part, part.length+1);
        part[part.length-1] = i;
    }

    public boolean eliminar_integrante(Integrante i){
        boolean resultado = false;
        for (int j = 0; j<part.length;j++){
            if (part[j].getNumP() == i.getNumP()){
                Integrante[] copia = new Integrante[part.length-1];
                for (int x = 0; x<copia.length; x++){
                    if (part[x].getNumP() != i.getNumP()){
                        copia[x] = part[x];
                    }
                }
                part = copia;
                resultado = true;
            }
        }
        return resultado;
    }

    public void caminito_del_falla(){
        System.out.println("el "+this.getClass().getSimpleName()+" "+this.getNombre()+" va caminito del falla");
    }
}
