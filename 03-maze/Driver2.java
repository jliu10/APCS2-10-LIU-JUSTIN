public class Driver2{

  public static void main(String[] args){
    // syntax: java Driver2 <numRows> <numCols> <startRow> <startCol>
    int r=0;
    int c=0;
    int sr=1;
    int sc=1;
    if(args.length==0){
      r=10;
      c=20;
    }
    if(args.length>=1){
      r=Integer.parseInt(args[0]);
      c=r;
    }
    if(args.length>=2){
      c=Integer.parseInt(args[1]);
    }
    if(args.length==4){
      sr=Integer.parseInt(args[2]);
      sc=Integer.parseInt(args[3]);
    }

    MazeGenerator p=new MazeGenerator(r,c);
    // System.out.println(p);
    p.setAnimate(false);//comment this if you are using windows cmd/powershell
    if(p.getAnimate()){
      MazeGenerator.clearTerminal();
      p.generate(sr,sr);
      System.out.println();
    } else MazeGenerator.generate(p.getMaze(),0,0,sr,sc);

    System.out.println(p);

  }

}
