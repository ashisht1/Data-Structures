package ashish;

public class BinarySearch {

	public static void main(String...ss){
		int[] a = {5,5,5,7,9};
		System.out.println(binarySearchLastIndex(a,0,a.length-1,5));
	}
	
	
	static int binarySearch(int[] arr, int beg, int end, int x){
		int mid = beg + (end-beg)/2;
		if(end<beg)
			return -1;
		if(arr[mid]==x)
			return mid;
		if(arr[mid]>x)
			return binarySearch(arr, beg, mid-1, x);
		if(arr[mid]<x)
			return binarySearch(arr, mid+1, end, x);
		return -1;
	 
			
	}
	static int binarySearchFirstIndex(int[] arr, int beg, int end, int x){
		int mid = beg + (end-beg)/2;
		if(end<beg)
			return -1;
		if(arr[mid]==x && (mid==0 || arr[mid-1]!=x))
			return mid;
		
		else if(arr[mid]<x)
			return binarySearch(arr, mid+1, end, x);
		else
			return binarySearch(arr, beg, mid-1, x);	
	}
	
	static int binarySearchLastIndex(int[] arr, int beg, int end, int x){
		int mid = beg + (end-beg)/2;
		if(end<beg)
			return -1;
		if(arr[mid]==x && (mid==0 || arr[mid+1]!=x))
			return mid;
		
		else if(arr[mid]>x)
			return binarySearch(arr, mid+1, end, x);
		else
			return binarySearch(arr, beg, mid-1, x);	
	}
}
