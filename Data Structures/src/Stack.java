
public class Stack {

	private Node stackArray[];
	private int maxSize;
	private int top;
	public Stack(int maxSize) {
		this.maxSize = maxSize;
		stackArray = new Node[maxSize];		
		top = -1;
	}
	
	public String push(Node root)
	{
		//System.out.println("top"+top);
		if (top+1>=maxSize)
		{
			return "Stack i full";
		}
		else
		{
			stackArray[++top]=root;
			return null;
		}
	}
	
	public Node pop()
	{
		return stackArray[top--];
	}
	
	public Node peek()
	{
		return stackArray[top];
	}
	
	public boolean isEmpty() // true if stack is empty
	{
	return (top == -1);
	}
	
	public boolean isFull() // true if stack is full
	{
	return (top == maxSize-1);
	}
}
