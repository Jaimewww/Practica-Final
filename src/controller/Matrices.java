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

/**
 *
 * @author JAIMEUNL
 */
public class Matrices {
    private Float data[][];
    public Float[][] getData(){
        return this.data;
    }
    
    public void setData(Float[][] data){
        this.data = data;
    }
    
    public void crear(int n, int m){
        this.data = new Float[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                this.data[i][j] = 0.0f;
            }
        }
    }
    
    public Boolean generateFile(Float data[][], String direc){
        if(data != null){
            String pathNotas = "files" + File.separatorChar + direc + File.separatorChar + "matriz.txt";
            try{
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
            }catch(Exception e){
                return false;
            }
        }
        return false;
    }
    public Boolean cargarArchivo(String direc) {
        String pathNotas = "files" + File.separatorChar + direc + File.separatorChar + "matriz.txt";

        try {
            List<String> lines = Files.readAllLines(Paths.get(pathNotas));

            if (lines.isEmpty()) {
                //System.out.println("archivo vacio");
                return false;
            }

            int n = lines.size();
            int m = lines.get(0).split("\t").length;

            crear(n, m);

            int fila = 0;
            for (String linea : lines) {
                String[] aux = linea.split("\t");
                for (int col = 0; col < m; col++) {
                    if (col < aux.length) {
                        try {
                            data[fila][col] = Float.parseFloat(aux[col]);
                        } catch (NumberFormatException e) {
                            //System.out.println("Error al convertir: " + aux[col]);
                            data[fila][col] = 0.0f;
                        }
                    } else {
                        data[fila][col] = 0.0f;
                    }
                }
                fila++;
            }

            return true;

        } catch (Exception e) {
            //System.out.println("error al cargar:  " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
    
    public void deleteMult(Float[][] m, float mult){
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++){
                if(m[i][j] % mult == 0){
                    m[i][j] = 0.0f;
                }
            }
        }
    }
    
    public void deletePrim(Float[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                if (es_Primo(m[i][j])) {
                    m[i][j] = 0.0f;
                }
            }
        }
    }

    private boolean es_Primo(Float num) {
        
        if(num <= 1 || num != Math.floor(num)) return false;
        
        int n = num.intValue();
        
        if (n == 2 || n == 3) return true;
        
        if (n % 2 == 0 || n % 3 == 0) return false;
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    

    
    
    /*public static void main(String[] args){
        Matrices matrices = new Matrices();
        matrices.crear(6, 6);
        Informe.print_matriz(matrices.getData());
    }*/
}
