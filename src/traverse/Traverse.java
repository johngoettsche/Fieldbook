/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package traverse;

import java.util.ArrayList;
import points.Point;

/**
 *
 * @author John
 */
public class Traverse {
    ArrayList<Point> traverse;
    
    public Traverse(){
        traverse = new ArrayList<Point>();
    }
    
    public void add(Point point){
        traverse.add(point);
    }
    
    public String printTraverse(){
        String result = "";
        for(int i = 0; i < traverse.size(); i++){
            result += traverse.get(i).getRawData().printRawData();
        }
        return result;
    }
}
