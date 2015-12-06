import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Schedule {

	static class PQsort implements Comparator<Advertisement> {
		 
		public int compare(Advertisement one, Advertisement two) {
			return one.getStartTime().compareTo(two.getStartTime());
		}
	}

	static PQsort pqs = new PQsort();
	static PriorityQueue<Advertisement> pq1 = new PriorityQueue<Advertisement>(10,pqs);
	static PriorityQueue<Advertisement> pq2 = new PriorityQueue<Advertisement>(10,pqs);
	static PriorityQueue<Advertisement> pq3 = new PriorityQueue<Advertisement>(10,pqs);
	ArrayList<Integer> scheduler = new ArrayList<Integer>();
	//ArrayList<PriorityQueue> queues = new ArrayList<PriorityQueue>();
	List<PriorityQueue> queues = Arrays.asList(pq1, pq2, pq3);
	static int pq1Counter=0;
	static int pq2Counter=0;
	static int pq3Counter=0;
	public static void main(String args[])
	{
		
		//queues.add(pq1);
		Timestamp currentTimestamp = new Timestamp(Calendar.getInstance().getTime().getTime());
		System.out.println(Calendar.getInstance().getTime().getHours());
		System.out.println(currentTimestamp);
		Schedule amz = new Schedule();
		Advertisement adv1 = new Advertisement(10,Timestamp.valueOf("2015-12-05 00:42:03.978"),Timestamp.valueOf("2015-12-05 01:32:04.978"));
		Advertisement adv2 = new Advertisement(8,Timestamp.valueOf("2015-12-05 00:32:02.978"),Timestamp.valueOf("2015-12-05 02:32:30.978"));
		Advertisement adv3 = new Advertisement(11,Timestamp.valueOf("2015-12-05 00:22:30.978"),Timestamp.valueOf("2015-12-05 03:32:04.978"));
		Advertisement adv4 = new Advertisement(12,Timestamp.valueOf("2015-12-05 00:42:03.988"),Timestamp.valueOf("2015-12-05 01:32:04.978"));
		Advertisement adv5 = new Advertisement(13,Timestamp.valueOf("2015-12-05 00:42:03.991"),Timestamp.valueOf("2015-12-05 01:32:04.978"));
		IPriorityQueue pQueue1 = new PriorityQueue1();
		IPriorityQueue pQueue2 = new PriorityQueue2();
		IPriorityQueue pQueue3 = new PriorityQueue3();
		pQueue1.setNextChain(pQueue2);
		pQueue2.setNextChain(pQueue3);
		pQueue1.insertAdd(adv1);
		pQueue1.insertAdd(adv2);
		pQueue1.insertAdd(adv3);
		pQueue1.insertAdd(adv4);
		pQueue1.insertAdd(adv5);
//		amz.advInsert(adv1);
//		amz.advInsert(adv2);
//		amz.advInsert(adv3);
//		amz.advInsert(adv4);
//		amz.advInsert(adv5);
		ArrayList<Integer> a1=amz.returnAdv();
		for(Integer in : a1)
			System.out.println(in);
//		System.out.println(amz.returnAdv());
//		System.out.println(amz.returnAdv());
//		System.out.println(amz.returnAdv());
		//pq.
	}
	
	public  void advInsert(Advertisement ads)
	{
	
		int strTimeSec= ads.getStartTime().getSeconds();
		//System.out.println("Str: "+strTimeSec);
		if(strTimeSec<=3 && pq1Counter<=2)
		{
			pq1.add(ads);
			pq1Counter++;
		}
		else if(strTimeSec>3 && strTimeSec<=5 && pq2Counter<=2)
		{
			pq2.add(ads);
		}
		else if(strTimeSec>5 && pq3Counter<=2)
		{
			pq3.add(ads);
		}
	}
	
	public ArrayList<Integer> returnAdv()
	{
		for(PriorityQueue queue:queues)
		{
			for(int i=0;i<3;i++)
			{
				Advertisement advObj = (Advertisement)queue.poll();
				if (advObj!=null)
					scheduler.add(advObj.getId());
			}
		}
		return scheduler;
	}
	
	
}
