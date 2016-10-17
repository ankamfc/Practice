
public class Stringbuilderex {
	
	StringBuilder sb = new StringBuilder(100);
	StringBuilder s = new StringBuilder();
	
	public Stringbuilderex(){
		sb.append("a");
		sb.insert(0, "b" );
		System.out.println(sb.toString());
	}
}
