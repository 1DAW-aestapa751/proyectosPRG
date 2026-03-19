public class test {
    public static void main(String[] args){
        Pelicula a = new Pelicula("a", 2000, "comedia");
        Pelicula b = new Pelicula("b", 1800, "tragedia");
        Pelicula c = new Pelicula("c", 2007, "comedia");
        Pelicula d = new Pelicula("d", 2002, "drama");
        a.addGenero("tragedia");

        Catalogo x = new Catalogo();
        x.agregarPelicula(a);
        x.agregarPelicula(b);
        x.agregarPelicula(c);
        x.agregarPelicula(d);
        x.listarPeliculas();
        Pelicula[] ls = x.buscarPeliculas("com", "genero");
        for (int i = 0; i<ls.length; i++){
            System.out.println(ls[i].getTitulo());
        }
    }
}
