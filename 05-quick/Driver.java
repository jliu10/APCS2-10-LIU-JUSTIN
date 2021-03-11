import java.util.*;
public class Driver{

  public static void main(String[] args){
    int[] a1=new int[]{999,999,999,4,3,2,1,0,999,999,999};

    System.out.println(Preliminary.toString(a1));
    System.out.println("Index: "+Preliminary.partition(a1,7,10));
    System.out.println(Preliminary.toString(a1));
    System.out.println();
    /*
    Preliminary.swap(a1,2,5);
    System.out.println(Preliminary.toString(a1));
    Preliminary.swap(a1,2,5);
    System.out.println(Preliminary.toString(a1));
    Preliminary.swap(a1,0,0);
    System.out.println(Preliminary.toString(a1));
    */
  }

}
