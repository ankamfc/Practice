
public class StringPermutations {

	public void Permuations(String str){
		PermutationsHelper("", str);
	}
	
	public void PermutationsHelper(String s1, String s2){
		
		if(s2.length()==0) System.out.println(s1);
		for(int i = 0; i< s2.length();i++){
			PermutationsHelper(s1+s2.charAt(i), s2.substring(0, i) + s2.substring(i+1, s2.length()));
		}
	}
	

}
