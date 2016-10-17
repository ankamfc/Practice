import java.util.HashSet;
import java.util.Set;


public class SetAMinusSetB {
	
	public HashSet<Integer> minus(int maxA, int minA, int maxB, int minB){
		HashSet<Integer> hash = new HashSet<Integer>();
		
		for(int i=minA; i<maxA; i++){
			hash.add(i);
		}
		
		for(int i = minB; i<maxB; i++){
			hash.remove(i);
		}
		return hash;
	}
}