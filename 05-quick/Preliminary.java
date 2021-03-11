public class Preliminary{

  public static void swap(int[] data, int i, int j){
    int t=data[j];
    data[j]=data[i];
    data[i]=t;
  }

  public static String toString(int[] data){
    String s="{";
    for(int i=0; i<data.length-1; i++) s+=data[i]+", ";
    if(data.length>0) s+=data[data.length-1];
    s+="}";
    return s;
  }

  /*Modify the array such that:
  *1. A random index from start to end inclusive is chosen, the corresponding
  *   element is designated the pivot element.
  *2. all elements in range that are smaller than the pivot element are placed
      before the pivot element.
  *3. all elements in range that are larger than the pivot element are placed
      after the pivot element.
  *4. Only the indices from start to end inclusive are considered in range
  *@return the index of the final position of the pivot element.
  */
  public static int partition(int[] data, int start, int end){
    int r=(int)(Math.random()*(end-start+1))+start;
    int p=data[r];
    return p;
  }

}
