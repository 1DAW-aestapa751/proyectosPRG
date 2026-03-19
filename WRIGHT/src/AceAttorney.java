import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Evidencia {
    String nombre;
    String descripcion;

    public Evidencia(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
}

public class AceAttorney {
    private List<Evidencia> actaDelJuicio;
    private String[] testimonio;
    private Scanner scanner;

    public AceAttorney() {
        actaDelJuicio = new ArrayList<>();
        scanner = new Scanner(System.in);

        // Cargar el Acta del Juicio (Inventario)
        actaDelJuicio.add(new Evidencia("Placa de Abogado", "Mi prueba de que soy abogado defensor."));
        actaDelJuicio.add(new Evidencia("Informe de Autopsia", "Hora de la muerte: 16:00 - 17:00. Causa: Golpe contundente."));
        actaDelJuicio.add(new Evidencia("Estatua de 'El Pensador'", "Un reloj con forma de estatua. Es bastante pesado."));
        actaDelJuicio.add(new Evidencia("Pasaporte de Cindy", "Pasaporte de la víctima. Confirma que estaba en París el día anterior."));

        // El testimonio de Frank Sahwit
        testimonio = new String[]{
                "Estaba yendo de puerta en puerta vendiendo suscripciones de periódicos.",
                "Noté que la puerta del apartamento estaba abierta y entré.",
                "Allí la vi... Cindy Stone, tirada en el suelo. ¡Estaba muerta!",
                "Recuerdo la hora perfectamente. ¡Eran la 1:00 PM en punto!",
                "Me asusté tanto que salí corriendo a llamar a la policía."
        };
    }

    public void iniciarJuicio() {
        System.out.println("==================================================");
        System.out.println("   TRIBUNAL DE DISTRITO - SALA Nº 1");
        System.out.println("   CASO: EL PRIMER CASO");
        System.out.println("==================================================\n");

        System.out.println("JUEZ: La defensa puede comenzar su interrogatorio.");
        System.out.println("MIA: Phoenix, recuerda. Encuentra la mentira en su testimonio");
        System.out.println("     y presenta la evidencia que lo contradiga.\n");

        iniciarInterrogatorio();
    }

    private void iniciarInterrogatorio() {
        int indiceTestimonio = 0;
        boolean contradiccionEncontrada = false;

        while (!contradiccionEncontrada) {
            System.out.println("\n--- INTERROGATORIO ---");
            System.out.println("Testigo: Frank Sahwit");
            System.out.println("Declaración " + (indiceTestimonio + 1) + ": \"" + testimonio[indiceTestimonio] + "\"");
            System.out.println("\n¿Qué deseas hacer, Wright?");
            System.out.println("1. (Avanzar) Siguiente declaración");
            System.out.println("2. (Presionar) Pedir más detalles");
            System.out.println("3. (Presentar) Mostrar evidencia");
            System.out.print("\nTu elección: ");

            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    indiceTestimonio++;
                    if (indiceTestimonio >= testimonio.length) {
                        System.out.println("\nJUEZ: Eso es todo el testimonio. Señor Wright, ¿tiene alguna objeción?");
                        System.out.println("PHOENIX: (Maldición, tendré que repasar todo de nuevo...)");
                        indiceTestimonio = 0; // Vuelve al inicio
                    }
                    break;
                case "2":
                    presionar(indiceTestimonio);
                    break;
                case "3":
                    contradiccionEncontrada = presentarEvidencia(indiceTestimonio);
                    break;
                default:
                    System.out.println("MIA: Phoenix, concéntrate. Elige una opción válida.");
            }
        }
    }

    private void presionar(int indice) {
        System.out.println("\nPHOENIX: ¡Un momento!");
        switch (indice) {
            case 3:
                System.out.println("PHOENIX: ¿Está completamente seguro de que era la 1:00 PM?");
                System.out.println("SAHWIT: ¡Absolutamente! Miré mi reloj.");
                System.out.println("MIA: (Ahí hay algo raro, Phoenix. Revisa el Acta del Juicio...)");
                break;
            default:
                System.out.println("PHOENIX: ¿Podría dar más detalles sobre eso?");
                System.out.println("SAHWIT: Ya le he dicho todo lo que sé, señor abogado.");
                System.out.println("JUEZ: La defensa debe dejar de hacer perder el tiempo al tribunal.");
                break;
        }
    }

    private boolean presentarEvidencia(int indiceTestimonio) {
        System.out.println("\n--- ACTA DEL JUICIO ---");
        for (int i = 0; i < actaDelJuicio.size(); i++) {
            Evidencia e = actaDelJuicio.get(i);
            System.out.println((i + 1) + ". " + e.nombre + " - " + e.descripcion);
        }
        System.out.println("0. Volver atrás");
        System.out.print("\nSelecciona la evidencia a presentar (número): ");

        int seleccion;
        try {
            seleccion = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida.");
            return false;
        }

        if (seleccion == 0) return false;

        if (seleccion > 0 && seleccion <= actaDelJuicio.size()) {
            Evidencia evidenciaPresentada = actaDelJuicio.get(seleccion - 1);
            System.out.println("\nPHOENIX: ¡PROTESTA!");
            System.out.println("PHOENIX: ¡Presento el " + evidenciaPresentada.nombre + "!");

            // La lógica de la contradicción (Declaración 4 + Informe de Autopsia)
            if (indiceTestimonio == 3 && evidenciaPresentada.nombre.equals("Informe de Autopsia")) {
                System.out.println("\nPHOENIX: Usted afirma haber encontrado el cuerpo a la 1:00 PM.");
                System.out.println("PHOENIX: Sin embargo, el informe de autopsia es claro.");
                System.out.println("PHOENIX: ¡La muerte se produjo entre las 16:00 y las 17:00 horas!");
                System.out.println("PHOENIX: ¡Es imposible que encontrara el cuerpo a la 1:00 PM porque la víctima aún estaba viva!");
                System.out.println("\nSAHWIT: ¡Aaaaaaargh! *Lanza su peluquín*");
                System.out.println("\nJUEZ: ¡Orden! ¡Orden en la sala!");
                System.out.println("MIA: ¡Buen trabajo, Phoenix! Lo tenemos acorralado.");
                System.out.println("\n*** FIN DE LA DEMOSTRACIÓN ***");
                return true; // Contradicción resuelta, fin del loop
            } else {
                System.out.println("\nPHOENIX: ¡Esta evidencia contradice su testimonio!");
                System.out.println("SAHWIT: ... ¿Ah, sí? Yo no le veo ninguna relación.");
                System.out.println("JUEZ: Yo tampoco, señor Wright. Le advierto que no presente pruebas al azar.");
                System.out.println("MIA: (Phoenix, piénsalo bien antes de presentar algo. Hay un error en tu lógica).");
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        AceAttorney juego = new AceAttorney();
        juego.iniciarJuicio();
    }
}
