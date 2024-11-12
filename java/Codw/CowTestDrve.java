package Codw;
import java.util.Scanner;
public class CowTestDrve {
  public static void main(String[]args){
    Cow one = new Cow();
    Cow two = new Cow();
    Cow three = new Cow();
    Scanner sc = new Scanner(System.in);

    one.size = sc.nextInt();
    two.size = sc.nextInt();
    three.size = sc.nextInt();

    one.bark();
    two.bark();
    three.bark();
  }
}
