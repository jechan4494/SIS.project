package Dog;

public class Dog {
  int size;
  String name;

  void bark(){
    if(size >80){
      System.out.println("Woof! Woof!");
    }
    else if(size >70){
      System.out.println("Yip! Yip!");
    }
    else{
      System.out.println("Ruff! Ruff!");
    }
  }
}
