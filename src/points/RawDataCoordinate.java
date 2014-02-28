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
public class RawDataCoordinate extends RawData{ 
    public RawDataCoordinate(Coordinate thisCoordinate){
        this.coordinate = thisCoordinate;
    }
    
    public RawDataType getRawDataType(){
        return RawDataType.Coordinate;
    }
    
    public String printRawData(){
        String result = "By Coordinate:\n" +
                "\t" + coordinate.getNorthing() +
                ", " + coordinate.getEasting() +
                ", el: " + coordinate.getElevaion() +
                "\n";
        return result;
    }
    
    public void update(Coordinate origin){

    }
}
