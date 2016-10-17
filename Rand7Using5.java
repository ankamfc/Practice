
public class Rand7Using5 {

	public int rand7(){
		int a[][] = {{1,2,3,4,5},{3,2,5,6,7},{6,6,1,1,3},{4,5,4,2,5},{4,4,0,0,0}};
		int result=0;
		while(result==0){
			int i = (int) (Math.random()*5 +1);
			int j = (int) (Math.random()*5 +1);
			result = a[i-1][j-1];
		}
		return result; 
	}
	
	public int rand77(){
		int i;
		do{
			i =(int) (5 * (Math.random()*5-1) +  Math.random()*5);
		}while(i>21);
		
		return i%7 +1;
	}
}
