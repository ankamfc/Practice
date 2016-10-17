//

import java.util.Arrays;


public class MaxNum {
	public String MaxNum(String[] a){
		Arrays.sort(a);
		System.out.println();
		String r="";
		for(int i=0; i<a.length; i++){
			r+=a[i];
		}
		return r;
	}
}
