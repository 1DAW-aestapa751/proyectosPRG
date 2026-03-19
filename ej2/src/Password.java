public class Password {
    private int length;
    private String password;

    public Password() {
        this.length = 8;
        this.password = "";
    }

    public Password(String password) {
        this.length = 8;
        this.password = password;
    }

    public void esFuerte(){
        int nums = 0;
        int mayus = 0;
        int minus = 0;
        for (int i = 0; i < password.length(); i++){
            if (Character.isUpperCase(password.charAt(i))){
                mayus++;
            }
            if (Character.isLowerCase(password.charAt(i))){
                minus++;
            }
            if (Character.isDigit(password.charAt(i))){
                nums++;
            }
        }
        if (mayus > 2 && minus > 1 && nums > 5){
            System.out.println("La contraseña es fuerte");
        } else {
            System.out.println("La contraseña no es fuerte");
        }
    }
}
