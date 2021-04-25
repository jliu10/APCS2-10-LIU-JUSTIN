import java.util.*;

public class Tester {

  public static void testPushDown(int[] data, int size, int index) {
    System.out.println("TESTING pushDown:");
    System.out.print("\tdata:     ");
    if(size <= 20) { // don't wanna print too large of an array
      System.out.println(MyHeap.toString(data, size));
    }
    else System.out.println("over size 20");
    System.out.println("\tsize: " + size);
    System.out.println("\tindex: " + index);
    MyHeap.pushDown(data, size, index);
    System.out.print("\tnew data: ");
    if(size <= 20) { // don't wanna print too large of an array
      System.out.println(MyHeap.toString(data, size));
    }
    else System.out.println("over size 20");
    System.out.println();
  }

  public static void testBuildHeap(int[] data) {
    int size = data.length;
    System.out.println("TESTING buildHeap:");
    System.out.print("\tdata:     ");
    if(size <= 20) { // don't wanna print too large of an array
      System.out.println(MyHeap.toString(data, size));
    }
    else System.out.println("over size 20");
    System.out.println("\tlength: " + size);
    MyHeap.buildHeap(data);
    System.out.print("\tnew data: ");
    if(size <= 20) { // don't wanna print too large of an array
      System.out.println(MyHeap.toString(data, size));
    }
    else System.out.println("over size 20");
    System.out.println();
  }

  public static void testRemove(int[] data, int size) {
    System.out.println("TESTING remove:");
    System.out.print("\tdata:     ");
    // MyHeap.buildHeap(data);
    if(size <= 20) { // don't wanna print too large of an array
      System.out.println(MyHeap.toString(data, size));
    }
    else System.out.println("over size 20");
    System.out.println("\tlength: " + size);
    MyHeap.remove(data, size);
    System.out.print("\tnew data: ");
    if(size <= 20) { // don't wanna print too large of an array
      System.out.println(MyHeap.toString(data, size));
    }
    else System.out.println("over size 20");
    System.out.println();
  }

  public static void main(String[] args) {
    try {
      int[] arr1 = {20, 15, 8, 10, 5, 7, 6, 2, 9, 1};
      int[] arr2 = {1, 3, 6, 5, 9, 8};
      int[] arr3 = {100, 19, 36, 17, 3, 25, 1, 2, 7};
      int[] arrE = {};
      int[] arrS = {0, 1, 2, 3, 4, 5, 6};

      // System.out.println(MyHeap.isLeaf(6, 5));
      // System.out.println(MyHeap.getParent(6));
      // System.out.println(Arrays.toString(MyHeap.getChildren(10, 8)));
      // testPushDown(arr1, 10, 3);
      // testPushDown(arr2, 6, 5);
      // testPushDown(arr3, 9, 2);
      // System.out.println("---------------------------");
      // testBuildHeap(arr2);
      // testBuildHeap(arr3);
      // testBuildHeap(arrE);
      // testBuildHeap(arr1);
      // testBuildHeap(arrS);
      testRemove(arr1, 10);
      testRemove(arr2, 2);

      System.out.println("ALL METHODS SHOULD BE PRIVATE EXCEPT heapsort AND toString");
    }
    catch(IndexOutOfBoundsException e) {

    }

  }

}
