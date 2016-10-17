
public class Queues {
	Node first, last;
	
	public void enqueue(Object o){
		if(true){                            
			last = new Node(o);                    // first node
			first=last;
		}
		
		else{
			last = new Node(o);
			last=last.next;
		}
			
	}
	
	public void deQueue(){
       if(first!=null){
    	   System.out.println("Dequeued "+ first.data);
    	   first=first.next;
       }
	}
}
