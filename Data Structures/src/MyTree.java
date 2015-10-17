
public class MyTree {

	public Node root; 
	
	public Node returnRoot()
	{
		return root;
	}
	
	public Node find(int data)
	{
		Node current = root;
		
		while(current.dData!=data)
		{
			if(data<current.dData)
				current=current.leftChild;
			else
				current=current.rightChild;
			
			if(current==null)
				return null;
		}
		return current;
		
	}
	
	public void insert(int data,int id)
	{
		Node newNode = new Node();
		newNode.iData= id;
		newNode.dData= data;
		
		if(root==null)
			root=newNode;
		else
		{
			Node current=root;
			Node parent;
			while(true)
			{
				parent = current;
				if(data<current.dData)
				{
					
					current=current.leftChild;
					if(current==null)
					{
						parent.leftChild=newNode;
						return;
					}
					
				}
				else
				{
				
					//parent = current;
					current=current.rightChild;
					if(current==null)
					{
						parent.rightChild=newNode;
						return;
					}
					
				}
					
			}
		}
	}
	
	public void displayTree()
	{
		Stack outerStack = new Stack(25);
		Stack innerStack = new Stack(10);
		
		Node current =root;
		int height=0;
		
		outerStack.push(root);
		boolean rowExist = true;
		int nBlanks = 32;
		while(rowExist==true)
		{
			while(outerStack.isEmpty()==false)
			{
				rowExist=false;
				Node temp = outerStack.pop();
				if(temp!=null)
				{
					System.out.print(temp.dData+",");
					innerStack.push(temp.leftChild);
					innerStack.push(temp.rightChild);
					if(temp.leftChild != null ||temp.rightChild != null)
						rowExist = true;
				}
				
			}
			System.out.println();
			while(innerStack.isEmpty()==false)
			{
				outerStack.push(innerStack.pop());
			}
			height++;
		}
		System.out.println("Height"+height);
	}
	
	public void preOrder(Node root)
	{
		if(root!=null)
		{			
			System.out.print(root.dData+","); 
			preOrder(root.leftChild);
			preOrder(root.rightChild);
		}
	}
	
	public boolean isFullBinaryTree(Node current)
	{
		if(current==null)
			return true;
		if(current.leftChild==null && current.rightChild==null)
			return true;
		if(current.leftChild!=null && current.rightChild!=null)
			return(isFullBinaryTree(current.leftChild)&& isFullBinaryTree(current.rightChild));
		return false;
	}
	
	public int heightOfBinaryTree(Node node)
	{
	    if (node == null)
	    {
	        return 0;
	    }
	    else
	    {
	        return 1 +
	        Math.max(heightOfBinaryTree(node.leftChild),
	            heightOfBinaryTree(node.rightChild));
	    }
	}
}
