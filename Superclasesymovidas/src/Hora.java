public class Hora {
    int hora;
    int minuto;

    public Hora(int hora,int minuto){
        this.hora = hora;
        this.minuto = minuto;
        if (this.hora > 23){
            this.hora = 23;
        }
        if (this.minuto > 59){
            this.minuto = 59;
        }
    }

    public void inc(){
        if (this.minuto < 59){
            this.minuto++;
        }
        else{
            this.minuto = 0;
            if (this.hora < 23){
                this.hora++;
            }
            else{
                this.hora = 0;
            }
        }
    }

    boolean setMinutos(int valor){
        boolean resultado = false;
        if (valor >= 0 && valor <= 59) {
            this.minuto = valor;
            resultado = true;
        }
        return resultado;
    }

    boolean setHora(int valor){
        boolean resultado;
        if (valor >= 0 && valor <= 23){
            this.hora = valor;
            resultado = true;
        }
        else{
            resultado = false;
        }
        return resultado;
    }

    @Override
    public String toString(){
        String resultado = this.hora + ":" + this.minuto;
        return resultado;
    }
}
