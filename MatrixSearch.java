// Sorted matrix-Rows and columns are sorted
// start from right top corner
// if element less than an element in column, forget bout the whole column


public class MatrixSearch {
	
	public boolean search(int[][] a, int elem, int m, int n){
		int i=0;
		int j=n-1;
		
		while(i<m && j>0){
		if(a[i][j]==elem) return true;
		else if(elem< a[i][j]){
			j--;
		}
		
		else{
			i++;
		}
		}
		return false;
	}
}
