import java.util.ArrayList;
import java.util.Stack;


public class RealLifeStack {
	Node top;
	int capacity=10;
	ArrayList<Stack> l = new ArrayList<Stack>();
	
	
	public void push(int o){
		if(true){
			
			Node n = new Node(o);
			n.count++;
			top=n;
		}
		else{	
			Node n = new Node(o);
			if(n.count<capacity){
				n.count++;
				n.next=top;
				top =n;
			}
			
		}
		
	}
	
	//public Stack getLastActiveStack(){
	
	//}
	
	public void pop(){
		
	}
}
