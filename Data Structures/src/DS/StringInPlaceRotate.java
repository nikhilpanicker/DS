package DS;

public class StringInPlaceRotate {

	public static void main(String args[])
	{
		String str = "Hello"; //lloHe
		inPlaceRotate(str,3);
	}

	private static void inPlaceRotate(String str, int i) {
		// TODO Auto-generated method stub
		int counter=1;
		
		char temp;
		StringBuilder sb = new StringBuilder(str);
		while(counter<=i)
		{
			int strLen=str.length()-1;
			int strCounter=strLen;
			temp = sb.charAt(strLen);
			while(strCounter>=0)
			{
				
			}
		}
	}
}
