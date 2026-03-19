public abstract class Mensaje {
    protected String contenido;
    protected String destinatario;
    protected boolean enviado;

    @Override
    public String toString(){
        String s = this.destinatario + "\n" +
                this.contenido + "\n" +
                this.enviado;
        return s;
    }

    public abstract boolean validarDestinatario();
}