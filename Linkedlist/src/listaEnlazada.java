public class listaEnlazada {
        Nodo cabeza; // primer nodo

        public void agregar(int valor) {
            Nodo nuevo = new Nodo(valor);

            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Nodo actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }

        public void mostrar() {
            Nodo actual = cabeza;
            while (actual != null) {
                System.out.println(actual.dato);
                actual = actual.siguiente;
            }
        }
}
