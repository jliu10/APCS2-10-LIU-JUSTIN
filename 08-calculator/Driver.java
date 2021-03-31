public class Driver {

  public static void testEval(String s) {
    System.out.println(s);
    System.out.println("\t= "+Calculator.eval(s));
    System.out.println();
  }

  public static void main(String[] args) {

    try {
      testEval("1 1 1 2 + + +");
      // testEval("");
      // testEval("11 3 - 4 + 2.5 * *");
      // testEval("11 3 - 4 2.5 *");
      // testEval("+ 1 +");
      testEval("3 2 -");
      testEval("11 3 - 4 + 2.5 *");
      testEval("10 2.0 +");
      testEval("8 2 + 99 9 - * 2 + 9 -");
      testEval("1 2 3 4 5 + * - -");
      testEval("5 9 + 2 * 6 5 * +");
      testEval("1 2 /");
      testEval("4 5 7 2 + - *");
      testEval("3 4 + 2 * 7 /");
      testEval("1 2 %");
      testEval("2 1 %");

    } catch(IllegalArgumentException e) {
      System.out.println(e);
    }

  }

}
