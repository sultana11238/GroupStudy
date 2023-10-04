package E_ConditionalStatments;
import java.util.Scanner;

public class B_ConditionalStatHW {
// with UserInput
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in); 
		//hw
		 System.out.print("Enter a year: ");
			int year = obj.nextInt();
		if ((year%400 == 0 )||(year%4 == 0 && year%100 !=0)) { //! is not and || is or 
			System.out.println("This is a leap year");	
			}
		else {
			System.out.println("This is not a leap year");	
			}
		// 2000, 2004, 2008, 2012 not leap 
		// 2023  leap 
	    

	}

}
