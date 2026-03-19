/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clasesEnlazadas;

import java.time.LocalDate;

/**
 *
 * @author losad
 */
public class Trabajador {
    
    private String nombre;
    private double sueldoBruto;
    private static String empresa;
    private Trabajador jefe;
    private Trabajador [] personasACargo;
    private boolean activo;
    
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
    
    private void asignarContrato(LocalDate fechaAlta,LocalDate fechaBaja){
        this.fechaAlta = fechaAlta;
        this.fechaBaja = fechaBaja;
        activo=true;
    }
    
    public Trabajador[] getPersonasACargo() {
        return personasACargo;
    }

    public void setPersonasACargo(Trabajador[] personasACargo) {
        this.personasACargo = personasACargo;
    }

    public boolean isActivo() {
        return activo;
    }

    public Trabajador(String nombre, double sueldoBruto) {
        this(nombre,sueldoBruto,null);  
    }

    private Trabajador(String nombre, double sueldoBruto, Trabajador jefe) {
        this.nombre=nombre;
        this.sueldoBruto = sueldoBruto;
        this.jefe=jefe;
    }
    
    public void asignarEquipoDeTrabajo(Trabajador [] personasACargo) {
        this.personasACargo= personasACargo;
        for(int i=0; i<this.personasACargo.length;i++){
            this.personasACargo[i].jefe = this;
            this.personasACargo[i].asignarContrato(LocalDate.now(), LocalDate.now().plusMonths(6));
        }
    }
    
    public String obtenerDatosTrabajadores() {
       String res="";
       if (this.isJefe()){
        res="El equipo de trabajo de " + this.nombre + " es:\n";
        for(int i=0; i<this.personasACargo.length;i++){
             res = res + personasACargo[i].nombre +  " " + personasACargo[i].sueldoBruto + "\n";
         }
        
       }else{
           res = this.nombre + " no es un jefe con lo que no tiene equipo de trabajo asignado";
       } 
       return res;
    }
    
    public boolean isJefe() {
        return (this.personasACargo!=null);
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
   
    public double getSueldoBruto() {
        return sueldoBruto;
    }

    public void setSueldoBruto(double sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public String getEmpresa() {
        return empresa;
    }

    public Trabajador getJefe() {
        return jefe;
    }

    public void setJefe(Trabajador jefe) {
        this.jefe = jefe;
    }
    
}
