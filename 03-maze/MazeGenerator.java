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

  public char[][] getMaze(){
    return maze;
  }

  public static int neighbors(char[][] m, int r, int c){
    int n=0;
    if(m[r-1][c]==' ') n++;
    if(m[r+1][c]==' ') n++;
    if(m[r][c-1]==' ') n++;
    if(m[r][c+1]==' ') n++;
    return n;
  }

  public static boolean safe(char[][] m, int r, int c){
    if(r>0 && r<m.length-1 && c>0 && c<m[0].length-1){
      if(neighbors(m,r,c)<2) return true;
    }
    return false;
  }

  public static void generate(char[][] maze){
    generate(maze,0,0);
  }

  public static void generate(char[][]maze,int startrow,int startcol){

  }



  public static void generateAmazing(char[][]maze,int row,int col,int startrow,int startcol){

  }

}
