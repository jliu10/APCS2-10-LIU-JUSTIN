import java.util.*;

public class BurnTrees {
  private int[][] map;
  private int ticks;
  private static int TREE = 2;
  private static int FIRE = 1;
  private static int ASH = 3;
  private static int SPACE = 0;
  private Frontier front;


  /*DO NOT UPDATE THIS
   *PLEASE READ SO YOU SEE HOW THE SIMULATION IS SUPPOSED TO WORK!!!
   */
  public int run(){
    while(!done()){
      tick();
    }
    return getTicks();
  }

  /*Initialize the simulation.
   *If you add more instance variables you can add more here,
   *otherwise it is complete
   */
  public BurnTrees(int width, int height, double density){
    map = new int[height][width];
    for(int r=0; r<map.length; r++ )
      for(int c=0; c<map[r].length; c++ )
        if(Math.random() < density)
           map[r][c]=2;
    front = new Frontier();
    start();//set the left column on fire.
  }

  /*Determine if the simulation is still burning
   *@return false if any fires are still burning, true otherwise
   */
  public boolean done() {
    return front.size() == 0;
  }


  /*This is the core of the simulation. All of the logic for advancing to the next round goes here.
   *All existing fires spread new fires, and turn to ash
   *new fires should remain fire, and not spread.
   */
  public void tick() {
    ticks++;
    int prevSize = front.size(); // size of original frontier
    // to distinguish new from old frontier

    // burning trees
    while(prevSize > 0) {
      int[] burned = front.remove();
      int r = burned[0];
      int c = burned[1];
      map[r][c] = ASH;

      int[] newFire = new int[2];
      if(r > 0 && map[r - 1][c] == TREE) {
        map[r - 1][c] = FIRE;
        newFire[0] = r - 1;
        newFire[1] = c;
        front.add(newFire);
      }
      if(c > 0 && map[r][c - 1] == TREE) {
        map[r][c - 1] = FIRE;
        newFire[0] = r;
        newFire[1] = c - 1;
        front.add(newFire);
      }
      if(r < map.length - 1 && map[r + 1][c] == TREE) {
        map[r + 1][c] = FIRE;
        newFire[0] = r + 1;
        newFire[1] = c;
        front.add(newFire);
      }
      if(c < map[0].length - 1 && map[r][c + 1] == TREE) {
        map[r][c + 1] = FIRE;
        newFire[0] = r;
        newFire[1] = c + 1;
        front.add(newFire);
      }
      prevSize--;
    }
  }

  /*
   *Sets the trees in the left column of the forest on fire
   */
  public void start(){
    //If you add more instance variables you can add more here,
    //otherwise it is complete.
    for(int i = 0; i < map.length; i++){
      if(map[i][0]==TREE){
        map[i][0]=FIRE;
        int[] loc = new int[]{i,0};
        front.add(loc);
      }
    }
  }





  /*DO NOT UPDATE THIS*/
  public int getTicks(){
    return ticks;
  }

  /*DO NOT UPDATE THIS*/
  public String toString(){
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < map.length; i++) {
      for (int c = 0; c < map[i].length; c++) {
        if(map[i][c]==SPACE)
          builder.append(" ");
        else if(map[i][c]==TREE)
          builder.append("@");
        else if(map[i][c]==FIRE)
          builder.append("w");
        else if(map[i][c]==ASH)
          builder.append(".");
      }
      builder.append("\n");
    }
    return builder.toString();
  }
  /*DO NOT UPDATE THIS*/
  public String toStringColor(){
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < map.length; i++) {
      for (int c = 0; c < map[i].length; c++) {
        if(map[i][c]==0)
          builder.append(" ");
        else if(map[i][c]==2)
          builder.append(Text.color(Text.GREEN)+"@");
        else if(map[i][c]==1)
          builder.append(Text.color(Text.RED)+"w");
        else if(map[i][c]==3)
          builder.append(Text.color(Text.DARK)+".");
      }
      builder.append("\n"+Text.RESET);
    }
    return builder.toString()+ticks+"\n";
  }


  /*DO NOT UPDATE THIS*/
  public int animate(int delay) {
    System.out.print(Text.CLEAR_SCREEN);
    System.out.println(Text.go(1,1)+toStringColor());
    Text.wait(delay);
    while(!done()){
      tick();
      System.out.println(Text.go(1,1)+toStringColor());
      Text.wait(delay);
    }
    return getTicks();
  }

  /*DO NOT UPDATE THIS*/
  public int outputAll(){
    System.out.println(toString());
    while(!done()){
      tick();
      System.out.println(toString());
    }
    return getTicks();
  }


  public static void main(String[]args)  throws InterruptedException{
    int WIDTH = 20;
    int HEIGHT = 20;
    int DELAY = 200;
    double DENSITY = .7;
    boolean anim = false;
    if(args.length > 1){
      WIDTH = Integer.parseInt(args[0]);
      HEIGHT = Integer.parseInt(args[1]);
      DENSITY = Double.parseDouble(args[2]);
    }
    if(args.length > 3){
      anim = true;
      if(!args[3].equals("animate")){
        DELAY = Integer.parseInt(args[3]);
      }
    }
    BurnTrees b = new BurnTrees(WIDTH,HEIGHT,DENSITY);

    if(!anim) {
      long start = System.currentTimeMillis();
      System.out.println("TICKS: "+b.run());
      System.out.println("TIME: "+(System.currentTimeMillis()-start));
    }
    else {
      System.out.println(b.animate(DELAY));//animate all screens and print the final answer
      //System.out.println(b.outputAll());//print all screens and the final answer
    }
  }


}
