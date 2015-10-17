
public class RemoveSpaces {

	public static void main(String args[])
	{
		String s= "Hi lets     remove spaces!!";
				System.out.println(removeSpacesFromString(s));
	}

	private static String removeSpacesFromString(String s) {
		// TODO Auto-generated method stub
		int strLength = s.length();
		char[] strArr = s.toCharArray();
		StringBuilder sb = new StringBuilder();
		Boolean isSpace=false;
		for(int i=0;i<strLength;i++)
		{
			if(strArr[i]==' ' && !isSpace)
			{
				sb.append("%20");
				isSpace=true;
			}
			else if(strArr[i]!=' ')
			{
				sb.append(strArr[i]);
				isSpace=false;
			}
		}
		
		return sb.toString();
	}
}
