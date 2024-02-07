public class Rectangle {
	private double width;
	private double height;
	
	
	public Rectangle(double w, double h) {
		width = w;
		height = h;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
		

	
}
