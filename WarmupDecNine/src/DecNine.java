
import java.util.Scanner;

public class DecNine {

	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
		  double length, width, area;
		  
		  System.out.println("What is the length of the rectangle?");
		  length = s.nextDouble();
		  
		  System.out.println("What is the width of the rectangle?");
		  width = s.nextDouble();
		  
		  area = length * width;
		  
		  System.out.println("Width = " + width);
		  System.out.println("Length = " + length);
		  System.out.println("Area = " + area);
		  
	}

}
