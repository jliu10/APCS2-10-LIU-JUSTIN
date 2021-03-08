import java.io.*;
public class Driver{

  public static void main(String[] args){
    String lake1="lake1.input";
    String cowPath1="cowPath1.input";

    String input="";
    if(args.length==2){
      input=args[1];
    }

    try{
      System.out.println(USACO.read(lake1).toString());
      System.out.println(lake1+": "+USACO.bronze(lake1));
      System.out.println(USACO.read(cowPath1).toString());
      System.out.println(cowPath1+": "+USACO.silver(cowPath1));
      System.out.println();
      if(args.length==2){
        if(args[0].equals("bronze")){
          System.out.println("bronze "+input+": "+USACO.bronze(input));
        }
        else if(args[0].equals("silver")){
          System.out.println("silver "+input+": "+USACO.silver(input));
        }
      }
    }catch(FileNotFoundException e){
      System.out.println("Invalid filename");
    }
  }

}
