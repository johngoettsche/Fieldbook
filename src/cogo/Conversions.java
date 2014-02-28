/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cogo;

/**
 *
 * @author John
 */
public class Conversions {
    public static double azimuthToDirection(String thisAzimuth){
        String[] parts = thisAzimuth.split(".");
        double degree = Double.parseDouble(parts[0]);
        double minutes = Double.parseDouble(parts[1].substring(0, 1));
        double seconds = Double.parseDouble(parts[1].substring(2));
        System.out.println(thisAzimuth + 
                "\nDegree:  " + degree +
                "\nMinutes: " + minutes +
                "\nSeconds: " + seconds +
                "\n");
        double azimuth = degree + minutes / 60 + seconds / 3600;
        return Math.PI * ((90 - azimuth) / 180);
    }
    
    public static String directionToAzimuth(double direction){
        
        return null;
    }
}
