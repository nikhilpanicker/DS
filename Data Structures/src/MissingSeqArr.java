import java.util.Arrays;


public class MissingSeqArr {

	public static void main(String args[])
	{
		int a[] = {1,11,10,9,21,23,2,3,4,5,6,8};
		//int a[] ={};
		//System.out.println(findMissingElm(a));
		
		int arr[] = orderedArr(a);
		for(int i =0; i < arr.length;i++)
		{
			System.out.print(arr[i]);
			System.out.print(",");
		}
	}

	private static int findMissingElm(int[] a) {
		// TODO Auto-generated method stub
		if(a.length == 0)
			return 0;
		
		int num = a[0];
		
		for(int i = 1; i<a.length; i++)
		{
			if(num+1 != a[i])
				return num+1;
			else
				num+=1;
		}
		return 0;
	}
	
	private static int[] orderedArr(int [] a)
	{
		int strIndex = 0;
		int endIndex = a.length-1;
		int newArr[] = new int[a.length];
		
		Arrays.sort(a);
		
		for(int i = 0 ; i< a.length;i++)
		{
			if (a[i]%2==0)
				newArr[endIndex--]=a[i];
			else
				newArr[strIndex++]=a[i];
				
		}
		
		return newArr;
	}
}
