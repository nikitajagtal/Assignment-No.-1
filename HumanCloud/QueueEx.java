package HumanCloud;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class QueueEx {

	public static void getQueue()
	{
		try
		{
			
		
		Queue<Integer>queue = new LinkedList<>();
		
		Scanner sc = new Scanner(System.in);
		int input;
		String choice=null;
		
		do
		{
			System.out.println("!! Operations on Queue !!");
			System.out.println("1. insert()");
			System.out.println("2. remove()");
			System.out.println("3. front()");
			System.out.println("4. Exit");
			System.out.println("Enter Your Choice");
			
			input = sc.nextInt();
			
			switch(input)
			{
			case 1:
				System.out.println("Enter Number of Elements Wants to Enter in Queue");
				int n = sc.nextInt();
				System.out.println("Enter "+ n + " Values :");
				for(int i =0; i<n; i++)
				{
					queue.add(sc.nextInt());
				}
				System.out.println("Queue Data :");
				System.out.println(queue);
				break;
				
			case 2:
				System.out.println("Method of remove()"+ queue.remove());
				break;
				
			case 3:
				System.out.println("Method of peek()"+ queue.peek());
				break;
				
			case 4:
				choice ="N";
				break;
				
				default:
					System.out.println("Wrong Choice!");
			}
		if(choice == null)
		{
			System.out.println("Do you Wants to Continue? YES or NO");
			choice = sc.next();
		}
		}
		while(choice.equalsIgnoreCase("YES"));
		System.out.println("!! Operations ends of Queue !!");
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
		
		
		


	
	
	   

