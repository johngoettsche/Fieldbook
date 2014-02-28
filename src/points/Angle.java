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
public class Angle {
    private double horizontalAngle;
    private double zenith;
    private double slopeDistance;
    
    public Angle(double thisHorizontalAngle, double thisZenith, double thisSlopeDistance){
        this.horizontalAngle = thisHorizontalAngle;
        this.zenith = thisZenith;
        this.slopeDistance = thisSlopeDistance;
    }
    
    public double getHorizontalAngle(){
        return horizontalAngle;
    }
    
    public double getZenith(){
        return zenith;
    }
    
    public double getSlopeDistance(){
        return slopeDistance;
    }
}
