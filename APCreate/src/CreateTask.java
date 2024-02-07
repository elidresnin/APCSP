import java.util.*;

public class CreateTask {
	public static ArrayList<String> bankAdd(ArrayList<String> formulas, String response){
		formulas.add(response); 
		return(formulas);  
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> formulas = new ArrayList<String>();	    
		System.out.println("Welcome to the formula bank!");
		int x=0;
		int f=0;
		int yn2=1;
		int count=0;
		while(yn2==1){
			if(count>0) {
				System.out.println("Would you like to see your formulas?(1=y/2=n)");
				int yn3=Integer.parseInt(sc.nextLine());
				if(yn3==1){
					f=0;
					System.out.println("------------");
					x=formulas.size();
					while((x)!=f){
						System.out.println(formulas.get(0+f));
						f++;
					}
					System.out.println("------------");
					System.out.println("Here are your formulas");	
				}

			}
			count=0;
			System.out.println("How many formulas would you like to input?");
			int numFormulas=Integer.parseInt(sc.nextLine());
			//This for loop was worked on collaboratively with Aiden Chinwalla and Ivan Sanchez
			for (int i = 0; i < numFormulas; i++) {
				count++;
				System.out.println("Write your formula:");
				String response = sc.nextLine();
				if(count <= numFormulas) {
					bankAdd(formulas, response);
				}
				else if(count==numFormulas){
					System.out.println(bankAdd(formulas, response));
					System.out.println("Here are your formulas");
				}
			}

			System.out.println("Would you like to add more formulas?(1=y/2=n)");
			yn2=Integer.parseInt(sc.nextLine());
			if(yn2==2){
				System.out.println("Would you like to see your formulas?(1=y/2=n)");
				int yn3=Integer.parseInt(sc.nextLine());
				if(yn3==1){
					System.out.println("--------------");
					x=formulas.size();
					while((x)!=f){
						System.out.println(formulas.get(0+f));
						f++;
					}
					System.out.println("--------------");
					System.out.println("Here are your formulas");	


				}

			}
		}

	}
}
