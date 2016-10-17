
public class Atoi {
	 
	public static void main(String args){
		String str = "6700";
		char[] chars = str.toCharArray();
		int result=0;
		int digit;
		for(int i=1;i<chars.length+1;i++){
			Character digitc = new Character(chars[i]);
			digit = digitc.charValue();
			result += digit*Math.pow(10,i-1);
		}
		System.out.println("aa");
		System.out.println(result);
		
	}
}
