package objects;

public class Surface {
	
	private double static_friction_coef;
	private double kinetic_friction_coef;
	
	
	public double getStatic_friction_coef() {
		return static_friction_coef;
	}
	public void setStatic_friction_coef(double static_friction_coef) {
		this.static_friction_coef = static_friction_coef;
	}
	public double getKinetic_friction_coef() {
		return kinetic_friction_coef;
	}
	public void setKinetic_friction_coef(double kinetic_friction_coef) {
		this.kinetic_friction_coef = kinetic_friction_coef;
	}
	
	
	public Surface(double static_friction_coef, double kinetic_friction_coef) {
		super();
		this.static_friction_coef = static_friction_coef;
		this.kinetic_friction_coef = kinetic_friction_coef;
	}
	
	

	
}
