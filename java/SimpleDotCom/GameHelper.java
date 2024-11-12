package SimpleDotCom;
import java.util.Scanner;
import java.util.ArrayList;

public class GameHelper{
  private static Scanner sc = new Scanner(System.in);
  private static final String alphabet = "abcdefg";
  private final int gridLength = 7;

  private int gridSize = 49;
  private final int[]grid = new int[gridLength];
  private int comCount = 0;
  public int getUserInput(String prompt){
    System.out.print(prompt+" : ");
    return sc.nextInt();

  }

}
