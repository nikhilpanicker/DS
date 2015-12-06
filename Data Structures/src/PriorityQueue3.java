
public class PriorityQueue3 implements IPriorityQueue{

	IPriorityQueue nextQueue;
	@Override
	public void setNextChain(IPriorityQueue nextChain) {
		// TODO Auto-generated method stub
		 nextQueue=nextChain;
	}

	@Override
	public void insertAdd(Advertisement ads) {
		// TODO Auto-generated method stub
		int strTimeSec= ads.getStartTime().getSeconds();
		//System.out.println("Str: "+strTimeSec);
		if(strTimeSec>5 && Schedule.pq3Counter<=2)
		{
			Schedule.pq3.add(ads);
			Schedule.pq3Counter++;
		}
		else
		{
			System.out.println("Discard");
		}

	}

}
