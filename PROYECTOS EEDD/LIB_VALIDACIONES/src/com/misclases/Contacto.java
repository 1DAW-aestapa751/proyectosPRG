/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.misclases;


import com.validador.core.UtilidadesValidacion;

public class Contacto {
    private String nombre;
    private String dni;

    public Contacto(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public boolean esValido() {
        return UtilidadesValidacion.validarFormatoNIF(this.dni);
    }

    private String generarEmailCorporativo() {
        // Uso del método que será refactorizado
        return this.nombre.toLowerCase().replace(" ", ".") 
               + UtilidadesValidacion.obtenerDominioPorDefecto();
    }

    @Override
    public String toString() {
        return "Contacto: " + nombre + " [DNI: " + dni + "]";
    }
}