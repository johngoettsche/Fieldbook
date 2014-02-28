/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package points;

import java.util.ArrayList;
import view.PointByCoordinateDialog;

/**
 *
 * @author John
 */
public class PointFactory {
    public PointFactory(){
        
    }
    
    public Point createPointByCoordinate(ArrayList<Point> points){
        int highest = highestLabel(points);
        
        Coordinate coordinate = new Coordinate(0.0, 0.0, 0.0);
        RawDataCoordinate rawData = new RawDataCoordinate(coordinate);
        String description = "";
        
        Point newPoint = new Point(highest + 1, rawData, description);

        return newPoint;
    }
    
    private int highestLabel(ArrayList<Point> points){
        int highest = 0;
        if(points.size()>0){
            for(int p = 0; p < points.size(); p++){
                if(points.get(p).getLabel()>highest){
                    highest = points.get(p).getLabel();
                }
            }
        }
        return highest;
    }
}
