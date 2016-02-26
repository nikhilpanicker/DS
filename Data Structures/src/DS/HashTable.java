package DS;

public class HashTable {
	
	int arraySize;
	private DataItem[] hashArray;
	
	public HashTable(int size)
	{
		arraySize = size;
		hashArray = new DataItem[arraySize];
	}
	
//	public int hashFunc(int value)
//	{
//		return value%10;
//	}
	
	public <K> int  hashFunc(K value)
	{
		return value.hashCode()%10;
	}
	
//	public void insert(int value)
//	{
//		DataItem dItem = new DataItem(value);
//		int key = hashFunc(value);
//		while(hashArray[key]!=null)
//		{
//			++key;
//		}
//		hashArray[key]=dItem;
//	}
	
	public <V, K> void  insert(V value, K Key)
	{
		DataItem dItem = new DataItem(value);
		int key = hashFunc(value);
		while(hashArray[key]!=null)
		{
			++key;
		}
		hashArray[key]=dItem;
	}
	
	public void displayHash()
	{
		for(int i =0;i<arraySize;i++)
		{
			if(hashArray[i] !=null)
				System.out.println(hashArray[i].getKey());
		}
	}

}
