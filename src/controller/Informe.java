/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import util.Utiles;
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
            "Gastos"
            };
        
        this.data = new String[valores.length][13];
        /*for(int i = 0; i<meses_str.length; i++){
            data[0][i] = meses_str[i];   
        }*/
        
        for (int i = 0; i < valores.length; i++) {
            data[i][0] = valores[i];
        }
        
    }
    public Boolean verificar() {
        //Integer pos = -1;
        Boolean band = true;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[0].length; j++) {
                if (data[i][j] == null) {
                    //pos = i;
                    band = false;
                }
            }
            //if (pos != -1) {
            //    break;
            //}
        }
        return band;
    }
    
    public String[] data_ord(int fila) {    

        String[] fila_ord = new String[data[fila].length];
        System.arraycopy(data[fila], 0, fila_ord, 0, data[fila].length);

        int size = fila_ord.length;

        for (int i = 0; i < size - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < size - i - 1; j++) {
                if (Utiles.validate(fila_ord[j]) && Utiles.validate(fila_ord[j + 1])) {
                    if (Utiles.transformStringFloat(fila_ord[j]) < Utiles.transformStringFloat(fila_ord[j + 1])) {
                        String temp = fila_ord[j];
                        fila_ord[j] = fila_ord[j + 1];
                        fila_ord[j + 1] = temp;

                        swapped = true;
                    }
                }
            }

            if (!swapped) {
                break;
            }
        }

        return fila_ord;
    }

    
    public static void print_matriz(Object[] m) {
        for (int i = 0; i < m.length; i++) {
            //for (int j = 0; j < m[0].length; j++) {
            System.out.print((m[i] != null ? m[i] : "") + "\t");
            //}
            //System.out.println();
        }
        System.out.println();
    }
    
    
    
    
    public Boolean guardarDato(int mesIndex, String ventas, String gastos) {
        if (mesIndex < 1 || mesIndex > 12) {
            return false;
        }

        if (data.length < 2) {
            return false;
        }

        data[0][mesIndex] = ventas;
        data[1][mesIndex] = gastos;
        return true;
    }
    
    public Float calc_ventas() {
        Float total_ventas = 0.0f;
        for (int j = 1; j < data[0].length; j++) {
            if (data[0][j] != null) {
                Float valor = Utiles.transformStringFloat(data[0][j]);
                if (valor != null) {
                    total_ventas += valor;
                } else {
                    System.err.println("Valor nulo en ventas para índice " + j);
                }
            }
        }
        return total_ventas;
    }

    public Float calc_gastos() {
        Float total_gastos = 0.0f;
        for (int j = 1; j < data[1].length; j++) {
            if (data[1][j] != null) {
                Float valor = Utiles.transformStringFloat(data[1][j]);
                if (valor != null) {
                    total_gastos += valor;
                } else {
                    System.err.println("Valor nulo en gastos para índice " + j);
                }
            }
        }
        return total_gastos;
    }

    
    /*public static void main(String[] args){
        Informe informe = new Informe();
        informe.crear();
        print_matriz(informe.getData());
    }*/
}
