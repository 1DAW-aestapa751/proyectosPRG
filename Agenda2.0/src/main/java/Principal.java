import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        int res = 0;
        Scanner sc = new Scanner(System.in);
        String nom;
        String num;
        agenda a1 = new agenda();

        while (true) {
            pintarMenu();

            do {
                res = sc.nextInt();
            } while (res > 4 || res < 1);

            switch (res){
                case 1:
                    System.out.println("introduce el nombre");
                    nom = sc.next();
                    System.out.println("introduce el numero");
                    num = sc.next();
                    contacto c1 = new contacto(nom, num);
                    a1.addContact(c1);
                    System.out.println("Se ha añadido el contacto");
                    break;
                case 2:
                    if (a1.nCont == 0){
                        System.out.println("No hay contactos disponibles");
                    }
                    else{
                        System.out.println("Escribe el nombre o el número del contacto");
                        nom = sc.next();
                        a1.searchContact(nom);
                    }
                    break;
                case 3:
                    if (a1.nCont == 0){
                        System.out.println("No hay contactos disponibles");
                    }
                    else{
                        a1.showList();
                    }
                    break;
                case 4:
                    if (a1.nCont == 0){
                        System.out.println("No hay contactos disponibles");
                    }
                    else{
                        System.out.println("Escribe el nombre o el numero del contacto a eliminar");
                        nom = sc.next();
                        a1.deleteContact(nom);
                    }
                    break;
            }
        }

    }

    public static void pintarMenu(){
        System.out.println(" ");
        System.out.println("+----------------------+");
        System.out.println("|    Menu principal    |");
        System.out.println("+----------------------+");
        System.out.println("| 1. añadir contacto.  |");
        System.out.println("| 2. buscar contacto.  |");
        System.out.println("| 3. mostrar contactos.|");
        System.out.println("| 4. Borrar contacto.  |");
        System.out.println("+----------------------+");
        System.out.println(" ");
    }
}
