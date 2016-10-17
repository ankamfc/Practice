import java.util.HashMap;


public class RemoveCharacter {
	
	public static String removeCharacter(String str, char ch){
		char[] c = str.toCharArray();
		String str1="";
		for(int i =0; i< c.length; i++){
			if(c[i] == ch){
				continue;
			}
			else{
				str1+=c[i];
			}
		}
		
		return str1;
		
		
	}
	
	
	
public void removeString(String str1, String str2){
	for(int i = 0; i< str1.length(); i++){
		for(int j=0; j<str2.length(); j++){
			if(str1.charAt(i)==str2.charAt(j))
				str1=RemoveCharacter.removeCharacter(str1, str2.charAt(j));			
		}
	}
	System.out.println(str1);
}




public String removeStr(String str,String remove)
{
	char s[]= str.toCharArray();
	
	boolean flag[]= new boolean[256];
	
	for(int i =0 ; i<remove.length();i++)
		flag[remove.charAt(i)]=true;
	int dst=0;
	for(int i=0; i<s.length;i++)
	{
		if(!flag[s[i]])
			s[dst++]=s[i];
	}
	
	return new String(s,0,dst);

}

}