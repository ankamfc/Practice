import java.util.Stack;


public class BinaryTrees {
	
	BinaryTrees left;
	BinaryTrees right;
	int data;
	
	BinaryTrees(int data){
		this.data=data;
	}
	
	BinaryTrees(){
	}
	
	
	// if this is sorted then its a bst
	public void inOrder(){
		Stack<BinaryTrees> s = new Stack<BinaryTrees>();
		BinaryTrees current = new BinaryTrees();
		
		while(true){
			if(current!=null){                                          // keep going left till node is null
				s.push(current);                                       // push current onto stack
				current = current.left;                               // turn left
			}     
			else{                                                    
				System.out.println(s.peek().data);                    // pop top, print it
				s.pop();
				current = current.right;                                   
			}
		}
		
	}
	
	public void preOrder(){
		Stack<BinaryTrees> s = new Stack<BinaryTrees>();
		BinaryTrees  cur = new BinaryTrees();
		
		s.push(cur);                                                                 // push onto stack
		
		while(cur!=null){
			System.out.println(cur.data);                                            // output data
			s.pop();                                                                 // pop stack
			
			if(cur.left!=null) s.push(cur.right);                                      // push right
			if(cur.right!= null) s.push(cur.left);                                     // push left
		}
	}
	
	
	
	
	public void postOrder(){
		Stack<BinaryTrees> s1 = new Stack<BinaryTrees>();
		Stack<BinaryTrees> s2 = new Stack<BinaryTrees>();

		BinaryTrees cur = new BinaryTrees();
		 
		s1.push(cur);                                                                 // push root
		 
		while(!s1.isEmpty()){                                                 // till stack 1 is empty
			s2.push(s1.pop());                                                // push top of s1 to s2
			if(cur.right!=null) s1.push(cur.right);                           // if theres a right, push him too
			if(cur.left!=null) s1.push(cur.left);                             // if theres left, push him too
		}
		
		while(s2.isEmpty()){
			System.out.println(s2.peek().data);
		}
		
	}
	
	//HEIGHT OF BINARY TREE
	
	int height(BinaryTrees root) {
        return (root==null) ? 0: 1 + Math.max(height(root.left),height(root.right));
}

	
	//BALANCED??
boolean isHeightBalanced(BinaryTrees root) {
        return (root == null) ||
                (isHeightBalanced(root.left) &&
                isHeightBalanced(root.right) &&
                Math.abs(height(root.left) - height(root.right)) <=1);
}
	
	
	
	
	
}
