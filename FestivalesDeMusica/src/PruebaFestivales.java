import java.time.LocalDate;
import java.util.Arrays;

public class PruebaFestivales {
    public static void main(String[] args){
        Artista art1 = new Artista("Carlos", "12345");
        Artista art2 = new Artista("Pepe", "123456abc", "disco1");
        Artista art3 = new Artista("David", "123456def");
        Artista art4 = new Artista("Jose", "123456ghi");
        Artista art5 = new Artista("Alvaro","234567abc");
        Artista art6 = new Artista("Marco", "234567def");
        Artista art7 = new Artista("Mario", "234567ghi");
        Artista art8 = new Artista("Victor", "3456789abc");

        Festival fest1 = new Festival("aqui", LocalDate.now());
        Festival fest2 = new Festival("alli", LocalDate.now());
        Festival fest3 = new Festival("no se", LocalDate.now());

        fest1.comprarEntradas(30, Festival.tipoEntrada.PISTA);

        fest1.confirmarArtista(art1);
        fest1.confirmarArtista(art2, 2);

        fest2.confirmarArtista(art1);

        Festival[] arrayFest = new Festival[3];
        arrayFest[0] = fest1;
        arrayFest[1] = fest2;
        arrayFest[2] = fest3;

        System.out.println("Festivales de Carlos: "+contarFestivalesArtista(art1, arrayFest));
        Artista[] arts = obtenerArtistasComunes(fest1, fest2);
        Festival mascendido = festivalMasVendido(arrayFest);
    }

    public static int contarFestivalesArtista(Artista artista, Festival[] festivales){
        int num = 0;
        for (int i = 0; i<festivales.length; i++){
            for (int j = 0; j<festivales[i].getNumeroArtistas(); j++){
                if (festivales[i].getArtistas()[j] != null && festivales[i].getArtistas()[j].getNif().equals(artista.getNif())){
                    num++;
                }
            }
        }
        return num;
    }

    public static Artista[] obtenerArtistasComunes(Festival f1, Festival f2){
        Artista[] comunes = new Artista[0];
        for (int i = 0; i<f1.getNumeroArtistas() ;i++){
            for (int j = 0; j<f2.getNumeroArtistas() ; j++){
                if (f1.getArtistas()[i] != null && f2.getArtistas()[j] != null && f1.getArtistas()[i].getNif().equals(f2.getArtistas()[j].getNif())){
                    comunes = Arrays.copyOf(comunes, comunes.length+1);
                    comunes[comunes.length-1] = f1.getArtistas()[i];
                }
            }
        }
        return comunes;
    }

    public static Festival festivalMasVendido(Festival[] festivales){
        Festival masvendido = new Festival("", LocalDate.now());
            for (int i = 0; i<festivales.length; i++){
                if ((festivales[i].getVendidoGrada()+festivales[i].getVendidoPista()+festivales[i].getVendidoVIP()) > (masvendido.getVendidoGrada()+masvendido.getVendidoPista()+masvendido.getVendidoVIP())){
                    masvendido = festivales[i];
                }
            }
        return masvendido;
    }
}
