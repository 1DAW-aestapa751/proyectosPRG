public class Email extends Mensaje implements Enviable{
    private String asunto;

    public Email(String destinatario, String contenido, String asunto){
        super(destinatario, contenido);
        this.asunto = asunto;
    }

    public void enviar(){
        super.enviado = true;
    }

    @Override
    public boolean validarDestinatario() {
        String dir = super.destinatario;
        boolean res = false;
        if(dir.contains("@") && dir.charAt(0) != '@' && dir.charAt(dir.length()-1) != '@'){
            res = true;
        }
        return res;
    }
}
