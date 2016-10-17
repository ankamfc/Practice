
public class Dfs extends TreeNode{
	
	public void traverse(TreeNode node){
		if(node.left==null||node.right==null) return;
		
		if(node.left!=null)
			traverse(node.left);
		if(node.right!=null)
			traverse(node.right);

	}
}
