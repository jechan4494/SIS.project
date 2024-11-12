package Codw;

public class Cow {
  int size;
  int name;

  void bark(){
    if(size>80){
      System.out.println("moo moo");
    }
    else if (size >70){
      System.out.println("map map");
    }
    else if (size>60){
      System.out.println("yasi gasi");
    }
    else {
      System.out.println("aho siva");
    }
  }
}
