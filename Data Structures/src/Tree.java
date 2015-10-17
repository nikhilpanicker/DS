import java.util.*;
public class Tree {

	public Node root;
	
	Tree()
	{
		root = null;
	}
	
	public Node find(int key)
	{
		Node current = root;
		while(current.iData!=key)
		{
			if (key>current.iData)
			{
				current= current.rightChild;
			}
			else
			{
				current = current.leftChild;
			}
			if (current==null)
				return null;
		}
		return current;
	}
	
	public void insert(int id, int dd)
	{
		Node newNode = new Node();
		newNode.iData=id;
		newNode.dData=dd;
		
		if(root == null)
			root = newNode;
		
		else
		{
			Node current = root;
			Node parent;
			while(true)
			{
				parent = current;
				if(id <current.iData)
				{
					current =current.leftChild;
					if(current==null)
					{
						//current = newNode;
						parent.leftChild=newNode;
						return;
					}
				}
				else
				{
					current =current.rightChild;
					if(current==null)
					{
						//current = newNode;
						parent.rightChild=newNode;
						return;
					}
				}
						
			}
		}
	}
		
		public void displayTree()
		{
		//Stack globalStack = new Stack();
			Stack globalStack = new Stack(100);
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("......................................................");
		while(isRowEmpty==false)
		{
			Stack localStack = new Stack(100);
			isRowEmpty = true;
			
			for(int j=0; j<nBlanks; j++)
			System.out.print(" ");
			
			while(globalStack.isEmpty()==false)
			{
				Node temp = (Node)globalStack.pop();
				if(temp != null)
				{
					System.out.print(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);
					if(temp.leftChild != null ||
					temp.rightChild != null)
					isRowEmpty = false;
				}
				else
				{
					System.out.print("--");
					localStack.push(null);
					localStack.push(null);
				}
				for(int j=0; j<nBlanks*2-2; j++)
				System.out.print(" ");
			} // end while globalStack not empty
			
			System.out.println();
			nBlanks /= 2;
			
			while(localStack.isEmpty()==false)
			globalStack.push( localStack.pop() );
			
		} // end while isRowEmpty is false
		System.out.println("......................................................");
		}
	
}
