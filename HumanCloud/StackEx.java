package HumanCloud;

import java.util.Scanner;
import java.util.Stack;

public class StackEx {
	
	public static void getStack()
	{
		try {
		Stack<Integer> stack = new Stack<Integer>();
		
		Scanner sc = new Scanner(System.in);
		int input;
		String choice = null;
		
		do
		{
			System.out.println("!! Operations on Stack !!");
			System.out.println("1. push()");
			System.out.println("2. pop()");
			System.out.println("3. peek()");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice");
			
			input = sc.nextInt();
			
			switch(input)
			{
			case 1 :
				System.out.println("Enter Number of Elements Wants to Enter in Stack");
				int n = sc.nextInt();
				
				System.out.println("Enter "+ n + " values");
	
	             for(int i = 0; i < n; i++) 
	             {
	            	 stack.push(sc.nextInt());
	             }
	            	 System.out.println(" Stack Data :");
	            	 System.out.println(stack);
	                 break;
	                 
			case 2:
				System.out.println(" Method of pop()"+ stack.pop());
				break;
				
			case 3:
				System.out.println(" Method of peek()"+ stack.peek());
				break;
				
			case 4:
				choice = "N";
				break;
				
				default :
					System.out.println("Wrong Choice!");
				
	             }
			if(choice == null)
			{
				System.out.println("Do you wants to Continue ? YES or NO");
				choice = sc.next();
			}
		}
		while(choice.equalsIgnoreCase("yes"));
		System.out.println(" !! Operations ends of Stack !!");			
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
}
