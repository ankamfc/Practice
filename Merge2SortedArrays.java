
public class Merge2SortedArrays {
	
	public int[] merge(int[] a, int[] b){
		int i=0;
		int j=0;
		int k=0;
		int[] c = new int[256];
		
		while(i<a.length && j<b.length){
			if(a[i]>b[j])
				c[k++]= b[j++];
			else if(b[j]>a[i])
				c[k++] = a[i++]; 
				
		}
		
		while(i<=a.length)
			c[k++] = a[i++];
		
		while(j<b.length)
			c[k++] = b[j++];
		
		return c;
	}
	
	public void mergeToA(int[] a, int[] b, int n, int m){
		int i = n-1;
		int j =m-1;
		int k=n+m-1;
		
		while(i>=0 && j>=0){
			if(a[i]>a[j]){
				a[k--]=a[i--];
			}
			else a[k--]=b[j--];
		}
		while(j>=0){
			a[k--]=b[j--];
		}
	}
}
