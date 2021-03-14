public class Quick{

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

  public static int partition(int[] data, int start, int end){
    int r=(int)(Math.random()*(end-start+1))+start;
    int p=data[r];
    // System.out.println("Pivot: "+p);
    swap(data,r,start);

    int current=start+1;
    int last=end;
    while(current<last){
      if(data[current]<p) current++;
      else if(data[current]==p){
        if((int)(Math.random()*2)>0) current++;
        else{
          swap(data,current,last);
          last--;
        }
      }
      else{
        swap(data,current,last);
        last--;
      }
    }
    if(current==last){
      if(data[current]<p){
        swap(data,start,current);
        return current;
      }
      else swap(data,start,current-1);
      return current-1;
    }
    return start;
  }

  /*return the value that is the kth smallest value of the array.
  *@param data must have a length > 0
  *@param k is 0 to data.length-1 inclusive
  *@postcondition The array can be modified. (If we did not want to modify the array, we could make a copy before we start the process)
  */
  public static int quickselect(int[] data, int k){
    int hi=data.length-1;
    int ip=partition(data,0,hi);
    while(ip!=k){
      if(ip>k) ip=partition(data,0,ip-1);
      else ip=partition(data,ip+1,hi);
    }
    return data[ip];
  }

  public static void quicksort(int[] data){
    quicksort(data,0,data.length-1);
  }

  public static void quicksort(int[] data,int lo,int hi){
    if(hi-lo>0){
      int n=partition(data,lo,hi);
      quicksort(data,lo,n-1);
      quicksort(data,n+1,hi);
    }
  }

  public static int[] partitionDutch(int[] data, int lo, int hi){
           //THIS IS OPTIONAL METHOD, it will make your quicksort faster.
           //return an int array: {lt,gt}
    return data;
  }

}
