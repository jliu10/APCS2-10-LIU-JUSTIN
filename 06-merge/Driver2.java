import java.util.*;
public class Driver2{

  public static void randomize(int[] a, int lo, int hi){
    for(int i=0; i<a.length; i++){
      a[i]=(int)(Math.random()*(hi-lo+1))+lo;
    }
  }

  public static void main(String[] args){
    /*
      TERMINAL INPUT FORMAT:
      java Driver2 <arraySize> <arrayType> <method (sort)>
    */
    // int[] arr  = new int[]{2, 10, 15, 23, 0, 5};
    int size=10000;
    if(args.length>2){
      size=Integer.parseInt(args[0]);
      int[] arr1=new int[size];
      if(args[1].equals("rand")) randomize(arr1,0,100);
      else if(args[1].equals("01")) randomize(arr1,0,1);
      else if(args[1].equals("rev")){
        randomize(arr1,0,100);
        for(int i=0; i<arr1.length/2; i++){
          int temp=arr1[i];
          arr1[i]=arr1[arr1.length-i-1];
          arr1[arr1.length-i-1] = temp;
        }
      }
      else if(args[1].equals("sorted")){
        randomize(arr1,0,100);
        Arrays.sort(arr1);
      }
      else if(args[1].equals("same")){
        int u=(int)(Math.random()*100);
        for(int i=0; i<size; i++) arr1[i]=u;
      }

      if(args[2].equals("sort")){
        if(size<=20) System.out.println(Merge.toString(arr1));
        System.out.println();
        int[] arr2=new int[size];
        for(int i=0; i<size; i++) arr2[i]= arr1[i];
        long beg = System.currentTimeMillis();
        Arrays.sort(arr2);
        long end = System.currentTimeMillis();
        if(size<=20) System.out.println(Merge.toString(arr2));
        System.out.println("Arrays.sort time: "+(end-beg));
        System.out.println();

        beg = System.currentTimeMillis();
        Merge.mergesort(arr1);
        end = System.currentTimeMillis();
        if(size<=20) System.out.println(Merge.toString(arr1));
        System.out.println("mergesort time: "+(end-beg));
      }
    }

    System.out.println();
  }

}
