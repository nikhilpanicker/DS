import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Subset {

	public static void main(String args[])
	{
		Subset sb = new Subset();
		int []x ={1,2,2};
		sb.subsetsWithDup(x);
	}
	public List<List<Integer>> subsetsWithDup(int[] nums) {
	    Arrays.sort(nums);
	    List<List<Integer>> res = new ArrayList<>();
	    List<Integer> each = new ArrayList<>();
	    helper(res, each, 0, nums);
	    return res;
	}
	public void helper(List<List<Integer>> res, List<Integer> each, int pos, int[] n) {
	    if (pos <= n.length) {
	        res.add(each);
	    }
	    int i = pos;
	    System.out.println("I is: "+i);
	    while (i < n.length) {
	    	System.out.println("While I: "+i);
	        each.add(n[i]);
	        System.out.println("Call re: "+res.size()+"each "+each.size()+"i: "+i);
	        helper(res, new ArrayList<>(each), i + 1, n);
	        System.out.println("After call re: "+res.size()+"each "+each.size()+"i: "+i);
	        each.remove(each.size() - 1);
	        i++;
	        while (i < n.length && n[i] == n[i - 1]) {i++;}
	    }
	    return;
	}
}
