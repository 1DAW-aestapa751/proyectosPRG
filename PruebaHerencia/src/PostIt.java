public class PostIt extends Mensaje{
    public PostIt(String contenido) {
        super("", contenido);
    }

    @Override
    public boolean validarDestinatario() {
        return true;
    }

}
