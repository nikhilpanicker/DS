package DS;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String args[])
	{
		String a = "abc";
		String b = "bac";
		
		System.out.println(findAnagram(a,b));
	}

	private static boolean findAnagram(String a, String b) {
		// TODO Auto-generated method stub
		char []aArr = a.toCharArray();
		char []bArr = b.toCharArray();
		
		Arrays.sort(aArr);
		Arrays.sort(bArr);
		
		String str1 = aArr.toString();
		String str2 = bArr.toString();
		System.out.println((int)str1.charAt(0));
		//System.out.println(str1);
		//System.out.println(str2);
		
		return (String.valueOf(aArr)).equals(String.valueOf(bArr));
	}
}
