// import java.util.*;

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

    return -1;
  }
}
