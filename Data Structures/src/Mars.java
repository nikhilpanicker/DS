import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class Mars {

	public static void main(String args[])
	{
		int [] f={10670,11057,16111,17203,16390,8500,7551,11517,12848,6988,17875,11751,8500};
		int []m={14376,17203,16797,8350,7155,12365,16111,16111,17875,13115,10048,8500};
		
		int result[]= sortIntersect(f,m);
		
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}

	private static int[] sortIntersect(int[] f, int[] m) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int i = 0; i< f.length;i++ )
		{
			if(hm.containsKey(f[i]))
			{
				hm.put(f[i], hm.get(f[i])+1);
			}
			else
			{
			hm.put(f[i], 1);
			}
		}
		for (int j=0;j < m.length;j++)
		{
			if(hm.containsKey(m[j]))
			{
				if(hm.get(m[j])!=0)
				{
				arrList.add(m[j]);
				hm.put(m[j], hm.get(m[j])-1);
				}
			}
		}
		
		Collections.sort(arrList ,Collections.reverseOrder());
		int[] arr = new int[arrList.size()];

		for(int i = 0; i < arrList.size(); i++) {
		    if (arrList.get(i) != null) {
		        arr[i] = arrList.get(i);
		    }
		}
		return arr;
	}
}
