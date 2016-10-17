

public class IsBST {

	
	// using in order traversal and keep track of the previous node
	public boolean isBST(TreeNode root){
	TreeNode prev = null;
	if(root!=null){
		if(!isBST(root.left))
			return false;
		
		// allow only distinct nodes		
		if(prev!=null && root.data<=prev.data)
			return false;
		
		prev=root;
		
		return isBST(root.right);
	}
	return true;	
		
	}
		
}
