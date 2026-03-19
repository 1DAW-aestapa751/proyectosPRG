import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Materiales hierro = new Metal("hierro", 10, 20, 1, true, true);
        Materiales roca = new Rocas("roca", 50, 100, 0, false, 80);
        Materiales cristal = new Cristal("cristal", 5, 10, 0, true, Cristal.TipoCristal.Transparente);
        Materiales pico = new Pico("pico de hierro", 15, 20, 1, true, 5);
        Materiales sierra = new Sierra("sierra", 12, 15, 1, true, 20);
        Minecraft mc = new Minecraft();
        mc.agregarMaterial(hierro);
        mc.agregarMaterial(roca);
        mc.agregarMaterial(cristal);
        mc.agregarMaterial(pico);
        mc.agregarMaterial(sierra);

        ComparadorInflamabilidad criterioInflamabilidad = new ComparadorInflamabilidad();
        Arrays.sort(mc.inventario, criterioInflamabilidad);

        mc.mostrarEstado();

        Arrays.sort(mc.inventario, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                Materiales m1 = (Materiales) o1;
                Materiales m2 = (Materiales) o2;
                return m1.getDisolucion() - m2.getDisolucion();
            }
        });

        mc.mostrarEstado();

    }

}
