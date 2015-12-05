import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;


public class HashTable {
	private LinkedList<String>[] hashTbl;
	HashTable()
	{
		hashTbl= new LinkedList[100];
	}
	
	private void put(String value)
	{
		int key = hashFunc(value);
		if(hashTbl[key] == null)
		{
		hashTbl[key] = new LinkedList<String>();
		}
		hashTbl[key].add(value);
	}
	private void get(String value)
	{
		int key = hashFunc(value);
	
		LinkedList node = hashTbl[key];
		Set<Integer> listMap = new HashSet<Integer>();
		//listMap.
	}
	
	private int hashFunc(String value)
	{
		return 10;
	}
}
