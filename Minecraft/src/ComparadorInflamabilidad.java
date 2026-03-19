import java.util.Comparator;

public class ComparadorInflamabilidad implements Comparator {


    @Override
    public int compare(Object o1, Object o2) {
        Materiales m1 = (Materiales) o1;
        Materiales m2 = (Materiales) o2;
        return m1.getResistenciaFuego() - m2.getResistenciaFuego();
    }
}
