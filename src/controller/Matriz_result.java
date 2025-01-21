/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author JAIMEUNL
 */
public class Matriz_result {
    public Matrices matrices = new Matrices();
    private Float data[][];
    
    public Float[][] getData(){
        return data;
    }
    
    public void setData(Float[][] data){
        this.data = data;
    }
    
    public void duplicarMatriz(Float[][] matriz) {
        if (matriz != null) {
            this.data = new Float[matriz.length][];
            for (int i = 0; i < matriz.length; i++) {
                this.data[i] = matriz[i].clone();
            }
        } else {
            this.data = null;
        }
    }
 
}
