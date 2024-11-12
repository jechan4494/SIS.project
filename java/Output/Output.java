package Output;

public class Output {
  public static void main(String[] args){
    Output output = new Output();
    output.go();
  }
  void go(){
    int value = 7;
    for(int i=0; i<8; i++){
      value++;
      if(i>4) System.out.printf(++value + " ");
      if(value>14){
        System.out.printf("i = "+i);
        break;
      }
    }
  }
}
