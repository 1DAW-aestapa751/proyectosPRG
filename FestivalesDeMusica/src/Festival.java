import java.time.LocalDate;

public class Festival {
    private int numeroArtistas; //nunca superior a 10
    private String lugarCelebracion;
    private LocalDate fechaFestival;
    private int aforoPista;
    private int aforoGrada;
    private int aforoVIP;
    private int vendidoPista;
    private int vendidoGrada;
    private int vendidoVIP;
    private String idFest;
    private static int numeroFest = 1;
    private static String promotor = "SONY_MUSIC";
    private Artista[] artistas;
    public enum tipoEntrada{
        PISTA,
        GRADA,
        VIP
    }

    public Festival(String lugarCelebracion, LocalDate fechaFestival, int numeroArtistas, int aforoPista, int aforoGrada, int aforoVIP){
        this.lugarCelebracion = lugarCelebracion;
        this.fechaFestival = fechaFestival;
        this.numeroArtistas = numeroArtistas;
        this.aforoPista = aforoPista;
        this.aforoGrada = aforoGrada;
        this.aforoVIP = aforoVIP;
        this.vendidoGrada = 0;
        this.vendidoPista = 0;
        this.vendidoVIP = 0;
        if (this.numeroArtistas>10){
            numeroArtistas = 10;
        }
        artistas = new Artista[numeroArtistas];
        this.idFest = "FEST_"+numeroFest;
        numeroFest++;
    }

    public Festival(String lugarCelebracion, LocalDate fechaFestival){
        this.lugarCelebracion = lugarCelebracion;
        this.fechaFestival = fechaFestival;
        this.numeroArtistas = 5;
        this.aforoPista = 100;
        this.aforoGrada = 100;
        this.aforoVIP = 100;
        this.vendidoGrada = 0;
        this.vendidoPista = 0;
        this.vendidoVIP = 0;
        artistas = new Artista[numeroArtistas];
        this.idFest = "FEST_"+numeroFest;
        numeroFest++;
    }

    public boolean comprarEntradas(int numEntradas, tipoEntrada tipo) {
        boolean resultado = false;
        if (tipo == tipoEntrada.PISTA) {
            if (numEntradas + this.vendidoPista <= this.aforoPista) {
                this.vendidoPista += numEntradas;
                resultado = true;
            }
        }
        if (tipo == tipoEntrada.GRADA) {
            if (numEntradas + this.vendidoGrada <= this.aforoGrada) {
                this.vendidoGrada += numEntradas;
                resultado = true;
            }
        }
        if (tipo == tipoEntrada.VIP){
            if (numEntradas + this.vendidoVIP <= this.aforoVIP) {
                this.vendidoVIP += numEntradas;
                resultado = true;
            }
        }
        return resultado;
    }

    public void mostrarDisponibilidad(){
        System.out.println("PISTA: "+(this.aforoPista-this.vendidoPista) );
        System.out.println("GRADA: "+(this.aforoGrada-this.vendidoGrada) );
        System.out.println("PISTA: "+(this.aforoVIP-this.vendidoVIP) );
    }

    public boolean confirmarArtista(Artista artista){
        boolean resultado = false;
        int contador = 0;
        boolean presente = false;
        for (int i = 0; i<this.artistas.length; i++){
            if (this.artistas[i] != null && this.artistas[i].getNif().equals(artista.getNif())){
                presente = true;
            }
        }
        if (!presente) {
            while (contador < this.artistas.length && this.artistas[contador] != null) {
                contador++;
            }
            if (contador < artistas.length) {
                this.artistas[contador] = artista;
                resultado = true;
            }
        }
        else{
            System.out.println("El artista ya participa");
        }
        return resultado;
    }

    public boolean confirmarArtista(Artista artista, int orden){
        boolean resultado = false;
        int contador = orden;
        boolean presente = false;
        for (int i = 0; i<this.artistas.length; i++){
            if (this.artistas[i] != null && this.artistas[i].getNif().equals(artista.getNif())){
                presente = true;
            }
        }
        if (!presente) {
            while (contador < this.artistas.length && this.artistas[contador] != null) {
                contador++;
            }
            if (contador < artistas.length) {
                this.artistas[contador] = artista;
                resultado = true;
            }
        }
        else{
            System.out.println("El artista ya participa");
        }
        return resultado;
    }

    public int getNumeroArtistas() {
        return numeroArtistas;
    }

    public String getLugarCelebracion() {
        return lugarCelebracion;
    }

    public void setLugarCelebracion(String lugarCelebracion) {
        this.lugarCelebracion = lugarCelebracion;
    }

    public LocalDate getFechaFestival() {
        return fechaFestival;
    }

    public void setFechaFestival(LocalDate fechaFestival) {
        this.fechaFestival = fechaFestival;
    }

    public int getAforoPista() {
        return aforoPista;
    }

    public void setAforoPista(int aforoPista) {
        this.aforoPista = aforoPista;
    }

    public int getAforoGrada() {
        return aforoGrada;
    }

    public void setAforoGrada(int aforoGrada) {
        this.aforoGrada = aforoGrada;
    }

    public int getAforoVIP() {
        return aforoVIP;
    }

    public void setAforoVIP(int aforoVIP) {
        this.aforoVIP = aforoVIP;
    }

    public int getVendidoPista() {
        return vendidoPista;
    }

    public void setVendidoPista(int vendidoPista) {
        this.vendidoPista = vendidoPista;
    }

    public int getVendidoGrada() {
        return vendidoGrada;
    }

    public void setVendidoGrada(int vendidoGrada) {
        this.vendidoGrada = vendidoGrada;
    }

    public int getVendidoVIP() {
        return vendidoVIP;
    }

    public void setVendidoVIP(int vendidoVIP) {
        this.vendidoVIP = vendidoVIP;
    }

    public String getIdFest() {
        return idFest;
    }

    public void setIdFest(String idFest) {
        this.idFest = idFest;
    }

    public Artista[] getArtistas() {
        return artistas;
    }

    public void setArtistas(Artista[] artistas) {
        this.artistas = artistas;
    }
}
