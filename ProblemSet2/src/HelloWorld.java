import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		 
		 //Problem 1
		 double Jan, Feb, Sum, Dif;
		 boolean DoS;

		 
		 System.out.println("Do you want to look at the difference or sum?(difference is true)");

		 DoS = s.nextBoolean();

		 System.out.println("What is January");

		 Jan = s.nextDouble();

		 System.out.println("What is Febuary");
		 Feb = s.nextDouble();

		 if (DoS == true) {
			Dif = Jan - Feb;
		 	System.out.println(Dif);
		 }

		 else {
			 Sum = Jan + Feb;
			 System.out.println(Sum);
		 }
	
		 //problem2
		 
		 double age;
		 System.out.println("How old are you?");
		 age = s.nextDouble();
		 
		 if (age > 150 || age < 0) {
			 System.out.println("Impossible");
			
		 }
		 else if (age <= 18) {
			 System.out.println("You are a child.");
			
		 }
		 else if (age <= 65) {
			 System.out.println("You are an adult.");
			
		 }
		 else if (age >= 65) {
			 System.out.println("You are a Senior Citizen.");
			
		 }
		 
		 //problem 3
		 
		 int totalCalories, fatGrams, fatCalories, fatPercent;
		 
		 System.out.println("How many calories?");
		 totalCalories = s.nextInt();
		 
		 System.out.println("How many grams of fat?");
		 fatGrams = s.nextInt();
		 
		 if (fatGrams <=0 || totalCalories <=0) {
			 System.out.println("invalid data");
		 }
		 else {
		 fatCalories = fatGrams * 9;
		 
		 fatPercent = (totalCalories * fatCalories) / 100;
		 
		 System.out.println("There are " + fatCalories + " fat calories");
		 
		 System.out.println("The fat percentage is " + fatPercent + "%");
		 }
		 
		 //problem4
		 int totalCalories, fatGrams, fatCalories, fatPercent;
		 
		 System.out.println("How many calories?");
		 totalCalories = s.nextInt();
		 
		 System.out.println("How many grams of fat?");
		 fatGrams = s.nextInt();
		 
		 if (fatGrams >=0 || totalCalories >=0) {
			 System.out.println("invalid data");
		 }
		 else {
		 fatCalories = fatGrams * 9;
		 
		 fatPercent = (totalCalories * fatCalories) / 100;
		 
		 System.out.println("There are " + fatCalories + " fat calories");
		 
		 System.out.println("The fat percentage is " + fatPercent + "%");
		 }
		 
		 //Problem 5
		 
		 int year;
		 
		 System.out.println("What year?");
		 year = s.nextInt();
		 
		 if (year < 1582) {
			 System.out.println("Not a leap year.");
		 }
		 else if (year % 400==0) {
			 System.out.println("It is a Leap year!");
		 }
		 else if (year % 100==0) {
			 System.out.println("It is not a Leap year!");
		 }
		 else if (year % 4==0) {
			 System.out.println("It is a Leap year!");
		 }
		 else 
			 System.out.println("It is not a Leap year!");
		 }
		 

	}


