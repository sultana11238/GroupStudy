package H_Methods;

import java.util.Scanner;

public class D_MethodReturn_UI {
	int num1;
	int num2; 
	int num3; 
	
	int AddNumbers() {
		int sum = num1 + num2 + num3; 
		System.out.print("Sum is: ");
		return sum; 
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		D_MethodReturn_UI obj = new D_MethodReturn_UI ();
		System.out.print("Enter your first #: ");
		obj.num1 = sc.nextInt(); ;
		System.out.print("Enter a second #: ");
		obj.num2= sc.nextInt(); ; 
		System.out.print("Enter a third #: ");
		obj.num3= sc.nextInt(); ; 
		System.out.println(obj.AddNumbers()); 

	}

}
