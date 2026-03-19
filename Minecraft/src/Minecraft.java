import java.util.Arrays;

public class Minecraft {
//    Materiales hierro = new Metal("hierro", 10, 20, 1, true, true);
//    Materiales roca = new Rocas("roca", 50, 100, 0, false, 80);
//    Materiales cristal = new Cristal("cristal", 5, 10, 0, true, Cristal.TipoCristal.Transparente);
//    Materiales pico = new Pico("pico de hierro", 15, 20, 1, true, 5);
//    Materiales sierra = new Sierra("sierra", 12, 15, 1, true, 20);
    Materiales [] inventario = new Materiales[0];

    public void agregarMaterial(Materiales material){
        if (this.inventario.length < 10) {
            inventario = Arrays.copyOf(inventario, inventario.length + 1);
            inventario[inventario.length - 1] = material;
        }
    }

    public void eliminarMaterialSinMasa() {
        int materialesSanos = 0;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getMasa() > 0) {
                materialesSanos++;
            }
        }

        Materiales[] nuevoInventario = new Materiales[materialesSanos];

        int contador = 0;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getMasa() > 0) {
                nuevoInventario[contador] = inventario[i];
                contador++;
            }
        }
        inventario = nuevoInventario;
    }

    public void mostrarEstado(){
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(inventario[i].toString());
        }
    }

    public void ultimoMaterialQueQueda(){
        int num = 0;
        for (int i = 0; i < inventario.length; i++) {
            if (inventario[i].getMasa() <= 0){
                num++;
            }
        }
        if (num == 1){
            for (int i = 0; i < inventario.length; i++) {
                if (inventario[i].getMasa() == 0) {
                    System.out.println(inventario[i].toString());
                }
            }
        }
    }

}
