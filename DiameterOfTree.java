// longest distance between 2 tree nodes


public class DiameterOfTree {
	public  int diameter(TreeNode root)
	{
		if(root == null)return 0;
		
		int lheight= height(root.left);
		int rheight= height(root.right);
		
		
		int ldiameter = diameter(root.left);
		int rdiameter = diameter(root.right);
		
		return Math.max(1+lheight+rheight ,Math.max(ldiameter,rdiameter));
	}

	public int height(TreeNode root)
	{
		if(root== null)return 0;
		
		return (1+Math.max(height(root.left),height(root.right)));
	}
}
