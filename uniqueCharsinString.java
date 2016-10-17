

//Implement an algorithm to determine if a string has all unique characters.
//What if you can not use additional data structures?


public class uniqueCharsinString {
	
	boolean[] b = new boolean[256];
	String s = new String();
	
	
	public Character isItUnique(String s){
		boolean[] set = new boolean[256];
		for(int i=0;i<s.length();i++){
			Character val = s.charAt(i);
			if(set[val]) return val;
			set[val]=true;
		}
		return 'N';
	}
	
}
