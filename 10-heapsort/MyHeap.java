public class MyHeap {

  // Calculate log base 2 of n.
  public static int log2(int n) {
    return (int)(Math.log(n) / Math.log(2));
  }

  /**Return true if index is a leaf (last tier of heap) of a size size heap,
   * false otherwise.
   */
  public static boolean isLeaf(int size, int index) {
    return log2(index + 1) == log2(size);
  }

  // If index has a parent, return the index of the parent; return -1 otherwise.
  public static int getParent(int index) {
    if(index == 0) return -1;
    return (index - 1) / 2;
  }

  /**If index has any children, return an array of their indices; return an
   * empty array otherwise.
   */
  public static int[] getChildren(int size, int index) {
    int[] children = {};
    return children;
  }

  // Return a String representation of the array taking into account size.
  public static String toString(int[] data, int size) {
    String s = "{";
    for(int i = 0; i < size - 1; i++) {
      s += data[i] + ", ";
    }
    if(size > 0) s += data[size - 1];
    return s + "}";
  }

 /*Swap the element at the provided index downward into the correct position.
   This will swap with the larger of the child nodes provided thatchild is larger.
   This stops when a leaf is reached, or neither child is larger.
   *@param size the number of heap elements in the data array.
           This is needed to allow a partially full array to be provided.
  *@precondition the children of data[index] are valid heaps.
  *@precondition index is between 0 and size-1 inclusive
  *@precondition size is between 0 and data.length inclusive.
  */
 public static void pushDown(int[] data, int size, int index) {
   System.out.println("MAKE THIS METHOD PRIVATE");
 }

 /*Reorder the provided array to be a valid heap.
  *@param data is the array to be modified
  */
 private static void buildHeap(int[] data) {

 }

 /*Swap the root node with the element at the provided index.
  *Then push the new root down, but not past the index that it swapped with.
  *@precondition: size is between 0 and data.length inclusive.
  */
 private static void remove(int[] data, int size) {

 }

 /*Sort the provided array
  *@param data is the array to be sorted
  */
 public static void heapsort(int[] data) {

 }

}
