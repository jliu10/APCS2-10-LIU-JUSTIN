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
    ArrayList<ArrayList<String>> info=read(filename);
    // setting up arrays, var E
    int[][] pasture=new int[Integer.parseInt(info.get(0).get(0))][Integer.parseInt(info.get(0).get(1))];
    int E=Integer.parseInt(info.get(0).get(2));
    int[][] stomps=new int[Integer.parseInt(info.get(0).get(3))][3];
    // filling in arrays
    for(int i=0; i<pasture.length; i++){
      for(int j=0; j<pasture[0].length; j++){
        pasture[i][j]=Integer.parseInt(info.get(1+i).get(j));
      }
    }
    for(int i=0; i<stomps.length; i++){
      for(int j=0; j<3; j++) stomps[i][j]=Integer.parseInt(info.get(i+1+pasture.length).get(j));
    }
    // stomping pasture
    for(int[] set : stomps){
      int max=0;
      for(int i=set[0]-1; i<set[0]+2; i++){
        for(int j=set[1]-1; j<set[1]+2; j++){
          if(pasture[i][j]>max) max=pasture[i][j];
        }
      }
      for(int i=set[0]-1; i<set[0]+2; i++){
        for(int j=set[1]-1; j<set[1]+2; j++){
          if(pasture[i][j]>max-set[2]) pasture[i][j]=max-set[2];
        }
      }
    }
    // calculation
    int depths=0;
    for(int[] r : pasture) for(int n : r){
      if(n<E) depths+=E-n;
    }
    int v=72*72*depths;
    return v;
  }

  public static long silver(String filename) throws FileNotFoundException{
    ArrayList<ArrayList<String>> info=read(filename);
    // setting up array, var T
    long[][] pasture=new long[Integer.parseInt(info.get(0).get(0))][Integer.parseInt(info.get(0).get(1))];
    int T=Integer.parseInt(info.get(0).get(2));
    // converting String pasture to ints, filling in array
    for(int r=0; r<pasture.length; r++){
      for(int c=0; c<pasture[0].length; c++){
        if(info.get(1+r).get(0).charAt(c)=='.') pasture[r][c]=0;
        else pasture[r][c]=-1;
      }
    }
    /*
    for(int i=0; i<pasture.length; i++){
      for(int j=0; j<pasture[0].length; j++){
        System.out.print(pasture[i][j]+" ");
      }
      System.out.print("\n");
    }
    */
    // getting start, end
    int[] S=new int[2];
    int[] E=new int[2];
    S[0]=Integer.parseInt(info.get(1+pasture.length).get(0))-1;
    S[1]=Integer.parseInt(info.get(1+pasture.length).get(1))-1;
    E[0]=Integer.parseInt(info.get(1+pasture.length).get(2))-1;
    E[1]=Integer.parseInt(info.get(1+pasture.length).get(3))-1;
    // moving cows

    return 0;
  }

}
