public abstract class Mensaje {
    protected String contenido;
    protected String destinatario;
    protected boolean enviado;

    public Mensaje(String destinatario, String contenido){
        this.destinatario = destinatario;
        this.contenido = contenido;
        this.enviado = false;
    }

    @Override
    public String toString(){
        String s = this.destinatario + "\n" +
                this.contenido + "\n" +
                this.enviado;
        return s;
    }

    public abstract boolean validarDestinatario();
}