import java.util.HashMap;
import java.util.Map.Entry;


public class MapExp {

	 
     
	public static void main(String args[])
	{
		int majElm=0;
	     int majVal=0;
	     int prevMax=0;
	     
		HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
		mp.put(1, 1);
		mp.put(1, mp.get(1)+1);
		mp.put(1, mp.get(1)+1);
		
		
		for(Entry entry: mp.entrySet())
        {
            majVal=Math.max((int)entry.getValue(),majVal);
            if(prevMax != majVal)
                majElm=(int)entry.getKey();
        }
		
		System.out.println(majElm);
		
		int x[]={4,3,3};
		
		MapExp me = new MapExp();
		me.majorityElement(x);
	}
	
	 public int majorityElement(int[] nums) {
	        
	        HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>();
	        int majElm=0;
	        int majVal=0;
	        int prevMax=0;
	        for(int i=0;i<nums.length;i++)
	        {
	            if(!mp.containsKey(nums[i]))
	            {
	                mp.put(nums[i],1);
	            }
	            else
	            {
	                mp.put(nums[i],mp.get(nums[i])+1);
	            }
	        }
	        
	        for(Entry entry: mp.entrySet())
	        {
	            majVal=Math.max((int)entry.getValue(),majVal);
	            if(prevMax != majVal)
	                majElm=(int)entry.getKey();
	        }
	        
	        return majElm;
	        
	    }
}
