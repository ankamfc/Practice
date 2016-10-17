import java.util.Arrays;

// sort and compare for equality
public class AnagramFinder {
	
	public boolean finder(String str1, String str2){
		char word1[]= str1.toCharArray();
		char word2[]= str2.toCharArray();
		
		Arrays.sort(word1);
		Arrays.sort(word2);
		
		if(Arrays.toString(word1).equals(Arrays.toString(word2)))
			return true;
		return false;
	
		
	}
	



	

public final static int LETTERS_LEN = 256;	
	
	public static boolean isAnagram(String s1, String s2) {
		if (s1 == null || s2 == null)
			return false;
		int len = s1.length();
		if (len != s2.length() || len < 2)
			return false;

		int[] letters = new int[LETTERS_LEN];

		for (int i = 0; i < len; i++) {
			letters[s1.charAt(i)]++;
			letters[s2.charAt(i)]--;
		}

		for (int i = 0; i < LETTERS_LEN; i++) {
			if (letters[i] != 0) {
				return false;
			}
		}
		return true;
	}
		
	}
	
	
	
	
	
	

