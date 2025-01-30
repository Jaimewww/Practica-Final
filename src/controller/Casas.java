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
import util.*;

/**
 *
 * @author CAEL
 */
public class Casas {

    private String[][] data = new String[11][4];
    String[] homonimas = new String[data.length * (data.length - 1) / 2];
    
    public String[][] getData() {
        return data;
    }
    
    public String[] getHomonimas() {
        return homonimas;
    }

    public void setData(String[][] data) {
        this.data = data;
    }

    public void crear() {
        /*String[] nroCasas = new String[10];
        for (int i = 0; i < nroCasas.length; i++){
            nroCasas[i] = "Casa " + i;
        }*/
        Object n_dimension;
        for (int i = 1; i < data.length; i++) {
            data[i - 1][0] = "Casa " + Integer.toString(i);
            for (int j = 1; j < data[0].length; j++) {
                if(j == 1){
                    n_dimension = Utiles.randomInt(1, 15);
                    data[i - 1][j] = n_dimension.toString(); 
                } else{
                    n_dimension = Utiles.redondear(Utiles.generaNumeroRangoFloat(5, 16));
                    data[i - 1][j] = n_dimension.toString();
                }
                
            }
        }
    }
    
    public Integer verificar() {
        Integer pos = -1;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[1].length; j++) {
                if (data[i][j] == null) {
                    pos = i;
                    break;
                }
            }
            if(pos != -1)
                break;
        }
        return pos;
    }
    
    public Boolean guardar(Integer nro_pisos, Float largo, Float ancho){
        int pos = verificar();
        if(pos >= 0){
            data[pos][1] = nro_pisos.toString();
            data[pos][2] = largo.toString();
            data[pos][3] = ancho.toString();
            return true;
        }
        return false;
    }
    
    public void findHomonimas() {
        int cont = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i][1].equals(data[j][1]) && data[i][2].equals(data[j][2]) && data[i][3].equals(data[j][3])) {
                    if (!data[i][0].equals(data[j][0])) {
                        homonimas[cont] = "Las casas:\n" + data[i][0] + " y " + data[j][0] + " son homónimas.";
                        cont++;
                        //data[i][0] + " y " + data[j][0] + " son homonimas";
                    }
                }
            }
        }
    }
    
    public Boolean generateFile() {
        if (data != null) {
            String pathNotas = "files" + File.separatorChar + "casas" + File.separatorChar + "casas.txt";
            try {
                FileWriter file_matriz = new FileWriter(pathNotas);
                for (int i = 0; i < data.length-1; i++) {
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
    
    public Boolean cargarArchivo(String direc) {
        String pathNotas = "files" + File.separatorChar + direc + File.separatorChar + "casas.txt";

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
    
}
