// 1. Group the edges by their type. Inners go with the 
// 2. Classes: Edge, Piece, Puzzle

/*
public class JigSawEdge {
	enum Type{inner, outer, flat};
	JigSawPiece parent;
	Type type;
	bool fits width;
}


public class Piece {
	JigSawEdge left, right, top, bottom;
	Orientation;
}

public class puzzle{
	Piece pieces;
	piece solution;
	Edge[] inners, outers, flats;
	// work inwards starting from the corners
	
	Edge[] exposedEdges;
	
	void sort(){
		iterate over the edges and add each to inners, outers and flats. Look for corners and them to solution first and then only go inside
	}
	
	void solve(){
		for each edge1 in exposed edges(){
			if(edge1.type = Edge.type.inner){
				for each edge 1 in outers{
					edge1.fitsitswidth of edge2{
						we found a match
					}
				}
			}
		} swap inner and outer and do the same thing
	}
}

*/

