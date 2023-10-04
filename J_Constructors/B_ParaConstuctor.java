package J_Constructors;
//Parameterized Constructor 
public class B_ParaConstuctor {

	B_ParaConstuctor(int a, int b){ //<--- this is a constructor 
		System.out.println("Hello Constuctor");
		System.out.println("Sum are: " + (a+b));
	}
	
	B_ParaConstuctor(int a, int b, int c){ //<--- this is a constructor 
		System.out.println("Hello Constuctor");
		System.out.println("Sum are: " + (a+b));
	}
	public static void main(String[] args) {
		B_ParaConstuctor obj= new B_ParaConstuctor(45,10); //<-- this will print the constructor without it being "called"
		B_ParaConstuctor obj1= new B_ParaConstuctor(45,10, 20); //<-- this is a another constructor but we changed the object name
	}
	
}
