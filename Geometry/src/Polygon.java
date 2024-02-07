
public class Polygon {
	private int sides;
	private double length;

	private double apothem;
	
	public Polygon(int sides, double length) {
		this.sides = sides;
		this.length = length;
		this.apothem = length / (2 * Math.tan(Math.PI/sides));
		
				
		
	}
	public Polygon() {
		sides=4;
		length=4;
		apothem= length/Math.tan(Math.PI/sides);
	}
	public int getSides() {
		return sides;
	}

	public void setSides(int sides) {
		this.sides = sides;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getApothem() {
		return length / (2 * Math.tan(Math.PI/sides));
	}
	public double getArea() {
		return getApothem() * length * sides * .5;
	}
	public double getPerimeter() {
		return sides * length;
	}

	

}
