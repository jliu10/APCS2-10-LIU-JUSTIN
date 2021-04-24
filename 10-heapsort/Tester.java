import java.util.*;

public class Tester {

  public static void testPushDown(int[] data, int size, int index) {
    System.out.println("TESTING pushdown:");
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

  public static void main(String[] args) {
    try {
      int[] arr1 = {20, 15, 8, 10, 5, 7, 6, 2, 9, 1};
      int[] arr2 = {1, 3, 6, 5, 9, 8};

      System.out.println(MyHeap.isLeaf(6, 5));
      System.out.println(MyHeap.getParent(6));
      System.out.println(Arrays.toString(MyHeap.getChildren(10, 8)));
      testPushDown(arr1, 10, 3);
      testPushDown(arr2, 6, 5);
    }
    catch(IndexOutOfBoundsException e) {

    }

  }

}
