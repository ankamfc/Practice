import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class SearchTree {
	int data;
	SearchTree left;
	SearchTree right;
	
	public SearchTree find(SearchTree root, int key){
		if(root==null || root.data==key) return root;
		
		if(key>root.data) find(root.right, key);
		if(key<root.data) find(root.left, key);
		return root;
	}
	
	public SearchTree(){}
	
	public SearchTree(int data, SearchTree left, SearchTree right){
		this.data=data;
		this.left=left;
		this.right=right;
	}
	
	
	
	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public SearchTree getLeft() {
		return left;
	}


	public void setLeft(SearchTree left) {
		this.left = left;
	}


	public SearchTree getRight() {
		return right;
	}


	public void setRight(SearchTree right) {
		this.right = right;
	}


	public SearchTree findMin(SearchTree root){
		if(root==null || root.left==null) return root;
		
		return findMin(root.left);
	}
	
	
	public void add(SearchTree root, SearchTree node){                 // always a leaf
		if(root==null) return;
		
		if(node.data>root.data) add(root.right, node);
		
		if(node.data<root.data) add(root.left, node);
		
	}
	
	public SearchTree remove(SearchTree root, SearchTree key){
		
		if (root == null){
			return null;
		}
		
		if(key==root && root.left == null && root.right==null){
			return null;
		}
		
		
		
		
		// (i) key is less than root
		if(key.data<root.data)
			remove(root.left, key);
		
		
		//(ii) key is greater than root
		if(key.data>root.data)
			remove(root.right, key);
		
		//(iii) left child is null
		if(root.left==null)
			return root.right;
		
		
		//(iv) right child is null
		if(root.right==null)
			return root.left;
		
		
		//(v) internal node
		
		else{
			root.data=findMin(root.right).data;
			remove(root.right, key);
			
		return root;
		}
	}
	
	public int countNumberOfNodes(SearchTree root){
		SearchTree right = root.right;
		SearchTree left = root.left;
		int c = 1;
		if(right!=null)
			c+=countNumberOfNodes(root.right);
		if(left!=null)
			c+=countNumberOfNodes(root.left);
		
		return c;
	}
	
	public SearchTree deleteMinimum(SearchTree root){
		root.remove(root, root.findMin(root));
		return root;
	}
	
	public int NumOfLeaves(SearchTree root){
		if(root==null) return 0;
		if(root.left==null|| root.right==null) return 1;
		
		return NumOfLeaves(root.right) + NumOfLeaves(root.left);
	}
	
	
	public int height(SearchTree root){
		if(root==null) return -1;
		
		int r = height(root.right);
		int l=  height(root.left);
		return Math.max(l+1,r+1);
	}
	
	
	
	
	//number of trees
	
	int numTrees(int n) { 
		if (n <=1) return 1; 
		int total = 0; 
		for(int i =1;i<=n;i++) 
		total += numTrees(i-1) * numTrees(n-i); 
		return total; 
		}
	
	public void byLevel(SearchTree root){
	     Queue<SearchTree> level  = new LinkedList<>();
	     level.add(root);
	     while(!level.isEmpty()){
	         SearchTree node = level.poll();
	         System.out.print(node.data + " ");
	         if(node.left!= null)
	         level.add(node.left);
	         if(node.right!= null)
	         level.add(node.right);
	     }
	}
	
	public void levelOrder(ArrayList<SearchTree> n) {
	    ArrayList<SearchTree> next = new ArrayList<SearchTree>();
	    for (SearchTree t : n) {
	        if (t != null) {
	            System.out.print(t.data);
	            next.add(t.left);
	            next.add(t.right);
	        }
	    }
	    System.out.println();
	    if(next.size() > 0)levelOrder(next);
	}
}
	

