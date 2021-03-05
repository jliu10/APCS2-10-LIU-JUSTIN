import java.util.*;
import java.io.*;
public class USACO{

  public static ArrayList<ArrayList<String>> read(String filename) throws FileNotFoundException{
    ArrayList<ArrayList<String>> info=new ArrayList<ArrayList<String>>();
    File f=new File(filename);
    Scanner inf=new Scanner(f);
    while(inf.hasNextLine()){
      Scanner line=new Scanner(inf.nextLine());
      ArrayList<String> s=new ArrayList<String>();
      while(line.hasNext()){
        String n=line.next();
        if(!n.equals(" ")) s.add(n);
      }
      info.add(s);
    }
    return info;
  }

  public static int bronze(String filename) throws FileNotFoundException{

    return 0;
  }

  public static long silver(String filename){
    return 0;
  }

}
