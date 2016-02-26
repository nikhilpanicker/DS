package DS;

import java.util.Stack;

public class Parenthesis {

	public  static void main(String args[])
	{
		String str = "(())";
		System.out.println(validateParenthesis(str));
	}
	
	public static boolean validateParenthesis(String str)
	{
		Stack st = new Stack();
		boolean isvalid=true;
		
		if(str.length()%2 != 0)
			return false;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)=='(')
			{
				st.push('(');
			}
			else
			{
				if(st.peek()==null)
					return false;
				else
					st.pop();
			}
		}
		
		return isvalid;
	}
}
