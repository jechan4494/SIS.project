package GuessGame;

import java.util.Scanner;

public class Player {
  int guessNumber = 0;
  Scanner sc = new Scanner(System.in);

  public void guess(int playerNumber) {
      System.out.println(playerNumber+"추측할 숫자를 입력하세요.");
      guessNumber = sc.nextInt();
    }

  public int getGuessNumber() {
    return guessNumber;
  }
}

