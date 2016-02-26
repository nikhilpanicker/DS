package DS;

public class DataItem<V> {

	V item;
	
	public  DataItem(V id)
	{
		item =  id;
	}
	
	public void printItem()
	{
		System.out.println(item);
	}
	
	public V getKey()
	{
		return item;
	}

}
