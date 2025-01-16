/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import view.*;
import view_table_model.MTableInforme;
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
        /*String[] meses_str = new String[]{
            "PRUEBA",
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
            "DICIEMBRE",};*/
        
        String[] valores = new String[]{
            "Ventas",
            "Gastos",
            "Promedio"
            };
        
        this.data = new String[valores.length][13];
        /*for(int i = 0; i<meses_str.length; i++){
            data[0][i] = meses_str[i];   
        }*/
        
        for (int i = 0; i < valores.length; i++) {
            data[i][0] = valores[i]; // Iniciar desde la segunda fila
        }
        
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
    
    public static void print_matriz(Object[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                System.out.print((m[i][j] != null ? m[i][j] : "") + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    
    
    
    public Boolean guardarDato(int mesIndex, String ventas, String gastos) {
        if (mesIndex < 1 || mesIndex > 12) { // Validar el índice del mes
            return false;
        }

        if (data.length < 2) {
            return false; // Validar que existan al menos dos filas
        }

        data[0][mesIndex] = ventas; // Ventas en la fila 0
        data[1][mesIndex] = gastos; // Gastos en la fila 1
        return true;
    }
    
    
    /*public static void main(String[] args){
        Informe informe = new Informe();
        informe.crear();
        print_matriz(informe.getData());
    }*/
}
