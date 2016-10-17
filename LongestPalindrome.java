import java.util.ArrayList;

// cbcaaaaaabaaaaacaba
// aaaaaabaaaaa


public class LongestPalindrome {
	
	public void LongestPalindrome(String str){
		
		String reverse="";
		char[] chars = str.toCharArray();
		for(int i =str.length(); i>0;i--){
			reverse+=chars[i];
		}
	}
	
	
	public int lcs(char[] x, char[] y, int a, int b){
		int lenx = a;
		int leny = b;
		//char[] xchar = x.toCharArray();
		//char[] ychar = y.toCharArray();
		if(a==0||b==0) return 0;
		
		if(x[lenx-1]==y[leny-1]){
			return (1+lcs(x,y,lenx-1,leny-1));
		}
		
		else
			return Math.max(lcs(x,y,a,b-1), lcs(x,y,a-1,b));		
	}
		
		/*ArrayList<Character> a = new ArrayList<Character>();
		char[] charsR = reverse.toCharArray();
		int[] count= new int[Integer.MAX_VALUE];
		for(int i=0; i<str.length(); i++){
			if(chars[i]==charsR[i]){
				a.add(chars[i]);
				for(int j=str.length()-i+1; (j<str.length()) && (chars[j]==charsR[j]); j++){
					a.add(chars[j]);
					count[i]++;
				}
			}
			
		}
	}*/
		
}
