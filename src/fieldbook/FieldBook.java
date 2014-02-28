/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fieldbook;

import java.util.ArrayList;
import points.Point;
import points.PointFactory;
import traverse.Traverse;
import view.MainFrame;

/**
 *
 * @author John
 */
public class FieldBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Point> points = new ArrayList<Point>();
        ArrayList<Traverse> traverses = new ArrayList<Traverse>();
        
        PointFactory pointFactory = new PointFactory();
        
        MainFrame mainFrame = new MainFrame(points, pointFactory, traverses);
    }
}
