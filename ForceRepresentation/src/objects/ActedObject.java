package objects;

import force.*;
import java.lang.Math;

public abstract class ActedObject {

	protected double mass;
	protected GravitationalForce gravitationalForce;
	protected NormalForce normalForce;
	protected ActorForce actorForce;
	protected FrictionalForce frictionalForce;
	protected Surface surface;
	protected double deltaT;
	private double x;
	private double y;
	
	private double velocity;
	private double acceleration;

	
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public double getVelocity() {
		return velocity;
	}
	public void setVelocity(double velocity) {
		this.velocity = velocity;
	}
	public double getAcceleration() {
		return acceleration;
	}
	
	//Method to update the acceleration. Pass in the current actorForce and frictionalForce
	public void setAcceleration(ActorForce actorForce, FrictionalForce frictionalForce ) {
		double acceleration =  Math.abs(actorForce.getMagnitude() - frictionalForce.getMagnitude()) / mass;;
		this.acceleration = acceleration;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

	
	public ActedObject(double mass, double x, double y) {
		super();
		this.mass = mass;
		this.x = x;
		this.y = y;
	}
	
	
	public void setSumForce() {
		//Update the acceleration
		this.setAcceleration(actorForce, frictionalForce);
		
		//Update the velocity and position x
		double newVelocity = velocity + acceleration * deltaT;
		double newX = x + acceleration * deltaT;
		this.setVelocity(newVelocity);
		this.setX(newX);		
	}
	
	
	public void move() { 
		double newX = x + acceleration * deltaT;
		this.setX(newX);	

	};
	
	
	

}
