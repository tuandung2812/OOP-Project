package objects;

public class Cube extends ActedObject {
	private double sideLength;
	
	public double getSideLength() {
		return sideLength;
	}
	
	
	public Cube(double mass, double x, double y, double sideLength) {
		super(mass, x, y);
		this.sideLength = sideLength;
		// TODO Auto-generated constructor stub
	}


}
