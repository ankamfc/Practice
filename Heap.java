import java.util.ArrayList;
import java.util.Comparator;


public class Heap{

	
	public void siftup(ArrayList<Integer> al){
		
		
		int k=al.size()-1;
		int p = (k-1)/2;
		
		while(p>=0){
			int parent = al.get(p);
			int child = al.get(k);
			
		if(child>parent){
			int temp = al.get(p);
			al.set(p, al.get(k));
			al.set(k,temp);			
			k=p;
		}	
		
		else break;
	
		}
	}
	
	
}
