/*
public class LCABinaryTree {
	/*
	p q root

	num towards the left is =2
	=> LCA is on the right

	if left = 1 => return the node as it might be the ancestor

	num towards the right is=2 
	=> LCA is on the right
	*/
/*
	public int covers(TreeNode root,TreeNode p,Node q)
	{
		if(root==null)return 0;
		ret=0;
		if(root==p||root==q) ret++;
		ret+=covers(root.left,p,q)
		if(ret==2) return 2;
		return ret+covers(root.right,p,q);
	}

	public Node LCA(Node root,Node p,Node q)
	{
		if(root.left==p && root.right==q) return root;
		int left=covers(root.left,p,q);
		if(left==2)
		{
			if(root.left==q||root.left==p)
				return root.left;
			else
				LCA(root.left,p,q);	
		}
		else if(left==1)
			if(root==p) return p;
			else if(root==q)return q;
		int right=covers(root.right,p,q);
		if(right==2)
		{
			if(root.right==q||root.right==p)
				return root.right;
			else
				LCA(root.right,p,q);	
		}
		else if(right==1)
			if(root==p) return p;
			else if(root==q)return q;
		if(left==1&&right==1)return root;
		else return null;
	}
} */
