
public class ImageRotate {
	
	// find the transpose of matrix and then swap columns to rotate right and swap rows to rotate left
	
	
	
	public void Transpose(int[][] a, int m, int n){
		int[][] trnaspose= new int[n][];
		
		for(int i=0; i<m; i++){
			for(int j=0; j<n;j++){
				a[i][j] = a[j] [i];
			}
		}
	}
	
	public void rotate(int[][] a, int r, int c){
		for(int i =0; i< r; i++){
			for(int j=0; j<c;c++){
				swap(a[i][j], a[i][j+1]);
			}
		}
	}
	
	public void swap(int a, int b){
		int temp;
		temp = a;
		a=b;
		b=temp;
	}
}
 