import java.util.Arrays;



public class Median2 {
	
	public static void main(String args[])
	{

	long startTime = System.nanoTime();
	
	
	int a[]={10,5,6,7,8,12};
	int b[]={11,4,2,14,33};
	Arrays.sort(a);
	Arrays.sort(b);
	int alen=a.length;
	int blen=b.length;
	//int Medlength=a.length
	if((a.length+b.length)%2==0)
		System.out.println("Number: "+(findMedianSortedArrays(a, b,(alen+blen)/2)+findMedianSortedArrays(a, b,(alen+blen)/2 -1))/2);
	else
		System.out.println("Number: "+(findMedianSortedArrays(a, b,(alen+blen)/2)));	
	long endTime = System.nanoTime();

	long duration = (endTime - startTime);  
	System.out.println(""+ duration);
	}

	private static int findMedianSortedArrays(int[] a, int[] b, int med) {
		// TODO Auto-generated method stub
		int adex=0,bDex=0,count=0,median=0;
				while(count!=med+1)
				{
					if(a[adex]<b[bDex])
					{
						count++;
						median=a[adex];
						adex++;
					}
					else if(a[adex]>b[bDex])
					{
						count++;
						median=b[bDex];
						bDex++;
					}
					else if(a[adex]==b[bDex])
					{
						count++;
						median=a[adex];
						adex++;
					}
				}
		return median;
	}
}
