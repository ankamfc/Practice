// no of multiples of 5 before n * 1
// + no of multiples of 10 before n * 2


public class NumberOfZeroesInFactorial {

	public int calculateZeros(int n){
		if(n<0) return 0;
		int count=0;
		for(int i = 5; n/i>0; i*=5){
			count+=n/i;
		}
		return count;
	}
}
