public class Piano extends Instrumento {
    @Override
    public void interpretar() {
        for (Notas nota : partitura) {
            switch (nota) {
                case DO -> System.out.print("do ");
                case RE -> System.out.print("re ");
                case MI -> System.out.print("mi ");
                case FA -> System.out.print("fa ");
                case SOL -> System.out.print("sol ");
                case LA -> System.out.print("la ");
                case SI -> System.out.print("si ");
            }
        }
        System.out.println();
    }

}
