
public class List {
	int data;
	List next=null;
	
	public List(){}
	
	public List(int data){
		this.data=data;
	}
	public void appendToTail(List l, int s){
		//if(l==null) return;
		
		List newNode = new List(s);
		
		if(l.next==null){
			
			l.next=newNode;
		}
		
		else{
			List n =l;
			
			while(n.next!=null){
				n=n.next;
			}
			//Lists newNode = new Lists(s);
		n.next=newNode;
		}
	}

	public void sumOfTwoLinkedLists(List l1, List l2){
		List n1 = l1;
		List n2 = l2;
		List Result = new List();
		
		Result.data=(n1.data+n2.data)%10;
		
		List n3=Result;
		
		int carry=(n1.data+n2.data)-9;
		
		while(!(n1.next==null && n2.next==null)){
			
		n3.data=(n1.data+n2.data+carry)%10;
		n3=n3.next;
		n1=n1.next;
		n2=n2.next;
		
		}
		
	}
	
	
}
