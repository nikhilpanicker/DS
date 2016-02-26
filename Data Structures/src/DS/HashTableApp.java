package DS;

public class HashTableApp {

	public static void main(String args[])
	{
		HashTable hastable = new HashTable(10);
		hastable.insert(1,1);
		hastable.insert("Hi",1);
		hastable.insert(3,2);
		hastable.displayHash();
	}
}
