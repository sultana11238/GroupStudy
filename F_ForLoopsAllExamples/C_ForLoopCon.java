package F_LoopsAllExamples;

public class C_ForLoopCon {

	public static void main(String[] args) {
		// Continue Statement examples 
//		for (int i=1; i<=15; i++) // skipping values that are divisible by 2
//			{if (i%2 == 0) 
//				{continue;} 
//		System.out.println(i);  
//		}
		
		// this is standard spacing/ standard practice
		for (int i=1; i<=15; i++) 
		{
			if (i == 3 || i==7 || i==11 || i==12) 			
			{
				continue;
				} 
		System.out.println(i);  
	}

	}

}
