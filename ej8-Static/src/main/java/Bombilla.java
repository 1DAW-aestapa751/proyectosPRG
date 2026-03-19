public class Bombilla {
    private boolean interruptor;
    private static boolean xInterruptor = true;

    public Bombilla(){
        interruptor = false;
    }

    public void status(){
        if (interruptor && xInterruptor){
            System.out.println("Encendido");
        }
        else{
            System.out.println("Apagado");
        }
    }

    public void on(){
        this.interruptor = true;
    }

    public void off(){
        this.interruptor = false;
    }

    public static void xon(){
        xInterruptor = true;
    }

    public static void xoff(){
        xInterruptor = false;
    }
}
