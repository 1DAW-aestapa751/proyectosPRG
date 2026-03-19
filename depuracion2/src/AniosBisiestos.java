public class AniosBisiestos {
    public static void main(String[] args) {
        for (int num = 1; num <= 2018; num++) {
            if (num % 4 == 0 && (num % 100 != 0 || num % 400 == 0)) {
                System.out.println(num);
            }
        }
    }
}
