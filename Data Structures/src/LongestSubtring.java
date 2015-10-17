import java.util.HashMap;


public class LongestSubtring {
	
	public static void main(String args[])
	{
		LongestSubtring ls = new LongestSubtring();
		String str = "dvdf";
		ls.lengthOfLongestSubstring(str);
	}

	
	public int lengthOfLongestSubstring(String s) {
	    if(s.length() == 1) return 1;
	    int max = 0;
	    int begin = 0;
	    int sublength = 0;
	    HashMap<Character,Integer> map = new HashMap<Character,Integer>();

	    for(int i = 0; i < s.length(); i++){
	       if(map.containsKey(s.charAt(i))){
	            sublength  = i - begin;
	            max = Math.max(sublength, max);
	           begin = Math.max(begin, map.get(s.charAt(i)) + 1) ;
	        }
	        
	        
	        map.put(s.charAt(i),i);
	        if(i == s.length()-1){
	            max = Math.max(i - begin + 1, max);
	        }
	    }
	    return max;
	}
	
	
	
}
