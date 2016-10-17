import java.util.Stack;


public class QueueUsingStack<E> {

	public Stack<E> inbox = new Stack<E>();
	public Stack<E> outbox = new Stack<E>();
	
	public void enqueue(E item){
		inbox.push(item);
	}
	
	public E dequeue(){
		if(outbox.isEmpty())
		{
			while(!inbox.isEmpty()){
				outbox.push(inbox.pop());
			}
				
		}
		return outbox.pop();
	}
	
}
