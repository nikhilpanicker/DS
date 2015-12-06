
public class PriorityQueue1 implements IPriorityQueue{

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
		if(strTimeSec<=3)
		{
			if( Schedule.pq1Counter<=2 && endTimeSec >3)
			{
			Schedule.pq1.add(ads);
			//ads.setStartTime(startTime);
			ads.getStartTime().setSeconds(4);
			ads.getStartTime().setNanos(0);
			Schedule.pq1Counter++;
			nextQueue.insertAdd(ads);			
			}
			else if(Schedule.pq1Counter<=2 && endTimeSec <3)
			{
				Schedule.pq1.add(ads);
				Schedule.pq1Counter++;
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
