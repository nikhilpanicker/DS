
public class BinarySearchApp {
	public static void main(String args[])
	{
		BinnaryArray arr = new BinnaryArray(15);
		arr.insert(10);
		arr.insert(40);
		arr.insert(50);
		arr.insert(20);
		arr.insert(17);
		arr.insert(109);
		arr.insert(60);
		arr.insert(40);
		arr.insert(70);
		arr.insert(90);
		arr.insert(110);
		
		arr.display();
		
		//arr.find(60);
		//arr.find(55);
		search(60,arr);
		search(55,arr);
	}
	
	public static void search(int key, BinnaryArray arr)
	{
		int size = arr.find(key);
		
		if( size!= arr.size() )
			System.out.println(" Found: "+ key);
			else
			System.out.println(" Cant find: "+ key);
			
	}
	

}
