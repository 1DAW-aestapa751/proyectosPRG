public class principal {
    public static void main(String[] args){
        Personaje alvaro = new Personaje("Álvaro", 100, 50, 50);
        while (alvaro.nivel < 5){
            alvaro.subirEXP(50);
        }
    }
}
