import java.util.ArrayList;
import java.util.Random;


public class MRandomIntegers {
	
	public void pick(int[] a, int n){
		ArrayList<Integer> b = new ArrayList<Integer>();
		int index;
		for(int i =0; i<n; i++){
			index = (int) (Math.random() * a.length);
			b.add(a[index]);
			System.out.println(b);
			a[index] = a[i];			
		}
		
	}
}
