public class Romancero extends Agrupacion{
    private String nombre;
    private String autor;
    private String autorMusica;
    private String autorLetra;
    private String tipo;
    private String tematicaCartelon;

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

}

