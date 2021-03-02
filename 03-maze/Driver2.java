public class Driver2{

  public static void main(String[] args){
    int r=0;
    int c=0;
    if(args.length==0){
      r=10;
      c=20;
    }
    if(args.length==1){
      r=Integer.parseInt(args[0]);
      c=r;
    }
    if(args.length==2){
      r=Integer.parseInt(args[0]);
      c=Integer.parseInt(args[1]);
    }

    MazeGenerator p=new MazeGenerator(r,c);
    System.out.println(p);
    generate(p.getMaze());
    System.out.println(p);
  }

}
