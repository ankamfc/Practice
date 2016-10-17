/*
public class SuccessorBST {
	public SearchTree findSuccessor(SearchTree cur){
		if(cur==null) return cur;
		
		SearchTree parent = cur.parent;               //u ll need a parent pointer in ur searchtree definition
		
		if(cur.right!=null){
			cur=cur.right;
			if(cur.left==null) return cur;
			while(cur.left!=null) cur=cur.left;
			return cur;
		}
		
		// elder twin brother 
		else if(parent.left) == cur) return parent;
		 
		cur=parent;
		while(cur.parent!=null){
			parent=cur.parent;
			if(parent.left==cur) return parent;
			cur=parent;
		}
	}

*/
	// without parent pointer
/*	
	public SearchTree findSucWithoutParentPointer(SearchTree root, SearchTree node){
		SearchTree succ;
		if(root==null || node == null) return null;
		
		// if node has right child
		if(node.right!=null){
			node=node.right;
			if(node.left==null) return node;
			while(node.left!=null) node=node.left;
			return node;
		}
		else{
			while(root){
				if(root.data>node.data){
					succ=root;
					root=root.left;
				}
				else if(root.data<node.data)
					root=root.right;
				else break;
					
			}
			return succ;
		}
	}
}
*/



