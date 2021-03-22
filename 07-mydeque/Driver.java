import java.util.*;

public class Driver {

  public static void main(String[] args) {
    MyDeque<Integer> intDeck = new MyDeque<Integer>(0);
    MyDeque<String> strDeck = new MyDeque<String>();

    try {
      System.out.println(intDeck);
      System.out.println(intDeck.size());
      System.out.println();
      System.out.println(strDeck);
      System.out.println(strDeck.size());
      System.out.println();
    }
    catch(NullPointerException ne) {
    }
    catch(NoSuchElementException e) {
    }
  }

}
