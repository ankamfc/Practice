// p<root.data<q


public class LeastCommonAncestorBST {

	public SearchTree LCA(SearchTree root, int p ,int q){
		
		if(root==null) return root;
		
		if(root.data==p||root.data==q) return null; //error
		
		if(p<root.data && q<root.data)
			return LCA(root.left, p, q);
		
		if(p>root.data && q>root.data)
			return LCA(root.right, p, q);
		
		else return root;
		
		//return root;
		
	}
}
