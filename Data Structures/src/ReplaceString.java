import java.util.LinkedList;
import java.util.List;


public class ReplaceString {

	public static void main(String args[])
	{
		String s="aba1c";
		List<String> arr =  new LinkedList();
		
	
		System.out.println(replaceString(s));
	}

	private static String replaceString(String s) {
		// TODO Auto-generated method stub
		boolean strContains=false;
		if(s.length()<1)
			return null;
		
		if(s.contains("a"))
		{
			s=s.replaceAll("a", "");
			strContains=true;
		}
		if(s.contains("bc"))
		{
			s=s.replaceAll("bc", "");
			strContains=true;
		}
		
		if(strContains)
		{
			s= replaceString(s);
			return s;
		}
		else
		{
		return s;
		}
		
		
	}
}
