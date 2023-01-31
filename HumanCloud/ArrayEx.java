package HumanCloud;

import java.util.Scanner;

public class ArrayEx {
	
	public static void getArray()
	{
		try {
		
		Scanner sc = new Scanner(System.in);
		int input;
		String choice=null;	
		
		System.out.println("Enter Number of Elements wants to Enter in Array : ");
		int n = sc.nextInt();
		int a[] = new int[n+1];
		System.out.println("Enter " + n + " value");
		
	
		for(int i = 0; i < n; i++)
	    {
	        a[i] = sc.nextInt();
	    }
		System.out.println("Array Data :");
		for(int i = 0; i < n; i++)
		{
		System.out.println(a[i]);
		
		}
		
		do
		{
			System.out.println("!! Operation on Array !!");
			System.out.println("1. Insert()");
			System.out.println("2. Delete()");
			System.out.println("3. Search()");
			System.out.println("4. Exit()");
			System.out.println("Enter Your Choice");
			
			input = sc.nextInt();
			
			switch(input)
			{
			case 1 :
				System.out.println("Enter the position where you wants to Update :");
				int pos = sc.nextInt();
				
				System.out.println("Enter the Element which you wants to Update :");
				int n2 = sc.nextInt();
				

				for(int i =a.length-1; i<=pos-1;i--)
				{
					a[i] = a[i-1];	
				}
				 a[pos-1] = n2;
				 
				 for(int i= 0; i<a.length; i++)
				 {
					 System.out.println("Array Data :");
					 System.out.println(a[i]);
				 }	
				 break;
				
				
			case 2: 
				
				System.out.println("Enter the element which you wants to delete :");
			    n = sc.nextInt();
				
				for(int i =0; i<a.length;i++)
				{
					if(n==a[i])
					{
						for(int j=i; j<a.length;j++)
						{
							a[j] =a[j+1];
						}
						break;
					}
				}
				for(int i =0; i<a.length;i++)
				{
					System.out.println("Array Data :");
					System.out.println(a[i]);
				}
				break;
				
			case 3:
					System.out.println("Enter Element you wants to Search:");
					n= sc.nextInt();
					int flag=0;
					int i=0;
					
					  for(i = 0; i < n; i++)
				        {
				            if(a[i] == n)
				            {
				                flag = 1;
				                break;
				            }
				            else
				            {
				                flag = 0;
				            }
				        }
				        if(flag == 1)
				        {
				            System.out.println("Element found at position:"+(i + 1));
				        }
				        else
				        {
				            System.out.println("Element not found");
				        }
				        break;
				    
		
				
				 
			case 4:
				choice = "N";
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
		while(choice.equalsIgnoreCase("Yes"));
		System.out.println("!! Operations ends of Array !!");
		}
	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
	
	
	
	

