/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.*;
/**
 *
 * @author JAIMEUNL
 */
public class Informe {
    
    private String data[][];
    
    public String[][] getData(){
    return data;
    }
    
    public void setData(String [][] data){
        this.data = data;
    }
    
    
        
        
    
    public void crear(){
        //Generar arreglo del informe anual
        String[] meses_str = new String[]{
            "MESES",
            "ENERO",
            "FEBRERO",
            "MARZO",
            "ABRIL",
            "MAYO",
            "JUNIO",
            "JULIO",
            "AGOSTO",
            "SEPTIEMBRE",
            "OCTUBRE",
            "NOVIEMBRE",
            "DICIEMBRE",};
        
        String[] valores = new String[]{
            "Ventas",
            "Gastos",};
        
        this.data = new String[3][meses_str.length];
        for(int i = 0; i<meses_str.length; i++){
            data[0][i] = meses_str[i];
            
        }
        for (int i = 0; i < valores.length; i++) {
            data[i + 1][0] = valores[i]; // Iniciar desde la segunda fila
        }
    }
    
    public static void print_matriz(Object[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print((m[i][j] != null ? m[i][j] : "") + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public Integer verificar() {
        Integer pos = -1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] == null) {
                    pos = i;
                    break;
                }
            }
            if (pos != -1) {
                break;
            }
        }
        return pos;
    }
    
    public void agregarDato(String mes, Integer items, Float valor, Float gastos){
        
    }
    
    public static void main(String[] args){
        Informe informe = new Informe();
        informe.crear();
        print_matriz(informe.getData());
    }
}
