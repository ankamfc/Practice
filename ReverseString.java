

public class ReverseString {

	public void RReverseString(String s){
		String reverse = "";
		for(int i = s.length(); i>0; i--){
			reverse += s.charAt(i);
		}
		
		if(s.equals(reverse)) System.out.println("Yes");
		else System.out.println("No");
		
		}
	
	
	public String AnotherWayOfReverse(String str){
		char[] chars = str.toCharArray();
		int len = str.length();
		for(int i=0; i<len/2;i++){
			char temp = chars[len-i-1];
			chars[len-1-i]= chars[i];
			chars[i]=temp;			
		}
	return chars.toString();	
	}
	
	
	public String recursionReverse(String s){
		if(s.length()==0) return "";
		
		String str = recursionReverse(s.substring(1)+s.charAt(0));
		
		return str;
	} 
		
	}

