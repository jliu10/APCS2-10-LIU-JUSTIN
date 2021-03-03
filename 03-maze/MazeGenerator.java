public class MazeGenerator{

  private char[][] maze;
  private boolean animate;

  public MazeGenerator(int r, int c){ // generates an r x c rectangle of #s
    maze=new char[r][c];
    for(int i=0; i<r; i++){
      for(int j=0; j<c; j++) maze[i][j]='#';
    }
  }

  private static String colorize(String s){
    s = s.replace("@", "\033[32m\033[49m@\033[0m");
    s = s.replace("#", "\033[37m\033[47m#\033[0m");
    s = s.replace("E", "\033[35m\033[49mE\033[0m");
    return s;
  }

  private void wait(int millis){
       try {
           Thread.sleep(millis);
       }
       catch (InterruptedException e) {
       }
   }

  public void setAnimate(boolean b){
      animate = b;
  }

  public boolean getAnimate(){
    return animate;
  }

  public static void clearTerminal(){
      //erase terminal
      System.out.println("\033[2J");
  }
  public static void gotoTop(){
    //go to top left of screen
    System.out.println("\033[1;1H");
  }

  public String toString(){
    String s="";
    for(int i=0; i<maze.length; i++){
      for(int j=0; j<maze[i].length; j++){
        s+=maze[i][j];
      }
      if(i<maze.length-1) s+="\n";
    }
    return colorize(s);
  }

  public char[][] getMaze(){
    return maze;
  }

  public static double distance(int r1, int c1, int r2, int c2){
    return Math.sqrt(Math.pow(r2-r1,2)+Math.pow(c2-c1,2));
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

  public static void generate(char[][]maze,int rows,int cols,int sr,int sc){
    generate(maze,sr,sc);
    if(maze[sr][sc]==' ') maze[sr][sc]='S';
    double d=0;
    int er=0;
    int ec=0;
    for(int i=0; i<maze.length; i++){
      for(int j=0; j<maze[0].length; j++){
        if(maze[i][j]==' ' && neighbors(maze,i,j)==1){
          if(distance(sr,sc,i,j)>d){
            er=i;
            ec=j;
            d=distance(sr,sc,i,j);
          }
        }
      }
    }
    maze[er][ec]='E';
  }

  public static void generate(char[][] maze,int r,int c){
    if(safe(maze,r,c)){
      maze[r][c]=' ';
      int dir=(int)(Math.random()*4);
      for(int i=0; i<4; i++){
        if(dir>3) dir=0;
        if(dir==0) generate(maze, r-1, c);
        else if(dir==1) generate(maze, r, c+1);
        else if(dir==2) generate(maze, r+1, c);
        else if(dir==3) generate(maze, r, c-1);
        dir++;
      }
    }
  }

  public void generate(int r,int c){
    if(animate){
        gotoTop();
        System.out.println(this);
        wait(50);
    }
    if(safe(maze,r,c)){
      maze[r][c]=' ';
      int dir=(int)(Math.random()*4);
      for(int i=0; i<4; i++, dir++){
        if(dir>3) dir=0;
        if(dir==0) generate(r-1, c);
        else if(dir==1) generate(r, c+1);
        else if(dir==2) generate(r+1, c);
        else if(dir==3) generate(r, c-1);
      }
    }
  }



  public static void generateAmazing(char[][]maze,int row,int col,int startrow,int startcol){

  }

}
