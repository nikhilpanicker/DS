import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class CombinationSum {
	
	public static void main(String args[])
	{
		int a [] = {10,1,2,7,6,1,5};
		CombinationSum cs = new CombinationSum();
		//cs.combinationSum2(a, 8);
		System.out.println(cs.combinationSum(a, 8));
	}
	
	public List<List<Integer>> combinationSum2(int[] cand, int target) {
	    Arrays.sort(cand);
	    List<List<Integer>> res = new ArrayList<List<Integer>>();
	    List<Integer> path = new ArrayList<Integer>();
	    dfs_com(cand, 0, target, path, res);
	    return res;
	}
	
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return combinationSum(candidates, target, 0);
    }
	public List<List<Integer>> combinationSum(int[] candidates, int target, int start) {

        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Arrays.sort(candidates);
        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <target) {
                for (List<Integer> ar : combinationSum(candidates, target - candidates[i], i)) {
                    ar.add(0, candidates[i]);
                    res.add(ar);
                }
            } else if (candidates[i] == target) {
                List<Integer> lst = new ArrayList<>();
                lst.add(candidates[i]);
                res.add(lst);
            } else
                break;
        }
        return res;
    }
	void dfs_com(int[] cand, int cur, int target, List<Integer> path, List<List<Integer>> res) {
	    if (target == 0) {
	        res.add(new ArrayList(path));
	        return ;
	    }
	    if (target < 0) return;
	    for (int i = cur; i < cand.length; i++){
	    	//System.out.println("i is: "+i);
	        if (i > cur && cand[i] == cand[i-1]) continue;
	        //System.out.println("Path size "+path.size()+" Candidate being added "+cand[i]);
	        path.add(path.size(), cand[i]);
	       // System.out.println("DFS call: i "+(i+1)+ "target "+(target - cand[i]));
	        dfs_com(cand, i+1, target - cand[i], path, res);
	       // System.out.println("Path remove "+(path.size()-1));
	        path.remove(path.size()-1);
	        //System.out.println(" ");
	    }
	}

}
