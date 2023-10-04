package M_MultiLevelInheritance;

public class D_Main extends B_dog {
	
	public static void main(String[] args) {
//	D_Main lo = new D_Main(); 
//	lo.eat();
//	lo.bark();
//	lo.weep();
	// this is multilevel
	// if we change the puppy class to: public class puppy extends dog
	
	
	B_dog sc = new B_dog();  // animal and dog 
	C_puppy obj = new C_puppy(); // animal and puppy
	sc.bark(); 
	sc.eat(); 
	obj.weep(); 
 
	// this is hierarchical
	// right now the code is here 

}
}
