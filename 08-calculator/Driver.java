public class Driver {

  public static void testEval(String s) {
    System.out.println(s);
    System.out.println("\t= "+Calculator.eval(s));
    System.out.println();
  }

  public static void main(String[] args) {

    try {
      testEval("11 3 - 4 + 2.5 *");
      // testEval("");
      // testEval("11 3 - 4 + 2.5 * *");
      // testEval("11 3 - 4 2.5 *");

    } catch(IllegalArgumentException e) {
      System.out.println(e);
    }

  }

}
