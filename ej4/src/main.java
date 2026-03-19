public class main {
    public static void main(String[] args){
        Piano piano = new Piano();
        piano.add(Notas.DO);
        piano.add(Notas.RE);

        piano.interpretar();
    }
}
