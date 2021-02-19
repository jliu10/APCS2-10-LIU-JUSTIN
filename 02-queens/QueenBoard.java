public class QueenBoard{

  private int[][]board;

  public QueenBoard(int size){
    board=new int[size][size];
  }

  private void tally(int r, int c, int n){
    for(int i=0; i<board.length; i++){
      for(int j=c; j<board.length; j++){ //no need to look left
        if((i==r || j==c || Math.abs(r-i)==Math.abs(c-j)) && (board[i][j]!=-1)) board[i][j]+=n;
        //horiz, vert. diag, not queen
      }
    }
  }

  private boolean addQueen(int r, int c){
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
    return solve(0,0,0);
  }

  public boolean solve(int r, int c, int q){ // row, column, queens
    if((r==0 && c==0) && !isEmpty()) throw new IllegalStateException("Board is not empty");
    // System.out.println(this);
    // System.out.println("R"+r+" C"+c+" Q"+q);
    if(q==board.length) return true; // all n queens are placed
    else{
      if(r>=board.length) return false;
      if(board[r][c]==0){
        addQueen(r,c);
        q++;
        if(solve(0,c+1,q)) return true;
        else{
          removeQueen(r,c);
          q--;
          if(solve(r+1,c,q)) return true;
        }
      }
      else{
        if(solve(r+1,c,q)) return true;
      }
    }
    return false;
  }

  /**Find all possible solutions to this size board.
  *@return the number of solutions found, and leaves the board filled with only 0's
  *@throws IllegalStateException when the board starts with any non-zero value (e.g. you ran solve() before this method)
  */
  public int countSolutions(){
    return countSolutions(0,0,0);
  }

  public int countSolutions(int r, int c, int q){
    if((r==0 && c==0) && !isEmpty()) throw new IllegalStateException("Board is not empty");
    // System.out.println(this);
    // System.out.println("R"+r+" C"+c+" Q"+q);
    int count=0;
    // System.out.println(count);
    if(q==board.length) return 1; // all n queens are placed
    if(r>=board.length) return 0;
    if(r<board.length || c>0){
      if(board[r][c]==0){
        addQueen(r,c);
        q++;
        // if(countSolutions(0,c+1,q)>0){
        count+=countSolutions(0,c+1,q);
          // System.out.println(count);
        // }

        removeQueen(r,c);
        q--;
        count+=countSolutions(r+1,c,q);
          // System.out.println(count);

      }
      else{
        count+=countSolutions(r+1,c,q);
        // System.out.println(count);
      }

    }
    return count;
  }

}
