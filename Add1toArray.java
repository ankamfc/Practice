import java.util.ArrayList;
import java.util.HashMap;


public class Add1toArray {
	public ArrayList<Integer> add1(int[] a, int[] b, int carry){
		int i = a.length;
		//int j =b.length;
		//HashMap<String, Integer> hash = new HashMap<String, Integer>();
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(i>0){
			int val=0;
			if(i==a.length)
				val = a[i-1] + 1;				
			
			else 
				val = a[i-1] + carry;
			result.add(val%10);
		
		if(val>=10){
			carry=1;
		} else carry =0;
		
		--i;
		//return add1(a, b, carry);
	}
		return result;
	}
	
}
