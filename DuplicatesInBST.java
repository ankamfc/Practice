/*
Easy since the input tree is BST. if we do inorder traversal we will get data in sorted order. 
	1. Do inorder traversal 
	2. Have 2 class member variable prevValue and valueCount 
	3. while traversing check if node.data == prevValue the increase the count 
	4. else print the value and count - 1 

	All set 
	/// 
 */


public class DuplicatesInBST {
	int prevData=0;
	int count=0;
	
	public void printExtraDups(SearchTree root){ 
	if(root != null) 
	{ 

	if (root.left != null ) 
	printExtraDups(root.left); 

	if(prevData == root.data) count++; 
	else System.out.println("Prev: "+prevData+" count: "+(count -1)); 

	prevData = root.data; 

	if(root.right !=null ) 
	printExtraDups(root.right); 
	} 
	} 
}
