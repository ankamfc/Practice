
public class LongestSumSequence {
	
	public int MaxSum(int[] n){
		int sum=0;
		int maxsum=0;
		if(n.length==0) return 0;
		
		
		
		for(int i =0; i<n.length;i++){
			sum+=n[i];
			if(sum>maxsum){
				maxsum=sum;
			}
		}
		return maxsum;
	}
}
