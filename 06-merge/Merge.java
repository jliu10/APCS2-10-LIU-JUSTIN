public class Merge{

  public static String toString(int[] data){
    String s="{";
    for(int i=0; i<data.length-1; i++) s+=data[i]+", ";
    if(data.length>0) s+=data[data.length-1];
    s+="}";
    return s;
  }

  public static void merge(int[] data, int[] result, int lo1, int hi1, int lo2, int hi2){
    // lo and hi are indexes
    // int[] result=new int[hi2-lo1+1];
    int i1=lo1;
    int i2=lo2;
    // int i=lo1;
    for(int i=lo1; i<=hi2; i++){
      if(i1<=hi1){
        if(i2<=hi2){
          if(data[i1]<=data[i2]){
            result[i]=data[i1];
            i1++;
          }
          else{
            result[i]=data[i2];
            i2++;
          }
        }
        else{
          result[i]=data[i1];
          i1++;
        }
      }
      else{
        result[i]=data[i2];
        i2++;
      }
      // i++;
    }
    // return result;
  }

  public static void mergesort(int[] data){
    int[] t=new int[data.length];
    mergesort(data,t,0,data.length-1);
    // if(data.length%2>0) for(int i=0; i<data.length; i++) data[i]=t[i];
  }

  public static void mergesort(int[] data, int[] temp, int lo, int hi){
    if(data.length>1){
      mergesort(temp,data,lo,hi/2);
      mergesort(temp,data,hi/2+1,hi);
      merge(data,temp,lo,hi/2,hi/2+1,hi);
    }
  }

}
