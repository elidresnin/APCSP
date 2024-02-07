
public class Rectangle {
	private int width;
	private int height;
	
	public Rectangle() {
		width = 5;
		height = 7;
		
	}
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public int area() {
		return width * height;
	}
	
	public int perimeter() {
		return 2 * (width + height);
	}
		

	
}
