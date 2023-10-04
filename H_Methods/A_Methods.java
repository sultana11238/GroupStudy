package H_Methods;

public class A_Methods {
	int mul1;
	int mul2; 
	int mul3; 

	int MulNumbers() {
		int mult = mul1 * mul2* mul3; 
		System.out.print("Multpiled Value: ");
		return mult; 
	}
	
	public static void main(String[] args) {
		B_Sum obj = new B_Sum ();
		obj.num1=1; 
		obj.num2=2; 
		obj.num3=2; 
		System.out.println(obj.AddNumbers()); 
		
		A_Methods sc = new A_Methods(); 
		sc.mul1 = 1; 
		sc.mul2 = 2; 
		sc.mul3 = 5; 
		System.out.println(sc.MulNumbers()); 
		
		C_Sub lo = new C_Sub(); 
		lo.sbnum1 = 30; 
		lo.sbnum2 = 3; 
		lo.sbnum3 = 7; 
		System.out.println(lo.SubNumbers()); 
		
		
		
	}
}
