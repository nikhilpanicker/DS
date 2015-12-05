
public class LinkedList1 {
	
	private Link first;
	
	public LinkedList1()
	{
		first = null;
	}

	public void insertFirst(int id, double dd)
	{
		Link newLink = new Link(id,dd);
		newLink.next=first;
		first=newLink;
	}
	
	public Link find(int key)
	{
		Link current=first;
		while(current.iData!=key)
		{
			if(current.next==null)
				return null;
			else
				current=current.next;
		}
		return current;
	}
	
	public Link delete(int key)
	{
		Link current = first;
		Link previous = null;
		while(current.iData!=key)
		{
			if(current.next==null)
				return null;
			else
				previous=current; 
				current=current.next;
		}
		
		if(current==first)
			first.next=first;
		else
		    previous.next=current.next;
		
		return current;
		
	}
	
	public void displayList()
	{
		System.out.println("List (first-->last): ");
		Link current = first;
		while(current!=null)
		{
			current.Display(); // print data
			current = current.next;
		}
		System.out.println("");
	}
}
