import java.util.ArrayList;
import java.util.*;
public class intFunction {
	
	public static ArrayList<Double> slope2PT(double x1, double y1, double x2, double y2) {
		ArrayList<Double> x = new ArrayList<Double>();
		double num = y2 - y1;
		double denom = x2 - x1 ;
		x.add(num);
		x.add(denom);
		return x;
		
	}
	public static String slopeIntForm(double m, double b) {
		return "y = " + m + "x + " + b ;
	}
	public static double getValue(double x, double slope, double offset) {
		
		return (slope*x)+offset;
	}
	
	

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
//		//slope2PT
//		System.out.println("Enter 2 points you want to calulate.");
//		System.out.println("Enter x1");
//		double x1 = s.nextDouble();
//		System.out.println("Enter y1");
//		double y1 = s.nextDouble();
//		System.out.println("Enter x2");
//		double x2 = s.nextDouble();
//		System.out.println("Enter y2");
//		double y2 = s.nextDouble();
//		System.out.println();
//		System.out.println(slope2PT(x1, y1, x2, y2));
//		
//		
//		//slopeIntForm
//		System.out.println("Enter slope as a decimal or whole number");
//		double slope = s.nextDouble();
//		System.out.println("Enter y-intercept");
//		double yInt = s.nextDouble();
//		System.out.println(slopeIntForm(slope, yInt));
		
		System.out.println("Enter the two linear equations to compare, both should be in slope intercept form, if y=mx+b is the equation, only input mx+b");
		String eq1 = s.nextLine();
		String eq2 = s.nextLine();
		String correctString = getX(eq1, eq2);
		String[] arrOfStr1 = correctString.split("@", 2);
		String newy = "";
	
		for(int i = 0; i<arrOfStr1[1].length(); i++) {
			char check = arrOfStr1[1].charAt(i);
			if(check!='@')
				newy+=check;
		}
		System.out.println("("+arrOfStr1[0]+", "+newy+")");
		
	}
	
	public static String getX(String eq1Uf, String eq2Uf) {
		
		
		String eq1 = "";
		for(int i = 0; i<eq1Uf.length(); i++) {
			char check = eq1Uf.charAt(i);
			if(check != ' ')
				eq1+=check;
		}
	
	
		String eq2 = "";
		for(int i = 0; i<eq2Uf.length(); i++) {
			char check = eq2Uf.charAt(i);
			if(check != ' ')
				eq2+=check;
		}
		
		
		String[] arrOfStr1 = eq1.split("x", 2);
		String[] arrOfStr2 = eq2.split("x", 2);
		 
		double slope1 = Double.valueOf(arrOfStr1[0]);
		
	
	
		double offset1 = Double.valueOf(arrOfStr1[1]);
		double slope2 = Double.valueOf(arrOfStr2[0]);
		
		
		
		double offset2 = Double.valueOf(arrOfStr2[1]);
//		System.out.println("debug offet1 "+offset1);
//		System.out.println("debug offet2 "+offset2);
//		System.out.println("debug slope1 "+slope1);
//		System.out.println("debug slope2 "+slope2);
		double correctx = 0;
		double testing1 = 0;
		double testing2 = 0;
		double realtesting = 0;
		if(slope1==slope2 && offset1 != offset2)
			return "null@null";
		if(slope1==slope2 && offset1 == offset2)
			return "inf@inf";
		//3-5  = -2                                                                    -1-(-1) = 0
		
		//test in the positive direction
			do {
				if(getValue(testing1, slope1, offset1)!=getValue(testing1, slope2, offset2))
					testing1++;
				if(getValue(testing2, slope1, offset1)!=getValue(testing2, slope2, offset2))
					testing2--;
			}while(getValue(testing1, slope1, offset1)!=getValue(testing1, slope2, offset2) && getValue(testing2, slope1, offset1)!=getValue(testing2, slope2, offset2));
		
	
		if(getValue(testing1, slope1, offset1) == getValue(testing1, slope2, offset2))
		return testing1+"@"+getValue(testing1,slope1,offset1);
		else if(getValue(testing2, slope1, offset1) == getValue(testing2, slope2, offset2))
			return testing2+"@"+getValue(testing2,slope1,offset1);
		else
			return "null@null";
//        for (String a : arrOfStr)
//            System.out.println(a+"@");

	}
	
	
}
