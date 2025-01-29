/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

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

        for (int i = 1; i < data.length; i++) {
            data[i - 1][0] = "Casa " + Integer.toString(i);
            for (int j = 1; j < data[0].length; j++) {
                Integer n_dimension = Utiles.randomInt(1, 15);
                data[i - 1][j] = n_dimension.toString();
            }
        }
    }

    public void findHomonimas() {
        int cont = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i][1].equals(data[j][1]) && data[i][2].equals(data[j][2]) && data[i][3].equals(data[j][3])) {
                    if (!data[i][0].equals(data[j][0])) {
                        homonimas[cont] = "Las casas:\n" + data[i][0] + " y " + data[j][0] + " son homonimas.";
                        cont++;
                        //data[i][0] + " y " + data[j][0] + " son homonimas";
                    }
                }
            }
        }
    }
}
