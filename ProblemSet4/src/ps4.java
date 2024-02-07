import java.util.Scanner;

public class ps4 {
		public static void main(String[] args) {

		}
			private static final String  Eli = null;
			public static void greeting1() {
				System.out.println("Dear user, welcome to New Wave");

				}

			public static void greeting1(String r) {

				try (Scanner s = new Scanner(System.in)) {

					System.out.println("What is the name");

					s.next();

				}

				System.out.println("dear " + Eli + ", Welcome to New Wave");
			}

			public static int max(int a, int b) {

				

				if (a > b)

					return a;

					else

						return b;

			}

				public static int max(int a, int b, int c) {

					if ( a > b || a > c)

					return a;

					else if ( b > a || b > c)

						return b;

						else
			return c;		
				}
				
			public static int average(int a, int b, int c) {
				double d = (a * b * c) / 3;
						return (int) d;
				}
			
			public static int average(int a, int b, int c, int d) {
				double d2 = (a * b * c * d) / 3;
						return (int) d2;
			}
			
			public static int Intstr(int a, int b) {
				return (a + b);
			}
			
			public static String strInt( String a, String b) {
				return (a + b);
			}
		}
	


