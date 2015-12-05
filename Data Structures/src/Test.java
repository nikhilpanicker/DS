
public class Test {

	public static void main(String args[])
	{
		
		int a=10;
		long b =10;
		float f = 10f;
		double d = 10;
		System.out.println((a+b)*(f+d));
		/* **** */
		///* test // // ffgf */
//		int input[]={1,1,1,0,1,1,1,1};
//		int days=2;
//		int []arr = cellCompete(input, days);
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.print(arr[i]);
//		}
	}

	public static int[] cellCompete(int[] cells, int days)
	  {
	    // INSERT YOUR CODE HERE
	    int prev =0;
	    int next=0;
	    int last = 0;
	    
	    
	    int lastElm=cells.length-1;
	    for(int j=0;j<days;j++)
	    {
	    	prev=0;
	    for(int i=0;i<=lastElm;i++)
	    {
	        if( i==lastElm)
	        {
	            if(prev == 0){
	                cells[i]=0;
	            } else {
	                cells[i]=1;
	            }
	            
	        }
	        else
	        {
	            next=cells[i+1];
	            if((prev ==0 && next ==0) || (prev == 1 && next ==1))
	            {
	                prev = cells[i];
	                cells[i]=0;
	            }
	            else
	            {
	                prev = cells[i];
	                cells[i]=1;
	            }
	        }
	    }
	}
	return cells;
	  }
}
