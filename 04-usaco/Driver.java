import java.io.*;
public class Driver{

  public static void main(String[] args){
    String filename="lake1.input";

    try{
      System.out.println(USACO.read(filename).toString());

    }catch(FileNotFoundException e){
      System.out.println("Invalid filename: "+filename);
    }
  }

}
