import java.util.Scanner;
public class FunctionReview {

	public static int area(int width, int height) {
		return width * height;
	}
	public static int perimeter(int width, int height) {
		return 2* width + 2 * height;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter width and height");
		int w = s.nextInt();
		int h = s.nextInt();
		
		System.out.println("Area = " + area(w,h));
		System.out.println("Perimeter = " + perimeter(w,h));


	}

}
