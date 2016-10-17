/*
public class Are2BinaryTreesEqual {
	public boolean equals(TreeNode root1, TreeNoderoot2) {
	    // Shortcut for reference equality; also handles equals(null, null)
	    if (root1 == root2) {
	        return true;
	    }
	    if (root1 == null || root2 == null) {
	        return false;
	    }
	    return root1.getData().equals(root2.getData()) &&
	           equals(root1.getLeft(), root2.getLeft()) &&
	           equals(root1.getRight(), root2.getRight());
	}
}

*/