
public class Merge2LinkedLists {
	
	public List mergeSortedLists(List l1, List l2){
		if(l1==null && l2==null) return null;
		
		if(l2==null) return l1;
		if(l1==null) return l2;
		
		if(l1.data<l2.data) {
			mergeSortedLists(l1.next, l2);
			return l1;
		}
		else{
			mergeSortedLists(l2.next, l1);
			return l2;
		}
	}
}
