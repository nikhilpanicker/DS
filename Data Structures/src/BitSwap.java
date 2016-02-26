
public class BitSwap {

	public static void main(String args[])
	{
		int a=29;
		int b=15;
		System.out.println(bitSwaped(a,b));
	}

	private static int bitSwaped(int a, int b) {
		// TODO Auto-generated method stub
		int count =0;
		for(int c =a^b;c!=0; c = c >> 1)
		{
			count += c & 1;
		}
		return count;
}
}