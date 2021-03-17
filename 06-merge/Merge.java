public class Merge{

  public static String toString(int[] data){
    String s="{";
    for(int i=0; i<data.length-1; i++) s+=data[i]+", ";
    if(data.length>0) s+=data[data.length-1];
    s+="}";
    return s;
  }

  public static int[] merge(int[] data, int lo1, int hi1, int lo2, int hi2){

  }

  public static void mergesort(int[] data){
    int[] t=new int[data.length];
    mergesort(data,t,0,data.length-1);
  }

  public static void mergesort(int[] data, int[] temp, int lo, int hi){

  }

}
