import java.util.Arrays;

public class Catalogo {
    private Pelicula[] moviels;

    public Catalogo(){
        moviels = new Pelicula[0];
    }

    public boolean agregarPelicula(Pelicula p){
        moviels = Arrays.copyOf(moviels, moviels.length+1);
        moviels[moviels.length-1] = p;
        boolean resultado = false;
        if (moviels[moviels.length-1].getTitulo().equals(p.getTitulo())) {
            resultado = true;
        }
        return resultado;
    }

    public void listarPeliculas(){
        for (int i = 0; i<moviels.length; i++){
            System.out.println("pelicula #"+(i+1));
            System.out.println("Titulo: "+moviels[i].getTitulo());
            System.out.println("Director: "+moviels[i].getDirector());
            System.out.println("Año de lanzamiento: "+moviels[i].getYear());
            System.out.println("Género: "+moviels[i].getGenero());
            System.out.println();
        }
    }

    public Pelicula[] buscarPeliculas(String cadenaABuscar, String campo){
        Pelicula[] resultados = new Pelicula[0];
        if(campo.equalsIgnoreCase("titulo")){
           for (int i = 0; i<moviels.length; i++){
               if (moviels[i].getTitulo().contains(cadenaABuscar)){
                   resultados = Arrays.copyOf(resultados, resultados.length+1);
                   resultados[resultados.length-1] = moviels[i];
               }
           }
        }
        else if(campo.equalsIgnoreCase("director")){
            for (int i = 0; i<moviels.length; i++){
                if (moviels[i].getDirector().contains(cadenaABuscar)){
                    resultados = Arrays.copyOf(resultados, resultados.length+1);
                    resultados[resultados.length-1] = moviels[i];
                }
            }
        }
        else if(campo.equalsIgnoreCase("año")){
            String yearS = "";
            for (int i = 0; i<moviels.length; i++){
                yearS = ""+moviels[i].getYear();
                if (yearS.contains(cadenaABuscar)){
                    resultados = Arrays.copyOf(resultados, resultados.length+1);
                    resultados[resultados.length-1] = moviels[i];
                }
            }
        }
        else if(campo.equalsIgnoreCase("genero")){
            for (int i = 0; i<moviels.length; i++){
                if (moviels[i].getGenero().contains(cadenaABuscar)){
                    resultados = Arrays.copyOf(resultados, resultados.length+1);
                    resultados[resultados.length-1] = moviels[i];
                }
            }
        }
        return resultados;
    }
}
