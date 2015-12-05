import java.util.Arrays;
import java.util.Scanner;


public class Tickets {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int numWindows= sc.nextInt();
		int tktsToSell = sc.nextInt();
		int []a=new int[numWindows];
		for(int i=0;i<numWindows;i++)
		{
			a[i]=sc.nextInt();
		}
		

		Arrays.sort(a);

		///Sab window ka max lega
		int max=a[a.length-1];
		int nextMax=a[a.length-2];
		int count=0;
		int j=0;
		while(j<tktsToSell)
		{
			count+=max;
			max--;
			if(max<nextMax) //Condition to change window. like W1=7 tickets W2=6 ticket. So if 3 tickets to sell then 2 tickets from w1(7,6) and 1 from Window 2(6)
			{
				a[a.length-1]=max;
				Arrays.sort(a);
				max=a[a.length-1];
				nextMax=a[a.length-2];
			}
			j++;
		}
		System.out.println(count);
		
	}
}
