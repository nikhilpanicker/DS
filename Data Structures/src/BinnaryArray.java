
public class BinnaryArray {
	
	int a[];
	private int numElems;

	public BinnaryArray(int arraySize)
	{
		a = new int[arraySize];
		numElems=0;
	}
	
	public int size()
	{
		return numElems;
	}
	
	public void insert(int num)
	{
		int j;
		for(j=0; j<numElems; j++) // find where it goes
		if(a[j] > num) // (linear search)
		break;
		for(int k=numElems; k>j; k--) // move bigger ones up
			a[k] = a[k-1];
			a[j] = num; // insert it
			numElems++;
	}
	
	public void display() // displays array contents
	{
		for(int j=0; j<numElems; j++) // for each element,
		System.out.print(a[j] + " "); // display it
		System.out.println(" ");
	}
	
	public int find(int key)
	{
		return recBinary(key,0,numElems-1);
	}

	private int recBinary(int key, int lowerbound, int upperbound) {
		// TODO Auto-generated method stub
		int mid;
		mid=(lowerbound+upperbound)/2;
		
		if(a[mid]==key)
			return mid;
		else if (lowerbound>upperbound)
			return numElems;
		else
			if(a[mid]<key)
				return recBinary(key,mid+1,upperbound);
			else
				return recBinary(key,0,mid-1);
				
		
	}
}
