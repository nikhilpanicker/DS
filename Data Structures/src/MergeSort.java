
public class MergeSort {
	
	public static void main(String args[])
	{
		MergeSort mg = new MergeSort();
		int arr[]={6,3,8,2,4,7};
		System.out.println((int)Math.ceil(Math.sqrt(17)));
		//mg.recSort(arr,0,arr.length-1);
	}

	private void recSort(int[] arr, int lowPtr, int HighPtr) {
		// TODO Auto-generated method stub
		int mid = (lowPtr + HighPtr)/2;
		
		recSort(arr,lowPtr,mid);
		recSort(arr,mid+1,HighPtr);
		mergeSort(arr,lowPtr,mid+1,HighPtr);
				
	}

	private void mergeSort(int[] arr, int lowPtr, int i, int highPtr) {
		// TODO Auto-generated method stub
		int lowerPtr=lowPtr;
		int mid=i-1;
		int n = highPtr-lowPtr+1;
		
		while(lowPtr<= i && i <=highPtr )
		{
			if(arr[lowPtr]< arr[i])
			{
				
			}
				
		}
	}

}
