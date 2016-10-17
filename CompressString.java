//Write a function which compress string 
// AAACCCBBD to A3C3B2D

// keep a track of count of repeattitions and append it if of rep > 1

public class CompressString {
	


	
	public StringBuilder buildoutput(StringBuilder sb, char c, int rep){
		sb.append(c);
		if(rep>0) sb.append(Integer.toString(rep));
		return sb;
	}
	
	public String compress(String str){
		StringBuilder sb = new StringBuilder();
		char cur = str.charAt(0);
		char prev=cur;
		int rep=0;
		
		for(int i=0; i<str.length();i++){
			if(prev==cur)
				rep++;
			else{
				sb=buildoutput(sb,cur, rep);
				prev=cur;
				rep=0;
			}
		}
		sb=buildoutput(sb,prev,rep);
		return sb.toString();
	}
}