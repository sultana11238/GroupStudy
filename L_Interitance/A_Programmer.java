package L_Inheritance;

public class A_Programmer extends B_Employee { // <--- Inheritance initiated, the class with the "extends" is the child class
	int bonus = 2000; 
	
	public static void main(String[] args) {
		A_Programmer obj = new A_Programmer(); 
		System.out.println(obj.salary); //<-- these are int's so no new value can be given 
		System.out.println(obj.bonus); // <--- int variables so need to use sysout
	}

}
