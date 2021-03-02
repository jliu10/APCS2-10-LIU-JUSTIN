
import java.util.*;
import java.io.*;
public class Maze{

  private char[][]maze;
  private int rows;
  private int cols;
  private boolean animate;//false by default

  /*Constructor loads a maze text file, and sets animate to false by default.
    When the file is not found then:
       throw a FileNotFoundException

    You may assume the file contains a rectangular ascii maze, made with the following 4 characters:
    '#' - Walls - locations that cannot be moved onto
    ' ' - Empty Space - locations that can be moved onto
    'E' - the location of the goal (exactly 1 per file)
    'S' - the location of the start(exactly 1 per file)

    You may also assume the maze has a border of '#' around the edges.
    So you don't have to check for out of bounds!
  */
  public Maze(String filename) throws FileNotFoundException{
    File text=new File(filename);
    ArrayList<char[]> x=new ArrayList<char[]>();
    Scanner inf=new Scanner(text);
    while(inf.hasNextLine()){
      x.add(inf.nextLine().toCharArray());
    }
    maze=new char[x.size()][];
    for(int i=0; i<maze.length; i++){
      maze[i]=x.get(i);;
    }
    rows=maze.length;
    cols=maze[0].length;
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

  public static void clearTerminal(){
      //erase terminal
      System.out.println("\033[2J");
  }
  public static void gotoTop(){
    //go to top left of screen
    System.out.println("\033[1;1H");
  }

  /*Return the string that represents the maze.
   It should look like the text file with some characters replaced.
  */
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

  /*Wrapper Solve Function returns the helper function
    Note the helper function has the same name, but different parameters.
    Since the constructor exits when the file is not found or is missing an E or S, we can assume it exists.
  */
  public int solve(){
          //only clear the terminal if you are running animation
          if(animate){
            clearTerminal();
          }
          //start solving at the location of the s.
          //return solve(???,???);
          int[] s=findS();
          return solve(s[0],s[1]);
  }

  private int[] findS(){
    int[] s=new int[2];
    for(int i=0; i<rows; i++){
      for(int j=0; j<cols; j++){
        if(maze[i][j]=='S'){
          s[0]=i;
          s[1]=j;
        }
      }
    }
    return s;
  }

  /*
    Recursive Solve function:

    A solved maze has a path marked with '@' from S to E.

    Returns the number of @ symbols from S to E when the maze is solved,
    Returns -1 when the maze has no solution.

    Postcondition:
      The 'S' is replaced with '@'
      The 'E' remain the same
      All visited spots that were not part of the solution are changed to '.'
      All visited spots that are part of the solution are changed to '@'
  */
  private int solve(int r, int c){ //you can add more parameters since this is private
    //automatic animation! You are welcome.
    if(animate){
        gotoTop();
        System.out.println(this);
        wait(50);
    }

    //COMPLETE SOLVE
    int var=0;
    if(maze[r][c]=='E') return 0;

    if(maze[r][c]==' ' || maze[r][c]=='S'){
      maze[r][c]='@';
      var=solve(r-1,c);
      if(var>-1) return 1+var;

      var=solve(r,c+1);
      if(var>-1) return 1+var;

      var=solve(r+1,c);
      if(var>-1) return 1+var;

      var=solve(r,c-1);
      if(var>-1) return 1+var;

      maze[r][c]='.';
    }

    return -1; //so it compiles
  }

}
