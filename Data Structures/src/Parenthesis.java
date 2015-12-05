import java.util.ArrayList;
import java.util.List;


public class Parenthesis {

	public static void main(String args[])
	{
		Parenthesis ps = new Parenthesis();
		ps.generateParenthesis(3);
		int price[]={600,50,10,300,200};
		ps.maxProfit(price);
	}
	public List<String> generateParenthesis(int n) {
	    List<String> list = new ArrayList<String>();
	    generateOneByOne("", list, n, n);
	    return list;
	}
	public void generateOneByOne(String sublist, List<String> list, int left, int right){
	    if(left > right){
	        return;
	    }
	    if(left > 0){
	    	System.out.println("LeftIf: Left: "+left+" Right: "+right);
	        generateOneByOne( sublist + "(" , list, left-1, right);
	    }
	    if(right > 0){
	    	System.out.println("RightIf: Left: "+left+" Right: "+right);
	        generateOneByOne( sublist + ")" , list, left, right-1);
	    }
	    System.out.println("Bith IF Left: "+left+" Right: "+right);
	    if(left == 0 && right == 0){
	        list.add(sublist);
	        return;
	    }
	}
	
	public int maxProfit(int[] prices) {
	    if(prices.length==0)return 0;
	    int answer = 0;
	    int min = prices[0];
	    for(int i = 1; i<prices.length; i++){
	        if(prices[i] < min) min = prices[i];
	        if(prices[i] - min > answer) answer = prices[i] - min;
	    }
	    return answer;
	}
}
