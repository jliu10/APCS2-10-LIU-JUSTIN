public class Driver2{

  public static void testSelect(int[] a, int k, int ex){
    System.out.println("quickselect("+Quick.toString(a)+", "+k+") should return: "+ex);
    System.out.println("\treturns: "+Quick.quickselect(a,k));
    System.out.println("\tarray after: "+Quick.toString(a));
    System.out.println();
  }

  public static void main(String[] args){
    int[] arr  = new int[]{2, 10, 15, 23, 0, 5};
    //If sorted: {0,  2,  5, 10, 15, 23}
    //since we are modifying the array you would not call this repeatedly.
    //This is to show what the returned value would be in all cases.

    System.out.println(Quick.toString(arr));
    System.out.println("Index: "+Quick.partition(arr,0,5));
    System.out.println(Quick.toString(arr));
    System.out.println();

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

  }

}
