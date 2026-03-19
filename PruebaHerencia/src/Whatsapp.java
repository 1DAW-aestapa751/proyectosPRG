public class Whatsapp extends Mensaje implements Enviable{
    public Whatsapp(String destinatario, String contenido) {
        super(destinatario, contenido);
    }

    public void enviar(){
        super.enviado = true;
    }

    @Override
    public boolean validarDestinatario() {
        boolean res = false;
        boolean esnum = true;
        try {
            int num = Integer.parseInt(super.destinatario);
        } catch (NumberFormatException e){
            esnum = false;
        }
        if (super.destinatario.length() == 6 && esnum) {
            res = true;
        }
        return res;
    }
}
