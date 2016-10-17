


// right shift one number(a)
// if one gets out then add b
// else left shift b


public class Multiply {
	
	public int multiply(int a, int b){
		int i = a;
		int j = b;
		int m;
		while(i>0){
			m=i;
			i>>=i;
			if(m==i+1){
					i=i+j;
					return i;
			}
			j<<=1;
		}
		return j<<1;
	}
	
	public int multiply2(int multiplicand, int factor){
		int m = multiplicand;
		for(int i =1; i<Math.abs(factor); ++i){
			multiplicand+=m;
		}
		return (factor>0? multiplicand: -multiplicand);
		}
}
