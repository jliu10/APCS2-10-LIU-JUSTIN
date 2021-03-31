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

    // using ArrayDeque to represent stack
    ArrayDeque<Double> stack = new ArrayDeque<Double>();
    String ops = "+-*/%";

    for(int i = 0; i < tokens.length; i++) {
      if(stack.size() < 1 && i > 0) throw new IllegalArgumentException("too few operands");
      if(stack.size() == 1 && ops.contains(tokens[i])) throw new IllegalArgumentException("too few operands");

      if(tokens[i].equals("+")) {
        stack.addLast(stack.removeLast() + stack.removeLast());
      }
      else if(tokens[i].equals("-")) {
        double p1 = stack.removeLast();
        double p2 = stack.removeLast();
        stack.addLast(p2 - p1);
      }
      else if(tokens[i].equals("*")) {
        stack.addLast(stack.removeLast() * stack.removeLast());
      }
      else if(tokens[i].equals("/")) {
        double p1 = stack.removeLast();
        double p2 = stack.removeLast();
        stack.addLast(p2 / p1);
      }
      else if(tokens[i].equals("%")) {
        double p1 = stack.removeLast();
        double p2 = stack.removeLast();
        stack.addLast(p2 % p1);
      }
      else stack.addLast(Double.parseDouble(tokens[i]));
    }

    if(stack.size() > 1) throw new IllegalArgumentException("too many operands");

    return stack.getLast();
  }
}
