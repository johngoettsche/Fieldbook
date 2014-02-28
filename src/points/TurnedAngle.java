/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package points;

import java.util.ArrayList;

/**
 *
 * @author John
 */
public class TurnedAngle {
        
    public static enum TurnedAngleType{
        None,
        Single,
        DoubleAccumulated,
        DoubleComparison
    }
    
    private ArrayList<Angle> angles;
    private Occupation occupation;
    private Coordinate coordinate;
    
    public TurnedAngleType getTurnedAngleType(){
        return TurnedAngleType.None;
    }
    
    public double getTargetHeight(){
        return 0.0;
    }
    
    public double getOffset(){
        return 0.0;
    }
    
    public double getDistanceAdjustment(){
        return 0.0;
    }
    
    public double getVerticleAdjustment(){
        return 0.0;
    }
    
    public Angle getAngle(){
        return null;
    }
        
    public double getHorizontalDistance(){
        return 0.0;
    }
    
    public double getVerticalDistance(){
        return 0.0;
    }
    
    public double getAngleRight(){
        return 0.0;
    }
    
    public double getForesightAzimuth(){
        return 0.0;
    }
  
    public Occupation getOccupation(){
        return occupation;
    }
    
    public Coordinate getCoordinate(){
        return coordinate;
    }
    
    public ArrayList getAngles(){
        return angles;
    }
}
