public class Test {
    public static void main(String[] args){
        Bombilla b1 = new Bombilla();
        Bombilla b2 = new Bombilla();
        b1.status();
        b2.status();

        b1.on();
        b2.off();
        b1.status();
        b2.status();

        Bombilla.xoff();
        b1.status();
        b2.status();

        Bombilla.xon();
        b1.status();
        b2.status();
    }
}
