
public class Descendent {
	public SearchTree findDescendent(SearchTree root){
		if(root==null) return root;
		
		if(root.right==null) return root;
		
		root=root.right;
		while(root.left!=null){
			root=root.left;			
		}
		return root;
	}
}
