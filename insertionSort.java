package ashish;

public class insertionSort {
	public static void main(String...ss){
		int[] a = {10,5,3,7,0};
		int n= a.length;
		int j;
		for(int i=1;i<n;i++){
			int key=a[i];
			for(j=i-1;j>=0&&a[j]>key;j--){
				a[j+1]=a[j];
				//uncomment below for more detail.
				/*System.out.print("Array for a[j]"+a[j]+"key"+key+" ");
				for(int l=0;l<n;l++)
					System.out.print(a[l]+" ");
				System.out.println();*/
				
			}
			a[j+1]=key;
		}
		for(int k=0;k<n;k++)
			System.out.println(a[k]);
		}
}
