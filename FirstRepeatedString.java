import java.util.HashSet;

// minimum repeated string length >=3


public class FirstRepeatedString {
	
	public String repeatedString(String str){
		HashSet<String> hash = new HashSet<String>();
		int start = 0;
		while(start+3<=str.length()){
			String key=str.substring(start, start+3);
			if(hash.contains(key))
				return key;
			else hash.add(key);
			start=start+1;
		}
		return "";
	}
	
	
}
