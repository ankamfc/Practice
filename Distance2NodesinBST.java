// find the lca and then call this



public class Distance2NodesinBST {

	public int distance(SearchTree root, SearchTree n1, SearchTree n2){
		
		
		if(root==null|| n1==null|| n2==null) return -1;
		if(n1==n2) return 0;
		SearchTree n =root;
		SearchTree m=root;
		int d1=0;
		int d2=0;

		while(!n.equals(n1)){
			n=n.left;
			d1++;
		}

		while(!m.equals(n2)){
			m=m.right;
			d2++;
		}
		
		return d1+d2;
	}
}
