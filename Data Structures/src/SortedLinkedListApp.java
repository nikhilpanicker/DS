
public class SortedLinkedListApp {

	public static void main(String args[])
	{
		SortedLinkedList sll = new SortedLinkedList();
		sll.insert(20);
		sll.insert(30);
		sll.insert(40);
		//sll.display();
		sll.insert(10);
		sll.insert(10);
		sll.insert(20);
		sll.insert(30);
		sll.insertFirst(50);
		sll.display();
		//System.out.println(sll.delete(20));
		System.out.println();
		sll.removeDups();
		sll.display();
		
	}
}
