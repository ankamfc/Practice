import java.util.HashMap;


public class YLinkedList {


	// assume a perfect hash function O(l1+l2)
	public Lists areTheseMeeting(Lists l1, Lists l2){
		
		HashMap h = new HashMap();
		Lists n1 = l1;
		Lists n2 = l2;
		
		while(n1!=null){
			n1=n1.next;
			h.put(n1, true);
		}
		
		while(n2!=null){
			n2=n2.next;
			
			if(!h.containsKey(n1))
			h.put(n2, true);
			
			else break;
			}
		return n2;
	}
	
	
	// 2) or have a visited? field for every node ---problem is we cant change the data structure
	// 3) Delete all nodes in linked list one. Then traverse through l2 and check for deleted node
	// 4) Take the last node and point to header of second linked list. Now its a circular linked list
	// 5) Simultaneous equations
	// 6) Difference of lengths
	
	
}
