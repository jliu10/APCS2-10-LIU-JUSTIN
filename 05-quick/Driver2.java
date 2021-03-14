import java.util.*;
public class Driver2{

  public static void testSelect(int[] a, int k, int ex){
  //  System.out.println("quickselect("+Quick.toString(a)+", "+k+") should return: "+ex);
    System.out.println("  returns: "+Quick.quickselect(a,k));
  //  System.out.println("  array after: "+Quick.toString(a));
    System.out.println();
  }

  public static void randomize(int[] a, int lo, int hi){
    for(int i=0; i<a.length; i++){
      a[i]=(int)(Math.random()*(hi-lo+1))+lo;
    }
  }

  public static void main(String[] args){
    int[] arr  = new int[]{2, 10, 15, 23, 0, 5};
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

      if(args[2].equals("select")){
        long beg = System.currentTimeMillis();
        System.out.println(Quick.quickselect(arr1,Integer.parseInt(args[3])));
        long end = System.currentTimeMillis();
        System.out.println("quickselect time: "+(end-beg));
      }
      else if(args[2].equals("sort")){
        if(size<=20) System.out.println(Quick.toString(arr1));
        int[] arr2=new int[size];
        for(int i=0; i<size; i++) arr2[i]= arr1[i];
        long beg = System.currentTimeMillis();
        Arrays.sort(arr2);
        long end = System.currentTimeMillis();
        if(size<=20) System.out.println(Quick.toString(arr2));
        System.out.println("Arrays.sort time: "+(end-beg));
        System.out.println();

        beg = System.currentTimeMillis();
        Quick.quicksort(arr1);
        end = System.currentTimeMillis();
        if(size<=20) System.out.println(Quick.toString(arr1));
        System.out.println("quicksort time: "+(end-beg));
      }
    }
    //If sorted: {0,  2,  5, 10, 15, 23}
    //since we are modifying the array you would not call this repeatedly.
    //This is to show what the returned value would be in all cases.
    /*
    System.out.println(Quick.toString(arr));
    System.out.println("Index: "+Quick.partition(arr,0,5));
    System.out.println(Quick.toString(arr));
    System.out.println();
    */

    /*
    System.out.println("\n-----QUICKSELECT: TESTING GIVEN EXAMPLES-----");
    testSelect(arr, 0, 0);
    arr  = new int[]{2, 10, 15, 23, 0,  5};
    testSelect(arr, 1, 2);
    arr  = new int[]{2, 10, 15, 23, 0,  5};
    testSelect(arr, 2, 5);
    arr  = new int[]{2, 10, 15, 23, 0,  5};
    testSelect(arr, 3, 10);
    arr  = new int[]{2, 10, 15, 23, 0,  5};
    testSelect(arr, 4, 15);
    arr  = new int[]{2, 10, 15, 23, 0,  5};
    testSelect(arr, 5, 23);
    */

    /*
    System.out.println("\n-----QUICKSELECT: TESTING RANDOM EXAMPLES-----");
    int[] arr1=new int[size];
    randomize(arr1,0,100);
    int[] arr2=new int[arr1.length];
    for(int i=0; i<arr1.length; i++) arr2[i]= arr1[i];
    int n=(int)(Math.random()*100);
    // System.out.println("n: "+n);
    long beg = System.currentTimeMillis();
    Arrays.sort(arr2);
    long end = System.currentTimeMillis();
    System.out.println("Arrays.sort time: "+(end-beg));
    beg = System.currentTimeMillis();
    testSelect(arr1,0,-1);
    end = System.currentTimeMillis();
    System.out.println("quickselect time: "+(end-beg));
    */
    System.out.println();
  }

}
