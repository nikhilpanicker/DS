import java.util.Arrays;


public class PermutationPalindrome {

	public static void main(String args[])
	{
		String s ="TactCoa";
		System.out.println(isPermPalindrom(s));
	}

	private static boolean isPermPalindrom(String s) {
		// TODO Auto-generated method stub
		
		char strArr[] = s.toLowerCase().toCharArray();
		Arrays.sort(strArr);
		int matchCount=0;
		for(int i = 0; i<strArr.length-2; )
		{
			if(strArr[i]==strArr[i+1])
				i+=2;
			else
			{
				matchCount++;
				i+=1;
			}
		}
		if(matchCount>1)
			return false;
		else
			return true;
				
		
	}
}
