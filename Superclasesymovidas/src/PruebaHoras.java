public class PruebaHoras {
    public static void main(String[] args){
        Hora h1 = new Hora(14, 22);
        Hora e1 = new HoraExacta(2, 5, 13);
        HoraExacta e2 = new HoraExacta(2, 5, 59);
        System.out.println(e1.toString());
        e1.inc();
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        e2.inc();
        System.out.println(e2.toString());
        System.out.println(h1.toString());
        h1.inc();
        System.out.println(h1.toString());
        System.out.println(e1.equals(e2));
    }
}
