import java.util.Hashtable;
// elements that add up to a sum 

public class SumOf2 {
	
	public void makeAHash(int a[], int sum){
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		for(int i=0; i<a.length; i++){
			if(hash.containsKey(sum-a[i])){
				System.out.println(a[i] + " " + (sum-a[i]));
			}
			else hash.put(a[i], a[i]);
		}
	}
	
	//using normal iteration
	public void traverse(int a[], int sum){
		int low = 0;
		int high =a.length-1;
		int s=0;
		while(low<high){
			s =a[low] + a[high];
			if(sum==s){
				System.out.println(a[low] + " " + a[high]);
				++low;
				--high;
			}
			else{
				if(s<sum){
					++low;
				}
				else --high;
			}
		}
	}
	

	
}