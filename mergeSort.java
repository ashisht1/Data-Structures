package ashish;

public class mergeSort {
	public static void main(String...ss){
		int[] a = {30,20,15,5,80,25};
		int n= a.length;
		mergeSorting(a,0,n-1);
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}
	
	static void mergeSorting(int arr[],int left, int right){
		int mid=(left+right)/2;
		if(left<right){
			mergeSorting(arr,left,mid);
			mergeSorting(arr,mid+1,right);
			merge(arr,left,mid,right);
		}
	}
	static void merge(int arr[],int left,int mid, int right){
		int n1=mid-left+1;
		int n2=right-mid;
		
		
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];
		for (int i=0; i<n1; ++i) 
            leftArray[i] = arr[left+i]; 
        for (int j=0; j<n2; ++j) 
            rightArray[j] = arr[mid + 1+ j];
		int i=0,j=0,k=left;
		//] a = {30,20,15,5,80,25};
        while(i<n1 && j<n2){
        	if(leftArray[i]<=rightArray[j]){
        		arr[k]=leftArray[i];
        		i++;
        	}else{
        		arr[k]=rightArray[j];
        		j++;
        	}
        	k++;
        }
        while(i<n1){
        	arr[k]=leftArray[i];
    		i++;
    		k++;
        }
        while(j<n2){
        	arr[k]=rightArray[j];
    		j++;
    		k++;
        }
	}
}
