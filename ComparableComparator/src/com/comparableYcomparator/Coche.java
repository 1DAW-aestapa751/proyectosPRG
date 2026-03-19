/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.comparableYcomparator;

public class Coche implements Comparable {
    
    private String marca;
    private String matricula;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnyoMatriculacion() {
        return anyoMatriculacion;
    }

    public void setAnyoMatriculacion(int anyoMatriculacion) {
        this.anyoMatriculacion = anyoMatriculacion;
    }
    int anyoMatriculacion;
    
    public Coche(String marca, int anyo){
        this.marca = marca;
        this.anyoMatriculacion = anyo;
    }
    
    public String toString(){
        return this.marca + " : " + this.matricula + " del año " + this.anyoMatriculacion;
    }
    
//      @Override
//    public int compareTo(Object o) {
//        Coche c =     (Coche) o;
//        return this.anyoMatriculacion - c.anyoMatriculacion; 
//    }
//
    @Override
    public int compareTo(Object o) {
        Coche c = (Coche) o;
        int res = this.anyoMatriculacion - c.anyoMatriculacion; 
        if (res == 0){
            res = this.marca.compareTo(c.marca); 
        } 
        return res;
    }
    
}
