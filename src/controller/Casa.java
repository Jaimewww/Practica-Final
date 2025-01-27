/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author JAIMEUNL
 */
public class Casa {
    private double largo;
    private double ancho;
    private int nro_pisos;
    public Casa(double largo, double ancho, int nro_pisos){
        this.largo = largo;
        this.ancho = ancho;
        this.nro_pisos = nro_pisos;
    }
    
    public double getLargo(){
        return this.largo;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public int getPisos(){
        return this.nro_pisos;
    }
    
    
    
}
