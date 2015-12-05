 	
public class Bits {
	public static void main(String args[])
	{
		System.out.println(hammingWeight(7));
		System.out.println(countOnes(7));
	}
	public static int hammingWeight(int n) {
	    int count =0;
	    for(int i =0; i< 32; i++){
	        if((n & 1) == 1){
	            count++;
	        }
	        n >>>= 1;
	    }
	    return count;

	}
	
	public static int countOnes(int n) {
	    int count =0;
	    int j=1;
	    for(int i =0; i< 32; i++){
	        if((n & j) == j){
	            count++;
	        }
	        j <<= 1;
	       
	    }
	    return count;

	}

}
