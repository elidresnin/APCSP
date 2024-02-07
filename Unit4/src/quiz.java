import java.util.Scanner;
public class quiz {
//	public static double circumference(double radius) {
//		return radius * 2;
//		
//	}
	public static String typeOfTriangle(double side1, double side2, double side3) {
		if (side1 == side2 && side2 == side3) {
			return "equilateral";
		}
		if (side1 == side2 || side1 == side3) {
			return "isosceles";
		}
		
		else {
			return "scalene";
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the value of Side 1");
		double s1 = s.nextDouble();
		
		System.out.println("Enter the value of Side 2");
		double s2 = s.nextDouble();
		
		System.out.println("Enter the value of Side 3");
		double s3 = s.nextDouble();
		
		System.out.println("Your triangle is " + typeOfTriangle(s1, s2, s3));
		
	
//		System.out.println("Enter the radius of the circle:");
//		double r = s.nextDouble();
//		
//		System.out.println("The circumference of the circle is " + circumference(r));
	}
}
