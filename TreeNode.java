import java.util.Stack;


public class TreeNode {
	public TreeNode right;
	public TreeNode left;
	public int data;
	

	public void inOrder(){
	TreeNode root = new TreeNode();
	
	Stack<TreeNode> s= new Stack<TreeNode>();
	
	while(true){
		if(root!=null){
			s.push(root);
			root = root.left;			
		}
		
		else{
			if(s.empty()) return;
			
			root = s.pop();
			System.out.println(root.getData());
			root=root.right;
		}
	}
	}
	
	
	public void preOrder(){                                         // keep the top of the stack in cur and pop it. Then take cur.right and cur.left
		TreeNode root = new TreeNode();
		
		Stack<TreeNode> s= new Stack<TreeNode>();
		
		
		s.push(root);                                                         // push root initially
		
		while(!s.empty()){
				TreeNode cur =s.peek();	                                      // current node is top of stack
				
				System.out.println(s.peek().getData());                       //print current
				
				s.pop();                                                      //pop current
				if(cur.right!=null) s.push(cur.right);                        // repeat for left and right
				if(cur.left!=null) s.push(cur.left);
		}
			
			
		}
		
		


	public void postOrder(){                                                                 // 2 stacks. If u pop out a root from stack to the output stack then add its children to the stack
		TreeNode root = new TreeNode();
		
		Stack<TreeNode> stack = new Stack<TreeNode>();

		Stack<TreeNode> output = new Stack<TreeNode>();
		
		stack.push(root);
		
		while(!stack.isEmpty()){			
			output.push(stack.pop());
			if(root.left!=null) stack.push(root.left);
			if(root.right!=null) stack.push(root.right);
			
		}
		
		while(!output.isEmpty()){
			System.out.println(output.pop());
		}
		
		
	}
	
	
	
	
	
	public static void insertToBST(int a, TreeNode t){
		
		while(t!=null){
		 if(compare(t.data, a) == a){
			t = t.left;
		 }
		 else t = t.right;
		}
		
		
		
		
	}
	
	
	public static int compare(int a, int b){
		if(a>b) return a;
		else return b;
	}
	
	
	
	
	
	public void evaluatePostFix(String str) throws Exception{
		char[] chars = str.toCharArray();
		Stack<Integer> s = new Stack<Integer>();
		//int[] ints = new int[str.length()];
		int i=1;
		while(i<chars.length){
			if(chars[i]=='+'){
				int a = s.pop();
				int b=  s.pop();
				s.push(evaluateMadi(chars[i], a,b));
			}
			else{
				s.push(Character.getNumericValue(chars[i]));
			}
		}
		
		}
	
	
	public int evaluateMadi(char c, int a, int b){
		if(c=='+') return a+b;
		else return 0;
	}
	
	
	
	
	
	
	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
}
