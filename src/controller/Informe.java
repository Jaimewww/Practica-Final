/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
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
                }
            }
        }
        return total_gastos;
    }
    
    public Boolean cargarArchivo(String direc) {
        String pathNotas = "files" + File.separatorChar + direc + File.separatorChar + "informe.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(pathNotas));

            if (lines.isEmpty()) {
                System.out.println("archivo vacio.");
                return false;
            }
            
            int n = lines.size(); //filas
            int m = lines.get(0).split("\t").length;//columnas
            
            crear();

            for (int fila = 0; fila < n; fila++) {
                String[] aux = lines.get(fila).split("\t");
                for (int col = 0; col < m; col++) {
                    try {
                        data[fila][col] = aux[col]; // Asignar el valor leído
                    } catch (Exception e) {
                        System.out.println("Error al procesar el dato en fila " + fila + ", columna " + col);
                        data[fila][col] = " ";
                    }
                }
            }

            return true;

        } catch (Exception e) {
            System.out.println("Error al cargar el archivo: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }

    
    public Boolean generateFile() {
        if (data != null) {
            String pathNotas = "files" + File.separatorChar + "informes" + File.separatorChar + "informe.txt";
            try {
                FileWriter file_matriz = new FileWriter(pathNotas);
                for (int i = 0; i < data.length; i++) {
                    String datos = "";
                    for (int j = 0; j < data[0].length; j++) {
                        datos += data[i][j] + "\t";
                    }

                    file_matriz.write(datos + "\n");
                    file_matriz.flush();
                }

                file_matriz.close();
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }
    
    public static void main(String[] args){
        Casas controllerCasa = new Casas();
        controllerCasa.crear();
        print_matriz(controllerCasa.getData());
    }
}
