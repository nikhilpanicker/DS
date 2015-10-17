
public class SumInArray {

	public static void main(String args[])
	{
		SumInArray sia = new SumInArray();
		int a []={2,3,1,2,4,3};
		sia.minSubArrayLen(7,a);
	}
	public int minSubArrayLen(int targetSum, int[] nums) {
        int minLength = Integer.MAX_VALUE;

        int left=0, right=0;
        int slidingSum = 0;
        int n = nums.length;

        while(right < n) {
            if(slidingSum  + nums[right] < targetSum) {
                slidingSum += nums[right];
                right += 1;
            } else {
                minLength = Math.min(minLength, right - left + 1);
                slidingSum -= nums[left];
                left += 1;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
	
}
