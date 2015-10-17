
public class MoveZeros {
	
	public static void main(String args[])
	{
		MoveZeros mz = new MoveZeros();
		int x[]={0,0,1,2};
		mz.moveZeroes(x);
	}

	public void moveZeroes(int[] nums) {
        int zero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zero++;
                continue;
            }
            nums[i-zero] = nums[i];
        }
        for(int i=nums.length-zero;i<nums.length;i++){
            nums[i] = 0;
        }
    }
	
}
