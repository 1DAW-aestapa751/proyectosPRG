import java.util.Objects;

public class HoraExacta extends Hora {
    int segundo;

    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if (segundo >= 0 && segundo <= 59) {
            this.segundo = segundo;
        } else {
            this.segundo = 0;
        }
    }

    public boolean setSegundo(int valor) {
        boolean resultado = false;
        if (valor >= 0 && valor <= 59) {
            this.segundo = valor;
            resultado = true;
        }
        return resultado;
    }

    @Override
    public void inc() {
        if (this.segundo < 59) {
            this.segundo++;
        } else {
            this.segundo = 0;
            super.inc();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HoraExacta that = (HoraExacta) o;
        return segundo == that.segundo;
    }

    @Override
    public String toString() {
        String resultado = this.hora + ":" + this.minuto + ":" + this.segundo;
        return resultado;
    }
}
