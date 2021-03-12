import java.util.*;
public class Driver{

  public static int testMedian(int[] data){
    System.out.println("Median of "+Preliminary.toString(data)+": ");
    return Preliminary.median(data[0],data[1],data[2]);
  }

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

    int[] m1=new int[]{1,2,3};
    System.out.println(testMedian(m1));
    m1=new int[]{3,2,1};
    System.out.println(testMedian(m1));
    m1=new int[]{2,1,3};
    System.out.println(testMedian(m1));
    m1=new int[]{2,2,2};
    System.out.println(testMedian(m1));
    m1=new int[]{3,2,3};
    System.out.println(testMedian(m1));
    m1=new int[]{2,3,2};
    System.out.println(testMedian(m1));

    System.out.println(Preliminary.toString(a1));
    System.out.println("Index: "+Preliminary.partition(a1,7,10));
    System.out.println(Preliminary.toString(a1));
    System.out.println();
  }

}
