import java.util.ArrayList;
import java.util.Collections;


public class Siblings {

	static int x = 3211;
	public static void main(String args[])
	{
		System.out.println(Math.ceil((Math.log10(x))));
		findSiblings(x);
	}
	private static int findSiblings(int x) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int j=0;
		int newNum=0;
		while(x>0)
		{
			j=x%10;
			x/=10;
			arrList.add(j);
		}
		Collections.sort(arrList ,Collections.reverseOrder());
		
		for(int i = 0; i < arrList.size(); i++) {
		    if (arrList.get(i) != null) {
		        newNum += arrList.get(i);
		        newNum *=10;
		    }
		}
		return newNum/10;
	}
}
