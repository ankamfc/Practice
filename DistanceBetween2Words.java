import java.util.Hashtable;


public class DistanceBetween2Words {
	public int distance(String book, String word1, String word2){
		String[] words = book.split(" ");
		int pos=0;
		int index1=0;
		int index2=0;
		int min =Integer.MAX_VALUE/2;
		for(int i=words.length; i>0; i--){
			if(words[i].equals(word1)){
				index1=pos;
			}
			else if(words[i].equals(word2)){
				index2=pos;
				int distance=index2-index1;
				if(distance<min) distance =min;
			}
			++pos;
		}
		return min;
		
	}


}
