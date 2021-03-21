public class MyDeque<E>{

    private E[] data;
    private int size, start, end;

    public MyDeque(){
      @SuppressWarnings("unchecked")
      E[] d = (E[])new Object[10];
      data = d;
      size = 10;
      start = 0;
      end = -1;
    }
    public MyDeque(int initialCapacity){
      @SuppressWarnings("unchecked")
      E[] d = (E[])new Object[10];
      data = d;
      size = initialCapacity;
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

    public int size(){ }
    public String toString(){ }
    public void addFirst(E element){ }
    public void addLast(E element){ }
    public E removeFirst(){ }
    public E removeLast(){ }
    public E getFirst(){ }
    public E getLast(){ }

}
