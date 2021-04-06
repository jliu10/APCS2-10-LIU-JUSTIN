import java.util.*;

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

    public String stringify(){
      String s = "Array.toString: {";
      for(int i = 0; i < data.length - 1; i++) s += data[i] + ", ";
      if(data.length > 0) s += data[data.length - 1];
      s += "}";
      return s;
    }

    public String toString() {
      String s = "{";
      if(end != -1) {
        for(int i = start; i != end; i = getNext(i)) {
           s += data[i] + ", ";
        }
        s += data[end];
      }
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
      if(size < 1) {
        @SuppressWarnings("unchecked")
        E[] d = (E[])new Object[data.length + 10];
        for(int i = start, n = 0; n < size; i = getNext(i), n++) {
          d[n] = data[i];
        }
        data = d;
        start = 0;
        end = size - 1;
      }
      else {
        @SuppressWarnings("unchecked")
        E[] d = (E[])new Object[data.length * 2];
        for(int i = start, n = 0; n < size; i = getNext(i), n++) {
          d[n] = data[i];
        }
        data = d;
        start = 0;
        end = size - 1;
      }
    }

    public void addFirst(E element) {
      if(element == null) throw new NullPointerException("cannot add null to MyDeque");
      if(getPrev(start) == end) resize();
      start = getPrev(start);
      data[start] = element;
      size++;
      if(size == 1) end = start;
    }

    public void addLast(E element) {
      if(element == null) throw new NullPointerException("cannot add null to MyDeque");
      if(getNext(end) == start) resize();
      end = getNext(end);
      data[end] = element;
      size++;
      if(size == 1) start = end;
    }

    public E removeFirst() {
      if(size == 0) throw new NoSuchElementException("cannot remove from empty set");
      E element = data[start];
      data[start] = null;
      if(size == 1) {
        start = 0;
        end = -1;
      }
      else {
        start = getNext(start);
      }
      size--;
      return element;
    }

    public E removeLast() {
      if(size == 0) throw new NoSuchElementException("cannot remove from empty set");
      E element = data[end];
      data[end] = null;
      if(size == 1) {
        start = 0;
        end = -1;
      }
      else {
        end = getPrev(end);
      }
      size--;
      return element;
    }

    public E getFirst() {
      if(size == 0) throw new NoSuchElementException("cannot get from empty set");
      return data[start];
    }

    public E getLast() {
      if(size == 0) throw new NoSuchElementException("cannot get from empty set");
      return data[end];
    }

}
