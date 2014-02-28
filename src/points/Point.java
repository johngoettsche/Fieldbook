/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package points;

import java.util.ArrayList;

/**
 *
 * @author John Goettsche
 */
public class Point {
    private RawData rawData;
    private String description;
    private int label;
    private boolean updateMe;
    private boolean changed;
    private ArrayList<Point> listeners;
    
    public Point(int thisLabel, RawData thisRawData, String thisDescription){
        listeners = new ArrayList<Point>();
        this.label = thisLabel;
        this.rawData = thisRawData;
        this.description = thisDescription;
        this.updateMe = false;
        this.changed = false;
    }
    
    public void addListener(Point listener){
        listeners.add(listener);
    }
    
    public void removeListener(Point listener){
        listeners.remove(listener);
    }
    
    public void setLabel(int newLabel){
        this.label = newLabel;
    }
    
    public void setRawData(RawData newRawData){
        this.rawData = newRawData;
    }
    
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
    
    public void setUpdate(boolean newUpdate){
        this.updateMe = newUpdate;
    }
    
    public String getDescription(){
        return description;
    }
    
    public boolean needToUpdate(){
        return updateMe;
    }
    
    public void update(Coordinate origin){
        this.rawData.update(origin);
        for(int i = 0; i < listeners.size(); i++){
            listeners.get(i).update(this.rawData.getCoordinate());
        }
    }
    
    public int getLabel(){
        return label;
    }
    
    public double getNorthing(){
        return rawData.getNorthing();
    }
    
    public double getEasting(){
        return rawData.getEasting();
    }
    
    public double getElevation(){
        return rawData.getElevation();
    }
    
    public RawData getRawData(){
        return rawData;
    }
    
    public String printPoint(){
        String pointString = "";
        pointString += getIntString(label, 10);
        pointString += getDoubleString(rawData.getNorthing(), 20);
        pointString += getDoubleString(rawData.getEasting(), 20);
        pointString += getDoubleString(rawData.getElevation(), 20);
        pointString += expandString(description, 30);
        pointString += "\n";
        return pointString;
    }
    
    private String getIntString(int number, int len){
        String numberString = "";
        String nString = Integer.toString(number);
        int l = nString.length();
        for(int i = 0; i < len - l; i++){
            numberString += " ";
        }
        numberString += nString;
        return numberString;
    }
    
    private String getDoubleString(double number, int len){
        String numberString = "";
        String nString = Double.toString(number);
        int l = nString.length();
        for(int i = 0; i < len - l; i++){
            numberString += " ";
        }
        numberString += nString;
        return numberString;
    }
    
    private String expandString(String thisString, int len){
        String resultString = "";
        int l = thisString.length();
        for(int i = 0; i < len - l; i++){
            resultString += " ";
        }
        resultString += thisString;
        return resultString;
    }
}
