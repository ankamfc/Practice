import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;


public class Top3RepeatedNumbers {
	
	
	
	public void top3(int[] a){
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i = 0; i<a.length; i++){
			if(!hash.containsKey(a[i])) hash.put(a[i], 1);
			else
				hash.put(a[i], hash.get(i)+1);			
		}
		for(int i =0; i<a.length;i++){
			l.add(hash.get(a[i]));
		}
		Collections.sort(l);
		
		for(int i = 0; i<3; i++){
			System.out.println(l.get(i));
		}
		
	}
}
