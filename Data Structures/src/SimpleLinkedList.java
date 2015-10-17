
public class SimpleLinkedList {

	public static void main(String main[])
	{
		LinkedList thelist = new LinkedList();
		Link f;
		thelist.insertFirst(10, 100);
		thelist.insertFirst(20, 200);
		thelist.insertFirst(30, 300);
		thelist.insertFirst(40, 400);
		thelist.insertFirst(50, 500);
		
		thelist.displayList();
		
		f = thelist.find(30);
		keyFound(f);
		f = thelist.find(50);
		keyFound(f);
		
		thelist.delete(30);
		thelist.displayList();
				
	}
	
	public static void keyFound(Link f)
	{
		if(f!=null)
			System.out.println("Found key: "+f.iData);
		else
			System.out.println("Key nt found");
	}
	
}
