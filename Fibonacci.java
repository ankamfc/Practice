
public class Fibonacci {
	
	public int fibrecursive(int n){
		if(n==0) return -1;
		else if(n==1) return 1;
		
		else{
			return fibrecursive(n-1)+fibrecursive(n-2);
		}
	}
	
	public int fibiterative(int n){
		int a =1;
		int b=1;
		if(n==0) return -1;
		else if(n==1) return 1;
		
		else{
			for(int i=3; i<=n;i++){
				int c=a+b;
				a=b;
				b=c;			}
		}
		return b;
	}
}
