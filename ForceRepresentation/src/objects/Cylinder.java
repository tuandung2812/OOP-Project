package objects;


public class Cylinder extends ActedObject {
	private double radius;
	private double angularPosition;
	private double angularVelocity;
	private double angularAcceleration;
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getAngularPosition() {
		return angularPosition;
	}


	public double getAngularVelocity() {
		return angularVelocity;
	}

	public double getAngularAcceleration() {
		return angularAcceleration;
	}
	
	//Update angular acceleration
	public void setAngularAcceleration() {
		double newAngularAcceleration;
		double friction = this.frictionalForce.getMagnitude();
		newAngularAcceleration = friction / ( (mass /2 ) * ( radius * radius) );
		this.angularAcceleration = newAngularAcceleration;
	}
	
	public void setAngularVelocity() {
		double newAngularVelocity;
		newAngularVelocity = angularVelocity + angularAcceleration * deltaT; 
		this.angularVelocity = newAngularVelocity;
	}
	
	public void setAngularPosition() {
		double newAngularPosition;
		newAngularPosition = angularPosition + angularAcceleration * deltaT; 
		this.angularPosition = newAngularPosition;
	}


	public Cylinder(double mass, double x, double y, double radius) {
		super(mass, x, y);
		this.radius = radius;
		// TODO Auto-generated constructor stub
	}
	
	
	

	
}
