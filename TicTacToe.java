/*
You know a winning move can only happen after X or O has made their most recent move, so you can only search
row/column with optional diag that are contained in that move to limit your search space when trying to determine a winning board.
Also since there are a fixed number of moves in a draw tic-tac-toe game once the last move is made if it wasn't a winning move 
it's by default a draw game.


 */
public class TicTacToe {
	   enum State{Blank, X, O};

	    int n = 3;
	    State[][] board = new State[n][n];
	    int moveCount;

	    void Move(int x, int y, State s){
	    	if(board[x][y] == State.Blank){
	    		board[x][y] = s;
	    	}
	    	moveCount++;

	    	//check end conditions

	    	//check col
	    	for(int i = 0; i < n; i++){
	    		if(board[x][i] != s)
	    			break;
	    		if(i == n-1){
	    			//report win for s
	    		}
	    	}

	    	//check row
	    	for(int i = 0; i < n; i++){
	    		if(board[i][y] != s)
	    			break;
	    		if(i == n-1){
	    			//report win for s
	    		}
	    	}

	    	//check diag
	    	if(x == y){
	    		//we're on a diagonal
	    		for(int i = 0; i < n; i++){
	    			if(board[i][i] != s)
	    				break;
	    			if(i == n-1){
	    				//report win for s
	    			}
	    		}
	    	}

	            //check anti diag (thanks rampion)
	    	for(int i = 0;i<n;i++){
	    		if(board[i][(n-1)-i] != s)
	    			break;
	    		if(i == n-1){
	    			//report win for s
	    		}
	    	}

	    	//check draw
	    	if(moveCount == (n^2 - 1)){
	    		//report draw
	    	}
	    }
	}
