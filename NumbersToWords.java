
public class NumbersToWords {
	
	public String numbersToString(int n){
		
		StringBuilder sb = new StringBuilder();
		
		int len =1;
		while(Math.pow(10, len)<n){
			len++;
		}
		
		String[] s1={"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] s2={"", "Eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
		String[] s3={"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "Ninety"};
		
		int temp;
		temp=n/10;
		
		if(n==0) return "Zero";
		
		if(len<3){
		do{
			if(temp==0){
				temp=temp%10;
				sb.append(s1[temp]);
				len--;
			}
			if(temp==1){
				temp=temp%10;
				sb.append(s2[temp]);
				len=len-2;
			}
			else{
			sb.append(s3[temp]);
			n=n%10;
			sb.append(s1[n]);
			len=len-2;
			}
			
		}while(len>0);
		
	}
		return sb.toString();
	}
}
