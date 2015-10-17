
public class SortedLinkedList {
	
	Link first;
	SortedLinkedList()
	{
		first = null;
	}
	
	public void insert(int value)
	{
		Link node = new Link(value,10.00);
		if(first == null)
			first=node;
		else
		{
			Link current = first;
			Link previous = null;
			while(current!=null && current.iData<node.iData)
			{
				previous=current;
				current=current.next;
			}
			if(previous == null)
			{
				first=node;
			}
			else{
			previous.next=node;
			}
			node.next=current;
		}
	}
	
	
	public String delete(int value)
	{
		Link current=first;
		Link previous=null;
		
		while(current!=null && current.iData!=value)
		{
			previous=current;
			current=current.next;
		}
		if(current.iData==value)
		{
			previous.next=current.next;
			return "Delete"+current.iData;
		}
		else
		{
			return "Element not found";
		}
				
		
	}
	
	public void removeDups()
	{
		Link current=first;
		Link previous = null;
		while(current!=null & current.next!=null)
		{
			previous=current;
			current=current.next;
			if(previous.iData==current.iData)
				previous.next=current.next;
		}
	}
	
	public void display()
	{
		Link current = first;
		while(current!=null)
		{
			System.out.print(" "+current.iData+"==> ");
			current = current.next;
			
		}
	}
	
	public void insertFirst(int value)
	{
		Link temp=first;
		Link node = new Link(value,10.00);
		first=node;
		first.next=temp;
		
	}
	
	
	public void sortList()
	{
		Link temp = first;
		//while()
	}

}
