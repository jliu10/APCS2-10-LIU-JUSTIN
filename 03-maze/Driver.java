import java.io.*;
public class Driver{

    public static void main(String[]args){
      String filename="data1.dat";
      if(args.length>0) filename = args[0];

      try{
        Maze f;
        f = new Maze(filename);//true animates the maze.

        f.setAnimate(true);//comment this if you are using windows cmd/powershell
        System.out.println(f.solve()+" steps");
        System.out.println(f);
        // int[] s=f.findS();
        // System.out.println("S: "+s[0]+", "+s[1]);
      }catch(FileNotFoundException e){
        System.out.println("Invalid filename: "+filename);
      }
    }

}
