public class Driver{

  public static void printBoard(QueenBoard x){
    System.out.println(x);
  }

  public static void main(String[]args){
    try{
      QueenBoard b0=new QueenBoard(0);
      QueenBoard b1=new QueenBoard(1);
      QueenBoard b2=new QueenBoard(2);
      QueenBoard b3=new QueenBoard(3);
      QueenBoard b4=new QueenBoard(4);
      QueenBoard b5=new QueenBoard(5);
      QueenBoard b6=new QueenBoard(6);
      QueenBoard b8=new QueenBoard(8);
      QueenBoard bx=new QueenBoard(12);

      System.out.println(b0.countSolutions());
      b0.solve();
      printBoard(b0);

      System.out.println(b1.countSolutions());
      b1.solve();
      printBoard(b1);

      System.out.println(b2.countSolutions());
      b2.solve();
      printBoard(b2);

      System.out.println(b3.countSolutions());
      b3.solve();
      printBoard(b3);

      System.out.println(b4.countSolutions());
      b4.solve();
      printBoard(b4);

      System.out.println(b5.countSolutions());
      b5.solve();
      printBoard(b5);

      System.out.println(b6.countSolutions());
      b6.solve();
      printBoard(b6);

      System.out.println(b8.countSolutions());
      b8.solve();
      printBoard(b8);

      System.out.println(bx.countSolutions());
      bx.solve();
      printBoard(bx);

    }
    catch (IllegalStateException e){
      System.out.println("Cannot solve non-empty board");
    }

  }

}
