package I_Connecting;
//Connecting multiple classes pt. 1 
public class A_Lamp {
	boolean isOn;
	
	void TurnOn () {
		isOn = true; 
		System.out.println("Light On? " + isOn);
		
	}
	
	void TurnOff () {
		isOn= false; 
		System.out.println("Light On? " + isOn);
	}
		
}
