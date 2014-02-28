package points;

public class Shot {
	private double horizontalAngle;
	private double verticalAngle;
	private double slopeDistance;
	
	public Shot(double thisHorizontalAngle,
			double thisVerticalAngle,
			double thisSlopeDistance){
		this.horizontalAngle = thisHorizontalAngle;
		this.verticalAngle = thisVerticalAngle;
		this.slopeDistance = thisSlopeDistance;
	}
	
	public double getHorizontalAngle(){
		return horizontalAngle;
	}
	
	public double getVerticalAngle(){
		return verticalAngle;
	}
	
	public double getSlopeDistance(){
		return slopeDistance;
	}
}
