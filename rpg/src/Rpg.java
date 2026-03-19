import java.util.Scanner;

public class Rpg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre = "";
        String kiko = "kiko";
        int enemypv = 0;
        int select = 0;
        int enemyatk = 0;
        int enemypm = 0;
        int exp = 0;
        int nv = 1;
        int expn = 100;
        int clase;
        int turnos = 1;
        int ncombate = 1;
        int vidamax = 1;
        int vida = 1;
        int ataque = 0;
        int pmmax = 1;
        int pm = 1;
        int costopm = 0;
        int rng = (int) (Math.random()*3+1);
        String enemytype = "";
        String magia = "";
        System.out.println("****   ****    ****    *   *  *   *  *   *     ****  *   *    *    ****    *** ");
        System.out.println("*   *  *   *  *        ** **  *   *   * *     *      *   *   * *   *   *  *   *");
        System.out.println("****   ****   *  **    * * *  *   *    *      *  **  *   *  *   *  ****   *   *");
        System.out.println("*   *  *      *   *    *   *  *   *    *      *   *  *   *  *****  *      *   *");
        System.out.println("*   *  *       ***     *   *   ***     *       ***    ***   *   *  *       *** ");
        System.out.println("Bienvenido al juego, selecciona una clase:");
        System.out.println("1. viajero");
        System.out.println("2. guerrero");
        System.out.println("3. tanque");
        do {
            clase = sc.nextInt();
        } while (clase < 1 || clase > 3);
        System.out.println("Di tu nombre:");
        nombre = sc.next();
        if (nombre.equals(kiko)){
            System.out.println("Uf... referencia");
        }
        switch (clase) {
            case 1:
                vidamax = 100;
                vida = vidamax;
                ataque = 30;
                pm = 50;
                pmmax = pm;
                magia = "Ataque fuerte";
                costopm = 25;
                break;
            case 2:
                vidamax = 80;
                vida = vidamax;
                ataque = 50;
                pm = 40;
                pmmax = pm;
                magia = "Rayo";
                costopm = 30;
                break;
            case 3:
                vidamax = 120;
                vida = vidamax;
                ataque = 10;
                pm = 60;
                pmmax = pm;
                magia = "curacion";
                costopm = 30;
                break;
        }
        System.out.println(""+nombre+" Tiene los atributos: pv = "+vidamax);
        System.out.println("                         atq = "+ataque);
        System.out.println("                         pm = "+pm);
        while (vida>0){
            if (nv<5){
                rng = (int) (Math.random()*3+1);
                System.out.println("Caminas por el bosque...");
                switch (rng) {
                    case 1:
                        System.out.println("Aparece un Roberto");
                        enemypv = 50;
                        enemyatk = 10;
                        enemypm = 0;
                        enemytype = "Roberto";
                    break;
                    case 2:
                        System.out.println("Aparece un Gitano");
                        enemypv = 70;
                        enemyatk = 30;
                        enemypm = 0;
                        enemytype = "Gitano";
                    break;
                    case 3:
                        System.out.println("Aparece un Votante del PSOE");
                        enemypv = 75;
                        enemyatk = 20;
                        enemypm = 0;
                        enemytype = "Votante del PSOE";
                    break;
                    default:
                        System.out.println("Nada aparece");
                    break;
                }
            }
            else if (nv<10) {
                rng = (int) (Math.random()*3+1);
                System.out.println("Caminas por una mazmorra...");
                switch (rng) {
                    case 1:
                        System.out.println("Aparece un Fracasado");
                        enemypv = 120;
                        enemyatk = 30;
                        enemypm = 0;
                        enemytype = "Fracasado";
                    break;
                    case 2:
                        System.out.println("Aparece un Fimosico");
                        enemypv = 100;
                        enemyatk = 25;
                        enemypm = 0;
                        enemytype = "Fimosico";
                    break;
                    case 3:
                        System.out.println("Aparece un Soldado Paco");
                        enemypv = 110;
                        enemyatk = 20;
                        enemypm = 0;
                        enemytype = "Soldado Paco";
                    break;
                    default:
                        System.out.println("Nada aparece");
                    break;
                }
            }
            else if (nv<20) {
                rng = (int) (Math.random()*3+1);
                System.out.println("Caminas por el infierno...");
                switch (rng) {
                    case 1:
                        System.out.println("Aparece un Demonio");
                        enemypv = 150;
                        enemyatk = 50;
                        enemypm = 0;
                        enemytype = "Demonio";
                    break;
                    case 2:
                        System.out.println("Aparece un Cancer");
                        enemypv = 170;
                        enemyatk = 65;
                        enemypm = 0;
                        enemytype = "Cancer";
                    break;
                    case 3:
                        System.out.println("Aparece un Fan de Jojos");
                        enemypv = 200;
                        enemyatk = 40;
                        enemypm = 0;
                        enemytype = "Fan de Jojos";
                    break;
                    default:
                        System.out.println("Nada aparece");
                    break;
                }
            }
            turnos=1;
            while (vida>0 && enemypv>0){
                System.out.println("Combate n"+ncombate);
                System.out.println("turno: "+turnos);
                System.out.println(""+nombre+": "+vida+"/"+vidamax+"pv      "+pm+"/"+pmmax+"pm      nv: "+nv); //Combate.
                System.out.println(""+enemytype+":   "+enemypv+"pv");
                System.out.println("Que vas a hacer?");
                System.out.println("1. Ataque");
                System.out.println("2. "+magia+" ("+costopm+"pm)");
                do {
                    select = sc.nextInt();
                    if (select==2 && pm<costopm){
                        System.out.println("No tienes suficientes pm!");
                    }
                    if (select < 1 || select > 2){
                        System.out.println("Opcion no valida");
                    }
                } while (select < 1 || select > 2 || (select==2 && pm<costopm));
                System.out.println();
                System.out.println();

                rng = (int) (Math.random()*5+1);

                if (rng == 1){                                                      //FALLO
                    System.out.println("El ataque fallo!");
                }
                else {                                                              //ACIERTO
                    if (select == 1) {                                              //ataque
                        System.out.println(""+nombre+" Ataca!");
                        enemypv -= ataque;
                        System.out.println("El "+enemytype+" recibe "+ataque+" puntos de damage");
                    }
                    else{                                                           //magia
                        pm -= costopm;
                        System.out.println(""+nombre+" uso "+magia+"!");
                        switch (clase) {
                            case 1: enemypv -= (int) ataque*1.5;
                                System.out.println("El "+enemytype+" recibe "+(int) ataque*1.5+" puntos de damage");
                            break;
                            case 2: enemypv -= (int) ataque*2;
                                System.out.println("El "+enemytype+" recibe "+(int) ataque*2+" puntos de damage");
                            break;
                            case 3: vida += (int) ((int)vidamax*0.25);
                                System.out.println(""+nombre+" recupera "+(int)(vidamax*0.25)+"pv!");
                                if (vida>vidamax){
                                    vida = vidamax;
                                }
                            break;
                        }
                    }   
                }
                if (enemypv>1){
                    rng = (int) (Math.random()*5+1);
                    System.out.println(""+enemytype+" Ataca!");
                    if (rng == 1){
                        System.out.println("El ataque Fallo!");
                    }
                    else {
                        vida -= enemyatk;
                        System.out.println("Recibes "+enemyatk+" puntos de daño!");
                    }
                }
                turnos++;
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
            if (enemypv<1){
                exp += 20;
                System.out.println("GANASTE! consigues "+20+" puntos de experincia");
                if (exp >= expn){
                    exp = 0;
                    nv++;
                    System.out.println("Has subido de nivel! ahora eres nivel: ");
                    expn *= 1.2;
                    vidamax += 15;
                    vida = vidamax;
                    pmmax += 15;
                    pm = pmmax;
                    ataque *= 1.2;
                }
                else {
                    System.out.println("Te quedan "+(expn-exp)+" exp para subir de nivel");
                }
                ncombate++;
                System.out.println("");
                System.out.println("");
                System.out.println("");
            }
        }
        System.out.println("*   *    *     ****     *   *  *   *  *****  ****   *****   *** ");
        System.out.println("*   *   * *   *         ** **  *   *  *      *   *    *    *   *");
        System.out.println("*****  *   *   ***      * * *  *   *  *****  ****     *    *   *");
        System.out.println("*   *  *****      *     *   *  *   *  *      *   *    *    *   *");
        System.out.println("*   *  *   *  ****      *   *   ***   *****  *   *    *     *** ");
        System.out.println("");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("nombre: "+nombre);
        System.out.println("nivel: "+nv);
        System.out.println("combates: "+ncombate);
        System.out.println("");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("Intentalo otra vez!");
        System.out.println("");
    }
}