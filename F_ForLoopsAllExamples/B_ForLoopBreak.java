package F_LoopsAllExamples;

public class B_ForLoopBreak {

	public static void main(String[] args) {
		//Break Statement examples 
//		for (int i=1; i<=10; i++) // want to break the loop after 1 turns to the number 5
//			{if (i==5) 
//				{break;} 
//		System.out.println(i);  
//		}

		for (int i=1; i<=10; i++) 
		{if (i%7 == 0) 
			{break;} 
	System.out.println(i);  
	}

	}

}
