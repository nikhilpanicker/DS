
public class Link {
	
	public int iData;
	public double dData;
	public Link next;
	
	public Link(int id, double dd)
	{
		iData=id;
		dData=dd;
	}
	
	public void Display()
	{
		System.out.println("iData: "+iData+"dData: "+dData);
	}

}
