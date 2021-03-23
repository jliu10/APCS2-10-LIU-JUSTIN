import java.util.*;
import java.io.*;

public class Driver {

  public static void main(String[] args) {
    MyDeque<Integer> intDeck = new MyDeque<Integer>(0);
    MyDeque<String> strDeck = new MyDeque<String>();
    MyDeque<String> strDeck2 = new MyDeque<String>(1);

    try {
      System.out.println(intDeck);
      System.out.println(intDeck.size());
      System.out.println();

      System.out.println(strDeck);
      System.out.println(strDeck.size());
      System.out.println();

      intDeck.addFirst(17);
      System.out.println(intDeck);
      System.out.println(intDeck.size());
      // System.out.println(intDeck.stringify());
      System.out.println();

      // intDeck.addFirst(null);
      // intDeck.addFirst(-1);
      intDeck.addLast(-1);
      System.out.println(intDeck);
      System.out.println(intDeck.size());
      // System.out.println(intDeck.stringify());
      System.out.println();

      strDeck.addFirst("a"); strDeck.addFirst("b"); strDeck.addFirst("c");
      strDeck.addFirst("d"); strDeck.addFirst("e"); strDeck.addFirst("f");
      strDeck.addFirst("g"); strDeck.addFirst("h"); strDeck.addFirst("i");
      strDeck.addFirst("j"); strDeck.addFirst("k");
      System.out.println(strDeck);
      // System.out.println(strDeck.stringify());
      System.out.println(strDeck.size());
      System.out.println();

      System.out.println(intDeck);
      System.out.println(intDeck.size());
      // System.out.println(intDeck.stringify());
      intDeck.addLast(1); intDeck.addLast(2); intDeck.addLast(3); intDeck.addLast(4);
      intDeck.addLast(5); intDeck.addLast(6); intDeck.addLast(7); intDeck.addLast(8);
      intDeck.addFirst(16);
      System.out.println(intDeck);
      System.out.println(intDeck.size());
      // System.out.println(intDeck.stringify());
      // intDeck.addLast(9);
      intDeck.addFirst(15);
      // intDeck.resize();
      System.out.println(intDeck);
      System.out.println(intDeck.size());
      // System.out.println(intDeck.stringify());
      System.out.println();

      System.out.println(intDeck.removeFirst());
      System.out.println(intDeck);
      System.out.println(intDeck.size());
      // System.out.println(intDeck.stringify());
      System.out.println();

      System.out.println(intDeck.removeLast());
      System.out.println(intDeck);
      System.out.println(intDeck.size());
      // System.out.println(intDeck.stringify());
      System.out.println();

      System.out.println(strDeck2);
      // System.out.println(strDeck2.removeLast());
      strDeck2.addLast("707");
      // strDeck2.addFirst("707");
      System.out.println(strDeck2);
      // System.out.println(strDeck2.removeFirst());
      System.out.println(strDeck2.removeLast());
      System.out.println(strDeck2);
      // strDeck2.addLast("the 707 i");
      // System.out.println(strDeck2.getFirst());
      // System.out.println(strDeck2.getLast());
      strDeck2.addFirst("the 707 i");
      System.out.println(strDeck2);
      System.out.println();

      System.out.println(strDeck.getFirst());
      System.out.println(strDeck.getLast());
      System.out.println(strDeck2.getLast());
      System.out.println(strDeck2.getFirst());

    }
    catch(NullPointerException ne) {
      System.out.println(ne.getMessage());
      System.out.println(ne);
    }
    catch(NoSuchElementException e) {
      System.out.println(e);
    }
  }

}
