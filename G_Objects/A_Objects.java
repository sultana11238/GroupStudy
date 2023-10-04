package G_Objects;

public class A_Objects {
	// below are instance variables 
		int num1 = 5;
		int num2 = 10; 
		String name = "Mahadi"; 
		int age = 28; 
		String city = "Dhaka"; 
		
		void sum (int a,int b) { // methods with parameters
			System.out.println("Sum is " + (a+b));
		}// the method has been defined, it has been written 
		
		void message (String msg) {
			System.out.println(msg);
		}

		void sub (int a,int b) {
			System.out.println("Subtraction is " + (a-b));
		}
		
		void mul (int a,int b) {
			System.out.println("Multiplcation is " + (a*b));
		}
		
		void div (int a,int b) {
			System.out.println("Divison is " + (a/b));
		} 
		
		void EvenorOdd (int num) {
			if (num %2 ==0) {
				System.out.println("Even Number");
			}
			else {
				System.out.println("Odd Number");
				}
		}
		
		
		public static void main(String[] args) {
			A_Objects obj = new A_Objects ();
//			System.out.println(obj.num2);// no parathesis are needed for calling variables only methods 
//			obj.sum(10,5);
//			obj.sub(10,5);
//			obj.mul(10,5);
//			obj.div (10,5); 
//			System.out.println(obj.age+ "\n " 
//					+obj.name+ "\n "+ obj.city ); // this is how you use one print line but have different lines in your console 
//			obj.message("This is Sunday 9:33 pm");
//			obj.message("Hello Prima");
//			obj.message("Hello Lipi");
//			obj.message("Hello Sultana"); //the method can be called as many times as you like 
			obj.EvenorOdd(19);
			obj.EvenorOdd(20);
			
			

		}
}
