package Dog;

public class DogTestDrive {
  public static void main(String[] args) {
    Dog one = new Dog();
    one.size = 70;
    Dog two = new Dog();
    two.size = 80;
    Dog three = new Dog();
    three.size = 90;
    one.bark();
    two.bark();
    three.bark();
  }
}
