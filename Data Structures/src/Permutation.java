import java.util.ArrayList;
import java.util.List;


public class Permutation {
	
	public static void main(String args[])
	{
		Permutation pm = new Permutation();
		int nums[]={1,2,3};
		System.out.println(pm.permute(nums));
	}
   private List<List<Integer>> permute(int[] nums) {
         List<List<Integer>> permutations = new ArrayList<>();
        if (nums.length == 0) {
            return permutations;
        }

        collectPermutations(nums, 0, new ArrayList<>(), permutations);
        return permutations;
    }

    private void collectPermutations(int[] nums, int start, List<Integer> permutation,
            List<List<Integer>>  permutations) {

        if (permutation.size() == nums.length) {
            permutations.add(permutation);
            return;
        }

        for (int i = 0; i <= permutation.size(); i++) {
            List<Integer> newPermutation = new ArrayList<>(permutation);
            newPermutation.add(i, nums[start]);
            collectPermutations(nums, start + 1, newPermutation, permutations);
        }
    }
}
