
public class Stacks {
	Node top;
	
	
	public void push(Object o){
		Node t = new Node(o);
		t.next=top;
		top=t;
	}
	
	public void pop(){
		if(top!=null){
			Object ObjectRemoved = top.data;
			System.out.println("Popped" + ObjectRemoved);
			top = top.next;
		}
	}
	
	
	
}
