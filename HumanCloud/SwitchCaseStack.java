package HumanCloud;

import java.util.Scanner;

public class SwitchCaseStack {
	
	String choice =null;
    int p;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	Node head = null;
	
	public void getLL()
	{
		int data,n,num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Data :");
		data = sc.nextInt();
		
		Node new_node = new Node(data);
		
		if(head==null)
		{
			head = new_node;
		}
		
		else
		{
			do
			{
				System.out.println("!! Operation on Linked List !!");
				System.out.println("1. InsertAtFirst()");
				System.out.println("1. InsertAtLast()");
				System.out.println("1. InsertAtMiddle()");
				System.out.println("Exit");
				System.out.println("Enter Your Choice :");
				data = sc.nextInt();

				 switch(data)
		            {
		            case 1:
		            	new_node.next = head;
		            	head= new_node;
		            	break;
		            	
		            case 2:
		            	Node temp=head;
		            	while(temp.next!=null)
		            	{
		            		temp =temp.next;
		            	}
		            	temp.next = new_node;
		            	break;
		            	
		            case 3:
		            	System.out.println("Enter the position of node to inter:");
		            	p = sc.nextInt();
		            	
		            	Node temp2 = head;
		            	
		            	for(int i=0; i<(p-1);i++)
		            	{
		            	temp2 = temp2.next;
		            	}
		            	new_node.next = temp2.next;
		            	temp2.next = new_node;
		            	break;
		            	
		            case 4:
		            	choice ="N";
		            	break;
		            	
		            	default:
		            		System.out.println("Wrong Choice!");
		            }
				  if(choice == null)
		            {
		            	System.out.println("Do You Wants to Continue? Yes or No");
		            	choice = sc.next();
		            }
			}
			
			while(choice.equalsIgnoreCase("Yes"));
			System.out.println("!! Operations ends of Array !!");

				
			}
		}
	}

