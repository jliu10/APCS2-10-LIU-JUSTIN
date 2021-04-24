import java.util.*;

public class Tester {

  public static void testPushDown(int[] data, int size, int index) {
    System.out.println("TESTING pushdown:");
    System.out.println("\tdata: ");
    if(size <= 20) { // don't wanna print too large of an array
      System.out.print(MyHeap.toString(data, size));
    }
    else System.out.print("over size 20");
    System.out.println("\tsize: " + size);
    System.out.println("\tindex: " + index);
    MyHeap.pushDown(data, size, index);
    if(size <= 20) { // don't wanna print too large of an array
      System.out.print(MyHeap.toString(data, size));
    }
    else System.out.print("over size 20");
    System.out.println();
  }

  public static void main(String[] args) {
    try {
      int[][] arr = {{0}, {1}};

      System.out.println(MyHeap.isLeaf(6, 5));
      System.out.println(MyHeap.getParent(6));
      System.out.println(Arrays.toString(MyHeap.getChildren(10, 9)));
    }
    catch(IndexOutOfBoundsException e) {

    }

  }

}
