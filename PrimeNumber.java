
public class PrimeNumber {
	
	public boolean isPrime(int n){
		int divisor =2;
		for(int i = 2; i< n; i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
	
	
	
	
	public void allPrimesTillN(int n){
		for(int i=2;i<n;i++){
			if(isPrime(i)) 
				System.out.println(i);
		}
	}
	
	public void allPrimesUsingPrimeSieve(int n){
		Boolean[] b = new Boolean[n+1];
		
		for(int i=2;i<n;i++){
			b[i]=true;
		}
		
		for(int i=2; i*i<=n; i++){
			if(b[i]){
				for(int j=2*i; j<=n;j=j+i){
					b[j]=false;
				}
			}
		}
		
		for(int i = 2; i<n;i++){
			if(b[i])
				System.out.println(i);
		}
		
	}
	
	
//Bertrand's postulate (actually a theorem) states that if n > 3 is an integer, then there always exists at 
// least one prime number p with n < p < 2n − 2. A weaker but more elegant formulation is: for every n > 1 there
// is always at least one prime p such that n < p < 2n.
//So if I am given a number, say n, than I can check in the range (n, 2*n) [open interval excluding n and 2*n]
	
/*public int getNextPrime(int n){
		bool isPrime = false;
	    int i = n;
	    for (; i < 2 * n; ++i)
	    {
	    // go with your regular prime checking routine
	    // as soon as you find a prime, break this for loop
	    }
} */
	
	
	
// Primes in a given range
//????????????????????????????????????????????????
}


