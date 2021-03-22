public class MyDeque<E> {

    private E[] data;
    private int size, start, end;

    public MyDeque() {
      @SuppressWarnings("unchecked")
      E[] d = (E[])new Object[10];
      data = d;
      size = 0;
      start = 0;
      end = -1;
    }
    public MyDeque(int initialCapacity) {
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

    public int size() {
      return size;
    }

    public String toString() {
      String s = "{";
      if(end != -1) {
        for(int i = start - 1; i != end - 1; i++) {
          // if(i>=data.length) i=0;
          // s+=data[i]+", ";
          s += data[getNext(i)] + ", ";
        }
      }
      if(end != -1) s += data[end];
      s += "}";
      return s;
    }

    private int getNext(int current) {
      if(current == data.length - 1) return 0;
      return current + 1;
    }

    private int getPrev(int current) {
      if(current == 0) return data.length - 1;
      return current - 1;
    }

    public void resize() {
      if(size == 0) {
        @SuppressWarnings("unchecked")
        E[] d = (E[])new Object[10];
        data = d;
      }
      else {
        @SuppressWarnings("unchecked")
        E[] d = (E[])new Object[data.length * 10];
        for(int i = start - 1, n = 0; i < size - 1; i++, n++) {
          d[n] = data[getNext(i)];
        }
        data = d;
      }
    }

    public void addFirst(E element) {
      // throw: NullPointerException
    }

    public void addLast(E element) {
      // throw: NullPointerException
    }

    public E removeFirst() {
      // throw: NoSuchElementException
      return data[0];
    }

    public E removeLast() {
      // throw: NoSuchElementException
      return data[0];
    }

    public E getFirst() {
      // throw: NoSuchElementException
      return data[0];
    }

    public E getLast() {
      // throw: NoSuchElementException
      return data[0];
    }


}
