public class Xcopy2 {
  public static void main(String[] args){

    int orig = 45;
    Xcopy2 x = new Xcopy2();
    int y = x.go(orig);
    System.out.println(orig + " "+y);
  }
  int go(int arg){
    arg = arg * 2;
    return arg;
  }
}
