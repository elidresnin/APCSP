import java.util.*;
public class GeometryMain {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Rectangle r;
		Polygon p;
		
		int menu= 0;
		
		while (menu != 3) {
			System.out.println("Enter:");
			System.out.println("1 - Rectangle");
			System.out.println("2 - Polygon");
			menu = s.nextInt();
			
			if (menu == 1) {
				System.out.println("enter length and width");
				r = new Rectangle(s.nextDouble(), s.nextDouble());
				System.out.println("Area = " + r.area());
				System.out.println("Perimeter = " + r.perimeter());
				
			}
			
			if (menu == 2) {
				System.out.println("enter length and number of sides");
				p = new Polygon(s.nextInt(), s.nextDouble());
				System.out.println("Area = " +p.getArea());
				System.out.println("Perimeter = " + p.getPerimeter());
				
			}
			else {
				System.out.println("goodbye");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
