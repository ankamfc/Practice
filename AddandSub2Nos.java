
public class AddandSub2Nos {
	public int sum(int a, int b){
		if(b==0) return a;
		//if(b==0) return a;
		//aif(a==0 && b==0) return 0;
		
		int s=0;
		int c=0;
		s= a^b;
		c= (a&b) << 1;
		return sum(s,c);
		
	}
	
	int sub(int a, int b)
	{
	  return sum(a, sum(~b, 1));               // bitwise neation(compliment)
	}
	
}
