package K_Parameters;

public class Parameters {
	
	int sum (int a, int b) {
		System.out.print("Sum are: ");
		return a+b; 
	}
	
	//void information (String a, int b, String c, String d) <-- can also do this
	//System.out.println("Name: " + a); and so on and so forth
	void information (String name, int age, String hometown, String subject) {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Hometown: " + hometown);
		System.out.println("Subject: " + subject);// had to add the +__ because we are using mixed data types 
	}
	
	public static void main(String[] args) {
		Parameters obj = new Parameters (); 
		//obj.sum(); usually this is all you need but when you call a usually a method 
		//System.out.println(obj.sum(5,6));
		//System.out.println(obj.sum(35,10));
		obj.information("Sultana", 24, "Brooklyn", "Enviro Sci");// this is a void so no need to use a printline
	
		
		
		
		
	}
}
