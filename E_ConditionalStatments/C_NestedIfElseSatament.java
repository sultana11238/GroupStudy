package E_ConditionalStatments;
import java.util.Scanner; 

public class C_NestedIfElseSatament {
// with user input 
	
	public static void main(String[] args) {
	// Nested if, else with user input 
	Scanner sc = new Scanner (System.in);
	System.out.print("Enter your Age: ");
	int age = sc.nextInt();
	System.out.print("Enter your weight: ");
	int weight = sc. nextInt();
	if(age >= 18) {
		if(weight >= 50 && weight <= 100) {
			System.out.println("you can donate blood");
		}
		else {
			System.out.println("You can't donate blood");
		}
	}
	else {
		System.out.println("Age must be greater than 18");
	}
	
	}
}
