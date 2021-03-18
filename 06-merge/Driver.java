public class Driver{

  public static String toString(int[] data){
    return Merge.toString(data);
  }

  public static void main(String[] args){
    int[] arr=new int[]{38,27,43,3,9,82,10};
    System.out.println(toString(arr));
    // System.out.println(toString(Merge.merge(arr,0,0, 0,0)));
    // System.out.println(toString(Merge.merge(arr,0,0, 1,1)));
    System.out.println(toString(Merge.merge(arr,1,2, 3,4)));
  }

}
