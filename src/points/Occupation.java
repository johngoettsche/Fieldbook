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
public class Occupation {
    public static enum BacksightType{
        None,
        Azimuth,
        Point
    }
    
    private Point occupationPoint;
    private Point backsightPoint;
    private double azimuth;
    
    public Occupation(){
        
    }
    
    public Point getOccupationPoint(){
        return null;
    }
    
    public double getInstrumentHeight(){
        return 0.0;
    }
    
    public Point getBackSight(){
        return null;
    }
    
    public double getBackAzimuth(){
        return 0.0;
    }
    
    public double getBackSightHeight(){
        return 0.0;
    }
}
