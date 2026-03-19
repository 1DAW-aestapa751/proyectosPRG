/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Arrays;
import java.util.Scanner;

public class PruebaMensajes {
    
    static Mensaje mensajes [] = new Mensaje[0];

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("¿Desea crear un mensaje? S/N");
        while (sc.next().toUpperCase().equals("S")){
            System.out.println("¿Qué desea crear? \n"
                    + "1. Email \n"
                    + "2. WhatsApp \n"
                    + "3. PosIt");
            String tipo = sc.next();
            switch(tipo){
                case "1": crearMail(); break;   
                case "2": crearWhatsApp(); break;
                case "3": crearPosIt(); break;
                default: System.out.println("Elija una opción válida");
            }
            System.out.println("¿Desea enviar un nuevo mensaje? S/N");
        }
        
        enviarMensajes();
        
        mostrarEnviados();

    }
    
    public static void anadirMensaje(Mensaje m){
        mensajes = Arrays.copyOf(mensajes, mensajes.length+1);
        mensajes[mensajes.length-1] = m;
    }

    public static void enviarMensajes(){
        for (int i = 0; i < mensajes.length; i++){
            if (mensajes[i] instanceof Whatsapp || mensajes[i] instanceof Email){
                if (mensajes[i].validarDestinatario()) {
                    ((Enviable) mensajes[i]).enviar();
                }
            }
        }
    }

    public static void mostrarEnviados(){
        for (int i = 0; i < mensajes.length; i++){
            if (mensajes[i].enviado){
                System.out.println(mensajes[i].toString());
            }
        }
    }

    private static void crearMail() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el email del destinatario");
        String destinatario = sc.next();
        System.out.println("Introduce el asunto del email");
        String asunto = sc.next();
        System.out.println("Introduce el contenido del email");
        String contenido = sc.next();
        anadirMensaje(new Email(destinatario,asunto,contenido));
    }

    private static void crearWhatsApp() {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce el teléfono de destino");
        String destinatario = sc.next();
        System.out.println("Introduce el contenido del whatsApp");
        String contenido = sc.next();
        anadirMensaje(new Whatsapp(destinatario,contenido));
    }

    private static void crearPosIt() {
       Scanner sc = new Scanner (System.in);
        System.out.println("Qué quieres poner en el posIt");
        String contenido = sc.next();
        anadirMensaje(new PostIt(contenido));
    }
}
