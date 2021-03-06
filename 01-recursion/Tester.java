public class Tester{
  public static void demoReverse(String s){
    System.out.println("INPUT:  "+s);
    System.out.println("OUTPUT: "+Recursion.reverse(s));
    System.out.println();
  }

  public static void demoCount(int l){
    System.out.println("INPUT:  "+l);
    System.out.println("OUTPUT: "+Recursion.countNoDoubleLetterWords(l,""));
    System.out.println();
  }

  public static void demoPercentDiff(double a, double b){
    System.out.println("INPUT:  "+a+", "+b);
    System.out.println("OUTPUT: "+Recursion.percentDiff(a,b));
    System.out.println();
  }

  public static void demoSqrt(double n){
    System.out.println("INPUT:  "+n);
    System.out.println("OUTPUT: "+Recursion.sqrt(n));
    System.out.println("ACTUAL: "+Math.sqrt(n));
    System.out.println();
  }

  public static void main(String[]args){
    System.out.println("---TESTING reverse---");
    demoReverse("");
    demoReverse("a");
    demoReverse("ab");
    demoReverse("dog123");
    demoReverse("racecar");

    System.out.println("---TESTING countNoDoubleLetterWords---");
    demoCount(0);
    demoCount(1);
    demoCount(2);
    demoCount(3);

    System.out.println("---TESTING percentDiff---");
    demoPercentDiff(0,0);
    demoPercentDiff(1,0);
    demoPercentDiff(0,1);
    demoPercentDiff(2,0);
    demoPercentDiff(1,1);
    demoPercentDiff(1,1.1);
    demoPercentDiff(1.00001,1);

    System.out.println("---TESTING sqrt---");
    demoSqrt(0);
    demoSqrt(1);
    demoSqrt(2);
    demoSqrt(4);
    demoSqrt(25);
    demoSqrt(Math.PI);
    demoSqrt(Math.pow(Math.PI,2));
  }

}
