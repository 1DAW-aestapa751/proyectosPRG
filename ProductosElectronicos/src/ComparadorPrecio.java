import java.util.Comparator;

public class ComparadorPrecio implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        ProductoElectronico p1 = (ProductoElectronico) o1;
        ProductoElectronico p2 = (ProductoElectronico) o2;
        int res = Double.compare(p1.obtenerPrecio(), p2.obtenerPrecio());
        if (res==0){
            return p1.compareTo(p2);
        }
        else{
            return res;
        }
    }
}
