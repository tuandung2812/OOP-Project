package force;
public abstract class Force {
	protected double magnitude;
	protected double rootX;
	protected double rootY;
	
	public double getMagnitude() {
		return magnitude;
	}
	public double getRootX() {
		return rootX;
	}
	public double getRootY() {
		return rootY;
	}
	
	public void setRootX(double rootX) {
		this.rootX = rootX;
	}
	public void setRootY(double rootY) {
		this.rootY = rootY;
	}
	
	
	public Force(double magnitude) {
		super();
		this.magnitude = magnitude;
	}
	
	
	public Force(double magnitude, double rootX, double rootY) {
		super();
		this.magnitude = magnitude;
		this.rootX = rootX;
		this.rootY = rootY;
	}
	
	
	
}
