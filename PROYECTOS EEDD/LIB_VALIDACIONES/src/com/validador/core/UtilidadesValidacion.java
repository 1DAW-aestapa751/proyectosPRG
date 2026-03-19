package com.validador.core;

public class UtilidadesValidacion {

    public static boolean validarFormatoNIF(String dni) {
        return dni != null && dni.matches("^[0-9]{8}[A-Z]$");
    }

    public static boolean validarEmail(String email) {
        return email != null && email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    // Método a refactorizar
    public static String obtenerDominioPorDefecto() {
        return "@g.educaand.es";
    }
}
