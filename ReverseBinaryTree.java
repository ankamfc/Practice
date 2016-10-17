
public class ReverseBinaryTree {
	
	public void reverse(TreeNode t){
		TreeNode temp;
		temp = t.left;
		t.left=t.right;
		t.right=temp;
		
		if(t.left!=null) reverse(t.left);
		if(t.right!=null) reverse(t.right);
	}
}
