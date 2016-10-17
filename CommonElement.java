import java.util.ArrayList;


// it can be done using hash- put every other element to hash and when i
// inserting same element hash.put(key, hash.get(key)+1) if found in a set.


public class CommonElement {
	public static void main(String[] args){
		int [] [] a= {{2,3},
					  {3,4},
					  {3,5}};
		int n = a.length;
		int[] x = new int[n];   
		
		for(;x[0] < n; x[0]++){
			int val = a[0][x[0]];
			boolean print=true;
			for(int i = 1; i<n ;i++){
				while(a[i][x[i]] <val && x[i]<n-1)
					x[i]++;
				if(val!=a[i][x[i]]) print=false;
			}
			if(print) System.out.println(val);;
		}
		
		
	}
	
	
	
	public void CommonElement1(int A[], int i, int B[], int j){ 
		int [] common = new int[256];
		int k=-1;
		if ( i < 0 || j < 0) return; 
		else{ 
		if (A[i] == B[j] ) { 
			common[++k] = A[i] ; // Global K =-1 
			CommonElement1(A,i-1,B,j-1); 
		} 
		else{ 
			CommonElement1(A,i,B,j-1); 
			CommonElement1(A,i-1,B,j-1); 
		} 
		}
	}
}