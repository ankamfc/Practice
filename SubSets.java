import java.util.ArrayList;



public class SubSets{
	
	public ArrayList<ArrayList<Integer>> getSubsets(ArrayList<Integer> set){
		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
		int max = 1<<set.size();
		
		for(int i =0; i<max;i++){
			int index = 0;
			int k=i;
			ArrayList<Integer> subset = new ArrayList<Integer>();
			while(k>0){
				if((k & i) > 0){
					subset.add(set.get(index));
				}
				k=k>>1;
				index++;
			}
			allsubsets.add(subset);
		}
		return allsubsets;
	}

}
