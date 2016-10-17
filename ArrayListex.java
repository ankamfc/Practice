import java.util.ArrayList;


public class ArrayListex {


	
	public static ArrayList<String> addToSentence(String[] words, String[] more){
		ArrayList<String> sentence = new ArrayList<String>();
		for(String w: words) sentence.add(w);
		for(String m: more) sentence.add(m);
		return sentence;
	}
}
