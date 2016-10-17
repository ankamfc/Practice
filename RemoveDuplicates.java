import java.util.LinkedHashSet;



// removeDuplicates: String -> String
// Example: ip= akshay, op = akshy
// strategy: LinkedHashSet
// function definition

public class RemoveDuplicates {

	public void duplicatesRemoved(String str){
		char word[] = str.toCharArray();
		LinkedHashSet<Character> charz = new LinkedHashSet<Character>();
		
		for(Character c:word){
			if(!charz.contains(c))
			charz.add(c);
		}
		for(Character c: charz){
			System.out.println(c);
		}
	}
}
