
public class MaxSubArr {

	public static void main(String args[])
	{
		int [] a ={1,3,4,1,10};
		System.out.println(maxValue(a));
	}

	private static int maxValue(int[] a) {
		// TODO Auto-generated method stub
		int max_value =0;
		int current_max=0;
		
		for(int i=0;i<a.length;i++)
		{
			current_max += a[i];
			max_value= Math.max(max_value, current_max);
			if(a[i]<0)
				current_max=0;
		}
		
		return max_value;
	}
}
