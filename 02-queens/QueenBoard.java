public class QueenBoard{

  private int[][]board;

  public QueenBoard(int size){
    board=new int[size][size];
  }

  private void tally(int r, int c, int n){
    for(int i=0; i<board.length; i++){
      for(int j=c; j<board.length; j++){ //no need to look left
        if((i==r || j==c || r+j==c+i) && (board[i][j]!=-1)) board[i][j]+=n;
        //horiz, vert. diag, not queen
      }
    }
  }

  private boolean addQueen(int r, int c){
    // if(r<board.length && c<board.length && board[r][c]!=-1){
    if(board[r][c]!=-1){
      board[r][c]=-1;
      tally(r,c,1);
      return true;
    }
    return false;
  }

  private void removeQueen(int r, int c){
    if(board[r][c]==-1){
      tally(r,c,-1);
      board[r][c]=0;
    }
  }

  /**
  *@return The output string formatted as follows:
  *All numbers that represent queens are replaced with 'Q'
  *all others are displayed as underscores '_'
  *There are spaces between each symbol:
  *_ _ Q _
  *Q _ _ _
  *_ _ _ Q
  *_ Q _ _
  *(pythonic string notation for clarity,
  *excludes the character up to the *)
  */
  public String toString(){
    String s="";
    for(int i=0; i<board.length; i++){
      for(int j=0; j<board.length; j++){
        if(board[i][j]==-1) s+="Q";
        else s+="_";
        if(j==board.length-1) s+="\n";
        else s+=" ";
      }
    }
    return s;
  }

  public boolean isEmpty(){
    for(int i=0; i<board.length; i++){
      for(int j=0; j<board.length; j++) if(board[i][j]!=0) return false;
    }
    return true;
  }

  /**Find the first solution configuration possible for this size board. Start by placing
  *  the 1st queen in the top left corner, and each new queen in the next COLUMN. When backtracking
  *  move the previous queen down to the next valid space. This means everyone will generate the same
  *  first solution.
  *@return false when the board is not solveable and leaves the board filled with zeros;
  *        returns true when the board is solveable, and leaves the board in a solved state
  *@throws IllegalStateException when the board starts with any non-zero value (e.g. you solved a 2nd time.)
  */
  public boolean solve(){
    if(!isEmpty()) throw new IllegalStateException("Cannot solve non-empty board");
    return true;
  }

  /**Find all possible solutions to this size board.
  *@return the number of solutions found, and leaves the board filled with only 0's
  *@throws IllegalStateException when the board starts with any non-zero value (e.g. you ran solve() before this method)
  */
  public int countSolutions(){
    if(!isEmpty()) throw new IllegalStateException("Cannot solve non-empty board");
    return 0;
  }

}
