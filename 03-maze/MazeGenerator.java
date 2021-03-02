public class MazeGenerator{

  private char[][] maze;

  public MazeGenerator(int r, int c){ // generates an r x c rectangle of #s
    maze=new char[r][c];
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++) maze[i][j]='#';
    }
  }

  public String toString(){
    String s="";
    for(int i=0; i<maze.length; i++){
      for(int j=0; j<maze[i].length; j++){
        s+=maze[i][j];
      }
      if(i<maze.length-1) s+="\n";
    }
    return s;
  }

  public maze getMaze(){
    return maze;
  }

  public static void generate(char[][]maze,int startrow,int startcol){

  }



  public static void generateAmazing(char[][]maze,int row,int col,int startrow,int startcol){

  }

}
