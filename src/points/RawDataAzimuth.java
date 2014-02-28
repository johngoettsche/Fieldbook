/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package points;

import cogo.Conversions;

/**
 *
 * @author John
 */
public class RawDataAzimuth extends RawData{
    public RawDataAzimuth(Coordinate origin, String thisAzimuth, double thisHorizontalDistance){
        direction = Conversions.azimuthToDirection(thisAzimuth);
        horizontalDistance = thisHorizontalDistance;
        update(origin);
    }
    
    public RawDataType getRawDataType(){
        return RawDataType.Azimuth;
    }
    
    public String printRawData(){
        String result = "By Azimuth:\n" +
                "direction: " + direction +
                "distance: " + horizontalDistance +
                "\n";
        return result;
    }
    
    public DirectionType getDirectionType(){
        return DirectionType.Azimuth;
    }
    
    public void update(Coordinate origin){
        double northing = horizontalDistance * Math.asin(direction) + origin.getNorthing();
        double easting = horizontalDistance * Math.acos(direction) + origin.getEasting();
        double elevation = origin.getElevaion();
        coordinate = new Coordinate(northing, easting, elevation);
    }
    
    public Point getOrigin(){
        return origin;
    }
    
    public String getAzimuth(){
        return null;
    }
    
    public double getHorizontalDistance(){
        return horizontalDistance;
    }
}
