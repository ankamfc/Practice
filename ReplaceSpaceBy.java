
public class ReplaceSpaceBy {
	
	public static void Replace(char[] s, int length){
		
		int spacecount=0;
		// first count the number of spaces
		
		for(int i =0; i<length;i++){
			if(s[i]==' ')
				spacecount++;
		}
		
		// increase length
		int newlength = length + spacecount*2;
		
		for(int i = length; i>0; i--){
			if(s[i]==' '){
				s[newlength]='0';
				s[newlength-1]='2';
				s[newlength-2]='%';
			}
			else{
				s[newlength-1] = s[i];
				newlength = newlength-1;
			}
		}
	}

}
