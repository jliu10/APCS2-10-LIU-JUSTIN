import java.util.*;

public class Calculator {

  /*Evaluate a postfix expression stored in s.
  *Assume valid postfix notation, of ints doubles and operators separated by spaces.
  *Valid operators are + - / * and % (remainder not modulo)
  *All results are doubles even if the operands are both int.
  *@throws IllegalArgumentException when there are too many or too few operands.
  *        Use the string parameter of your exception to indicate what happened.
  */
  public static double eval(String s) {
    if(s.length() == 0) throw new IllegalArgumentException("input is empty");

    // converting String to list (token)
    String[] tokens = s.split(" ");
    // System.out.println(tokens[0]+" "+tokens[1]);
    String ops = "+-/*%";
    int operators = 0;
    for(String t : tokens) if(ops.contains(t)) operators++;
    int operands = tokens.length - operators;
    // System.out.println("operators: "+operators);
    // System.out.println("operands: "+operands);

    if(operands - operators > 1) throw new IllegalArgumentException("too many operands");
    if(operands - operators < 1) throw new IllegalArgumentException("too few operands");

    // using ArrayDeque to represent stack
    ArrayDeque<Double> stack = new ArrayDeque<Double>();

    for(String t : tokens) {
      if(t.equals("+")) {
        stack.addLast(stack.removeLast() + stack.removeLast());
      }
      else if(t.equals("-")) {
        double p1 = stack.removeLast();
        double p2 = stack.removeLast();
        stack.addLast(p2 - p1);
      }
      else if(t.equals("/")) {
        double p1 = stack.removeLast();
        double p2 = stack.removeLast();
        stack.addLast(p2 / p1);
      }
      else if(t.equals("*")) {
        stack.addLast(stack.removeLast() * stack.removeLast());
      }
      else if(t.equals("%")) {
        double p1 = stack.removeLast();
        double p2 = stack.removeLast();
        stack.addLast(p2 % p1);
      }
      else stack.addLast(Double.parseDouble(t));
    }

    // consider throwing exceptions during parsing the list, to save time
    // if parsed whole list, and stack has > 1 element, too many operands
    // if stack has 0 elements any time after beginning, too few operands
    return stack.getLast();
  }
}
