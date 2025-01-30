/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Random;

/**
 *
 * @author JAIMEUNL
 */
public class Utiles {
    public static boolean validate(String num) {
        if(num != null){
            boolean band = true;
            if (num.charAt(0) == '-') {
                num = num.substring(1);
            }
            //System.out.println(num);
            int cont_p = 0;
            for (int i = 0; i < num.length(); i++) {
                if (!Character.isDigit(num.charAt(i)) && num.charAt(i) != '.') {
                    band = false;
                    break;
                } else if (num.charAt(i) == '.') {
                    cont_p++;
                }
            }
            if (cont_p >= 2) {
                band = false;
            }
            return band;
        }else{
            return false;
        }
    }
    
    public static boolean validateInt(String num) {
        boolean intisValid;
        Integer numeroLenght = num.length();
        int i = 0;
        do {
            char c = num.charAt(i);
            if (Character.isDigit(c)) {
                intisValid = true;
            } else {
                intisValid = false;
                break;
            }
            i++;
        } while (i < numeroLenght);
        return intisValid;
    }
    public static Integer transformStringInt(String num){
        Integer resp = null;
        if(Utiles.validateInt(num)) {
            resp = Integer.valueOf(num);//Integer.parseInt(num);
        }
        return resp;
    }

    public static Double transformStringDouble(String num) {
        Double resp = null;
        if(Utiles.validate(num)) {
            resp = Double.parseDouble(num);
        }
        return resp;
    }

    public static Float transformStringFloat(String num) {
        Float resp = null;
        if(Utiles.validate(num)) {
            resp = Float.parseFloat(num);
        }
        return resp;
    }

    public static int randomInt(int minimo, int maximo) {
        Random random = new Random();
        //2 - 10
        //2 + 11 - 2   -----  2 + (9) 
        return minimo + random.nextInt((maximo + 1) - minimo);
    }

    public static float generaNumeroRangoFloat(float minimo, float maximo) {
        Random random = new Random();
        //2 - 10
        //2 + 11 - 2   -----  2 + (9) 
        return minimo + random.nextFloat((maximo + 1) - minimo); //Nota: Existen versiones de java en las que este metodo no funciona, esta pensado para java 23
    }

    public static float redondear (float num) {
       float aux = num*100.00f;
       float aux1 = (float)((int)aux); 
       return (aux1/100.00f);
        // return (float)(Math.round(num*100.00)/100.00);
    }
}
