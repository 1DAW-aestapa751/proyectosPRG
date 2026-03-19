import java.util.Arrays;

public abstract class Instrumento {
    protected Notas[] partitura;

    public Instrumento(){
        partitura = new Notas[0];
    }

    public void add(Notas n) {
        partitura = Arrays.copyOf(partitura, partitura.length + 1);
        partitura[partitura.length - 1] = n;
    }

    public abstract void interpretar();
}
