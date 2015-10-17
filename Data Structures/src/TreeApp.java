
public class TreeApp {

	public static void main(String args[])
	{
		MyTree theTree = new MyTree();
		/*
		theTree.insert(50, 11);
		theTree.insert(25, 12);
		theTree.insert(75, 17);
		theTree.insert(12, 15);
		theTree.insert(37, 12);
		theTree.insert(43, 17);
		theTree.insert(30, 15);
		theTree.insert(33, 12);
		theTree.insert(87, 17);
		theTree.insert(93, 15);
		theTree.insert(97, 15);
		*/
		
		theTree.insert(50, 11);
		theTree.insert(25, 12);
		theTree.insert(75, 17);
		theTree.insert(12, 15);
		theTree.insert(27, 12);
		theTree.insert(53, 17);
		theTree.insert(85, 15);
		theTree.insert(33, 12);
		theTree.insert(87, 17);
		theTree.insert(93, 15);
		theTree.insert(97, 15);
		
		theTree.displayTree();
		theTree.preOrder(theTree.returnRoot());
		if(theTree.isFullBinaryTree(theTree.returnRoot()))
			System.out.println("Full Binary");
		else
			System.out.println("Not a full binary ttree");
		
		int height = theTree.heightOfBinaryTree(theTree.returnRoot());
		System.out.println("Height is: "+height);
		
		
	}
}
