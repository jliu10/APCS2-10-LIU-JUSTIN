public class MyDeque<E>{

    private E[] data;
    private int size, start, end;

    public MyDeque(){
      @SuppressWarnings("unchecked")
      E[] d = (E[])new Object[10];
      data = d;
      size = 0;
      start = 0;
      end = -1;
    }
    public MyDeque(int initialCapacity){
      @SuppressWarnings("unchecked")
      E[] d = (E[])new Object[initialCapacity];
      data = d;
      size = 0;
      start = 0;
      end = -1;
    }

    /*

    1) Add: place a new value on the indicated side (first/last)
    2) Get: return but NOT remove the element. (peek)
    3) Remove: return AND remove the element. (pop / de-queue)
    4) Size, Add, remove, and get should be O(1)
    5) toString format has comma space between values, examples:
      "{a, b, c, d}" "{}" "{VALUE, VALUE2, VALUE3}"

    */

    public int size(){
      return size;
    }

    public String toString(){
      String s="";
      return s;
    }

    public void addFirst(E element){ }

    public void addLast(E element){ }

    public E removeFirst(){
      return data[0];
    }

    public E removeLast(){
      return data[0];
    }

    public E getFirst(){
      return data[0];
    }

    public E getLast(){
      return data[0];
    }


}
