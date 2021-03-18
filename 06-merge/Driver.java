public class Driver{

  public static String toString(int[] data){
    return Merge.toString(data);
  }

  public static void main(String[] args){
    int[] arr=new int[]{38,27,43,3,9,82,10};
    int[] res=new int[7];
    System.out.println(toString(arr));
    // Merge.merge(arr,res, 0,0, 0,0);
    // Merge.merge(arr,res, 0,0, 1,1);
    // Merge.merge(arr,res, 0,1, 2,3);
    // Merge.merge(arr,res, 1,2, 3,4);
    Merge.merge(arr,res, 0,0, 1,2);

    System.out.println(toString(res));
  }

}
