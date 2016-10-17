import java.util.HashMap;


public class FirstNonRepeatedChar {
	
	public String check(String str){
		HashMap hash= new HashMap(256);
		Object seenOnce = new Object();
		Object seenTwice = new Object();
		String returnstr ="";
		
		for(int i=0; i<str.length();i++){
			Character c = str.charAt(i);
			Object val = hash.get(c);
			
			if(val==null) hash.put(c, seenOnce);
			if(val==seenOnce) hash.put(c, seenTwice);
		}
		
		for(int i =0; i<str.length();i++){
			if(seenOnce ==hash.get(str.charAt(i)))
				return returnstr + str.charAt(i);
		}
		return "";
	}
	
	
	
	
	
	
	
	
	public String allNonRepeatitive(String str){
		HashMap hash = new HashMap(256);
		Object seenOnce = new Object();
		Object seenMany = new Object();
		String result ="";
		for(int i = 0; i<str.length();i++){
			Character c = str.charAt(i);	
			if(hash.get(c)!=null)
				hash.put(c, seenMany);	
			if(hash.get(c)==null)
				hash.put(c, seenOnce);	
			}
		
		for(int i= 0; i<str.length();i++){
			if(seenOnce==hash.get(str.charAt(i)))
				result+=str.charAt(i);			
			else if(seenMany==hash.get(str.charAt(i)))
				result+="";
		}
		return result;
	}
	
}
