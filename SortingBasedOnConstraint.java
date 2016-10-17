import java.util.Hashtable;


public class SortingBasedOnConstraint {
public static void main(String[] args) {
		
		String s1 = "fghab";
		String s2 = "abfmgfghnaixcv";
		String remainder = "";
		String result="";
		int i=0;
		
		Hashtable<Character,Integer> h = new Hashtable<Character,Integer>();
		for(i=0;i<s1.length();i++) {
			h.put(s1.charAt(i), 0 );
		}
		
		for(i=0;i<s2.length();i++) {
			if(h.containsKey(s2.charAt(i))) {
				int count = h.get(s2.charAt(i));
				h.put(s2.charAt(i), count+1);
			}
			else {
				remainder+=s2.charAt(i);
			}
		}
		
		for(i=0;i<s1.length();i++) {
			int count = h.get(s1.charAt(i));
			for(int j=0;j<count;j++) {
				result+=s1.charAt(i);
			}
		}
		
		result+=remainder;
		System.out.println(result);
}
}
