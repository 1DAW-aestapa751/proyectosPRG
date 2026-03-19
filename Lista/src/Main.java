public class Main{
    public static void main(String[] args){
        Lista lista = new Lista();
        lista.insertarDelante(1);
        lista.insertarDelante(2);
        lista.insertarDelante(3);
        lista.insertarDelante(4);
        lista.imprimir();
        lista.insertarDetras(0);
        lista.imprimir();
        lista.insertarIndex(5, 2);
        lista.imprimir();
        lista.eliminarIndex(2);
        lista.imprimir();
        System.out.println(lista.obtener(2));
        System.out.println(lista.buscar(3));
    }
}