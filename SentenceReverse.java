
public class SentenceReverse {
	
	String rev="";
	public void reverse(String sentence){
		
		String[] words= sentence.split(" ");
		
		for(int i = words.length-1; i>=0;i--){
			rev=rev+words[i]+" ";
		}
		System.out.println(rev);
	}
}
