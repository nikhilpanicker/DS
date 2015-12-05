import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class LongestSubstring {

	public static void main(String args[])
	{
		String s = "a0BaA";
		int len = s.length();
		int max=0;
		int Max_length=0;
		for (int j=len; j>0;j--)
		//for(int j=0;j<len-1;j++)
		{
			for(int i =0;i<j;i++)
			//for(int i =j+1;i<len;i++)
			{
				System.out.println(s.substring(i, j)+": "+isPassword(s.substring(i, j)));
				if(isPassword(s.substring(i, j)))
					Max_length=Math.max(Max_length, j-i);
			}
		}
		System.out.println(Max_length);
	}
	
	public static boolean isPassword(String pass)
	{	
	    String pattern= "^[a-zA-Z]*$";
        if(pass.matches(pattern)){
            return true;
        }
        return false; 
	}
}
