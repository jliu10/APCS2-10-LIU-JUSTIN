public class Driver{

  public static String toString(int[] data){
    return Merge.toString(data);
  }

  public static void main(String[] args){
    // int[] arr=new int[]{38,27,43,3,9,82,10};
    // int[] arr=new int[]{38,27,43,3,9,82};
    // int[] arr=new int[]{1};
    // int[] arr=new int[]{1,0};
    // int[] arr=new int[]{9,8,7,6,5,4,3};
    // int[] arr=new int[]{3,2,5,4,7};
    // int[] arr=new int[]{1,2,3,4,5,6};

    // int[] arr=new int[]{1};
    // int[] arr=new int[]{1,2};
    // int[] arr=new int[]{2,1};
    // int[] arr=new int[]{2,2};

    // int[] res=new int[7];
    System.out.println(toString(arr));
    // Merge.merge(arr,res, 0,0, 0,0);
    // Merge.merge(arr,res, 0,0, 1,1);
    // Merge.merge(arr,res, 0,1, 2,3);
    // Merge.merge(arr,res, 1,2, 3,4);
    // Merge.merge(arr,res, 0,0, 1,2);
    //System.out.println(toString(res));

    Merge.mergesort(arr);
    System.out.println(toString(arr));

  }

}
