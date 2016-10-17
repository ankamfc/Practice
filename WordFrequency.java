import java.util.Hashtable;


public class WordFrequency {
	
	public int wordFrequency(String book,String word){
		String bookl = book.toLowerCase();
		String[] words = book.split(" ");
		int count=0;
		for(int i=0; i< words.length;i++ ){
			if(words[i].equals(word)){
				count++;
			}
		}
		if(count==0) return 0;
		else return count+1;
	}
	
	
	public Hashtable<String,Integer> wordFrequencyHash(String book, String word){
		Hashtable<String, Integer> hash = new Hashtable<String, Integer>();
		String bookl = book.toLowerCase();
		String[] words = bookl.split(" ");
		
		for(String w: words){
			if(!hash.containsKey(w)) hash.put(w, 0);
			else hash.put(w, hash.get(w)+1);
		}
		return hash;
	}
	
	public int WordFreq(Hashtable<String,Integer> hash, String word){
		if(hash.containsKey(word)) return hash.get(word);
		else return 0;
	}
}
