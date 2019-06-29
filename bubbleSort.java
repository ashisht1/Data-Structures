package ashish;

public class bubbleSort {
	public static void main(String...ss){
int[] a = {2,5,3,7,0};
int n= a.length;
for(int i=0;i<n;i++){
	for(int j=0;j<n-1;j++){
		if(a[j]>a[j+1]){
			int temp = a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
	}
}
for(int k=0;k<n;k++)
	System.out.println(a[k]);
	}
}
