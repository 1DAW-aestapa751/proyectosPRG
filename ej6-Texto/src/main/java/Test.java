public class Test {
    public static void main(String[] args){
        Texto txt = new Texto(10);
        txt.addFront("hola");
        txt.mostrarTexto();
        txt.addFront('A');
        txt.mostrarTexto();
        txt.addFront("Caracola");
        txt.mostrarTexto();
        txt.addBack('l');
        txt.mostrarTexto();
        txt.addBack("sos");
        txt.mostrarTexto();
        System.out.println(txt.vocalesMayusculas());
        System.out.println(txt.vocalesMinusculas());
        System.out.println(txt.getFechaCreacion());
        System.out.println(txt.getFechaHoraModificacion());
    }
}
