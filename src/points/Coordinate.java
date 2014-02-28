/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package points;

/**
 *
 * @author John
 */
public class Coordinate {
    private double northing;
    private double easting;
    private double elevation;
    
    public Coordinate(double thisNorthing, double thisEasting, double thisElevation){
        this.northing = thisNorthing;
        this.easting = thisEasting;
        this.elevation = thisElevation;
    }
    
    public double getNorthing(){
        return northing;
    }
    
    public double getEasting(){
        return easting;
    }
    
    public double getElevaion(){
        return elevation;
    }
}

