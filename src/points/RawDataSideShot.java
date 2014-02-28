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
public class RawDataSideShot extends RawData{
    private Coordinate coordinate;
    private TurnedAngle angle;
    
    public RawDataSideShot(TurnedAngle thisAngle){
        this.angle = thisAngle;
    }
    
    public TurnedAngle getAngle(){
        return angle;
    }
    
    public TurnedAngle.TurnedAngleType getAngleType(){
        return angle.getTurnedAngleType();
    }
}
