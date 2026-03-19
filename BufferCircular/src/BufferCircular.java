public class BufferCircular {
    private Integer[] arrayInt;
    private int posAct;
    private int posAntiguo;

    public BufferCircular(){
        arrayInt = new Integer[10];
        posAct = 0;
        posAntiguo = 0;
    }

    public boolean insertar(Integer num){
        boolean resultado = false;
        if (arrayInt[posAct] == null){
            arrayInt[posAct] = num;
            if (posAct == arrayInt.length-1){
                posAct = 0;
            }
            else{
                posAct++;
            }
            resultado = true;
        }
        return resultado;
    }

    public Integer leer(){
        Integer leido = null;
        if (arrayInt[posAntiguo] != null){
            leido = arrayInt[posAntiguo];
            arrayInt[posAntiguo] = null;
            if (posAntiguo == arrayInt.length-1){
                posAct = 0;
            }
            else{
                posAntiguo++;
            }
        }
        return leido;
    }

    public void mostrarBuffer(){
        System.out.print("( ");
        for (int i = 0; i<arrayInt.length ; i++){
            if (arrayInt[i] == null){
                System.out.print("- ");
            }
            else{
                System.out.print(arrayInt[i]+" ");
            }
        }
        System.out.print(")");
        System.out.println();
    }

    public int estadoBuffer(){
        int usado = 0;
        for(int i = 0; i<arrayInt.length ; i++){
            if (arrayInt[i] != null){
                usado++;
            }
        }
        return usado*10;
    }
}
