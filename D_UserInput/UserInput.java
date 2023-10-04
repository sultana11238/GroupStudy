package D_UserInput;
import java.util.Scanner; // important 

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
//		System.out.print("Enter First Number:  ");
//		int num1 = sc.nextInt(); 
//		System.out.print("Enter Second Number:  ");
//		int num2 = sc.nextInt();
//		int sum = num1 + num2;
//		System.out.println("Sum of two numbers are: " + sum);
//		
//		
//		System.out.print("Enter Third Number: ");
//		float num3 = sc.nextFloat(); 
//		System.out.print("Enter Fourth Number: ");
//		float num4 = sc.nextFloat();
//		float add = num3 + num4;
//		System.out.println("Sum of two numbers are: " + add);
//		
//		
//		System.out.print("Enter First Participant Name: ");
//		String person1 = sc.nextLine(); 
//		System.out.print("Enter Second Participant Name: ");
//		String person2 = sc.nextLine();
//		System.out.print("Enter Third Participant Name: ");
//		String person3 = sc.nextLine();
//		System.out.println("Today's participants are: " +person1 +", " +person2 +", " +person3 );
//	
		
		System.out.print("Enter your Name: ");
		String person4 = sc.nextLine(); 
		System.out.print("Enter your age: ");
		int age = sc.nextInt(); 
		System.out.print("Enter your Birthyear: ");
		int year = sc.nextInt();
		System.out.print("Enter your Subject: ");
		String subject = sc.next(); 
		System.out.print("Enter your Hometown: ");
		String hometown = sc.next(); 
		System.out.print("My Name is " +person4 +", " +"My Age is " +age +", " 
		+"My Birthyear is " +year +", " +"My Hometown is " +hometown +", " + "My Subject is " +subject);
		

	}

}
