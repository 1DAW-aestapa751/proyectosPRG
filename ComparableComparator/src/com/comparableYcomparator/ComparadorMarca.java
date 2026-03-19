/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.comparableYcomparator;

import java.util.Comparator;

public class ComparadorMarca implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Coche)o1).getMarca().compareTo(((Coche) o2).getMarca());
    }  
}
