package ashish;

public class selectonSort {
public static void main(String...ss){
	int[] a = {2,5,3,7,0};
	int n= a.length;
	for(int i=0;i<n;i++){
		int maxIndex=0;
		for(int j=0;j<n-i;j++){
			if(a[j]>a[maxIndex])
				maxIndex= j;
		}
		int temp = a[n-i-1];
		a[n-i-1]=a[maxIndex];
		a[maxIndex]=temp;
	}
	
	for(int k=0;k<n;k++)
		System.out.println(a[k]);
}
}
