
public class NumberOccurence {
	
	public static void main(String args[])
	{
		int [] nums={3,3,2,3};
		singleNumber(nums);
	}
	public static int singleNumber(int[] nums) {
	    int res = 0;
	    int k = 0;
	    while(k < 32){
	       int temp = 0;
	       for(int i=0; i<nums.length; i++){
	           temp += ((nums[i] >> k) & 1 );
	       }  
	       if(temp%3 != 0){
	           res = res | (1<<k);
	       }   
	       k++;
	    }
	    return res;
	}
}
