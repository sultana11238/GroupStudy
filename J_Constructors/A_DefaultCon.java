package J_Constructors;
// Default Constructor
public class A_DefaultCon {
	int a; 
	int b;
	
//	DefaultCon (){ <-- in a default constructor is this is happening in the background, no matter what
//	a=0; 
//	b=0;			
//	}
	
	public static void main(String[] args) {
		A_DefaultCon obj = new A_DefaultCon(); 
		System.out.println(obj.a); 
		System.out.println(obj.b); 

	}
}
