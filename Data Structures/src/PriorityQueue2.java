
public class PriorityQueue2 implements IPriorityQueue{

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
		int endTimeSec= ads.getEndTime().getSeconds();
		//System.out.println("Str: "+strTimeSec);
		if(strTimeSec>3 && strTimeSec<=5)
		{
			if( Schedule.pq1Counter<=2 && endTimeSec >5)
			{
			Schedule.pq2.add(ads);
			//ads.setStartTime(startTime);
			ads.getStartTime().setSeconds(6);
			ads.getStartTime().setNanos(0);
			Schedule.pq2Counter++;
			nextQueue.insertAdd(ads);			
			}
			else if(Schedule.pq1Counter<=2 && endTimeSec <=5)
			{
				Schedule.pq2.add(ads);
				Schedule.pq2Counter++;
			}
			else
			{
				System.out.println("Discard");
			}
		}
		else
		{
			nextQueue.insertAdd(ads);
		}
	}

}
