
public class QuickMinStack {
	Node top;
	//int min;
	
	public boolean isEmpty(QuickMinStack s){
		if(this.top==null) return true;
		else return false;
	}
	
	public void push(QuickMinStack s, int o){
		if(s.isEmpty(s)){
			Node n = new Node(o);
			n.setMin(o);
			n.setData(o);			
			top=n;	
			//System.out.println(n.getData());
		}
		else{
			Node n = new Node(o);
			if(o<top.getMin()){
				n.setMin(o);
				n.next=top;
				top=n;
			}
			else{
				n.next=top;
				top=n;
			}
		}
			
	}
	
	public void pop(){
		if(top!=null){
			System.out.println(top.data + "has been popped");
			top=top.next;
		}
	}
	
	public int getMinimum(){
		return top.min;
	}
	
	public void display(){
		while(top!=null){
			System.out.println(top.data);
			top=top.next;
		}
	}
	
}
