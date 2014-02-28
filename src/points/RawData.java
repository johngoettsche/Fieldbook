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

public class RawData {
    Coordinate coordinate;
    Point origin;
    double direction;
    double zenith;
    double horizontalDistance;
    double slopeDistance;
    
public double getNorthing(){
        return coordinate.getNorthing();
    }
    
    public double getEasting(){
        return coordinate.getEasting();
    }
    
    public double getElevation(){
        return coordinate.getElevaion();
    }
    
    public Coordinate getCoordinate(){
        return coordinate;
    }
    
    public RawDataType getRawDataType(){
        return RawDataType.None;
    }
    
    public String printRawData(){
        return "Nothing";
    }
    
    public Point getOrigin(){
        return null;
    }
    
    public TurnedAngle getAngle(){
        return null;
    }
    
    public String getAzimuth(){
        return null;
    }
    
    public String getBearing(){
        return null;
    }
    
    public DirectionType getDirectionType(){
        return DirectionType.None;
    }
    
    public double getHorizontalDistance(){
        return 0.0;
    }
    
    public void update(Coordinate origin){
        
    }
}
