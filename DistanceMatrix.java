/*take off the lower right triangle
 * 
 * 
 * Address of any element a(i,j) = number of elements up to a(i,j) element 
= Total number of elements in first (i-1) rows + number of elements upto jth column in the ith row 
= 0+1+2+...(i-2) + j 
= (i-2)*(i-1)/2 + j 

 */
public class DistanceMatrix {

	
	int index(int i, int j, int N)
	{
	    int Max=0, s=0, sub_size=0, sub_index=0, index=0;
	    if(i>=N || j>=N) return -1;
	    if(i == j) return 0;
	    if(i>j) {i = i+j; j=i-j; i=i-j;} //swap i & j
	 
	    Max = N*(N-1)/2;
	    s = N-i;
	    
	    sub_size = s*(s+1)/2;
	    sub_index = Max-sub_size;
	    index = sub_index+j-i;
	    return index;
	}
}
