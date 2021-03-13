import java.util.*;
public class Driver{

  public static void main(String[] args){
    int[] a1=new int[]{999,999,999,4,3,2,1,0,999,999,999};
    int[] a2=new int[99];
    for(int i=0; i<a2.length; i++){
      if((int)(Math.random()*2)>0) a2[i]=0;
      else a2[i]=1;
    }

    System.out.println(Preliminary.toString(a2));
    System.out.println("Index: "+Preliminary.partition(a2,0,98));
    System.out.println(Preliminary.toString(a2));
    System.out.println();

    System.out.println(Preliminary.toString(a1));
    System.out.println("Index: "+Preliminary.partition(a1,0,0));
    System.out.println(Preliminary.toString(a1));
    System.out.println();
  }

}
