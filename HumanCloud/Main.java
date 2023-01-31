package HumanCloud;

import java.util.Scanner;

public class Main {
	
	public enum linear{stack, queue, array, linkedlist}
	
	public static void main(String args[])
	{
		 Scanner sc = new Scanner(System.in);
		 int data;
		 String choice = null;
		 
		 do
		 {
		 System.out.println(" 1)Stack \n 2)Queue \n 3)Array \n 4)LinkedList");
		 
		 System.out.println("Please Enter Your Choice :");
		 data=sc.nextInt();
		 
		 switch(data) {
		 case 1:
			 StackEx.getStack();
			 break;
			 
		 case 2:
			 QueueEx.getQueue();
			 break;
			 
		 case 3:
			 ArrayEx.getArray();
			 break;
			 
		 case 4:
			 LinkedListEx ex = new LinkedListEx();
			 ex.getLL();
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
		System.out.println(" !! Operations Ends !!");		  
	        
	  
	}

}
