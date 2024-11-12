package GuessGame;

public class GuessGame {
  Player p1;
  Player p2;
  Player p3;

  int count;

  public GuessGame(int count){
    this.count = count;
  }

  public void StartGame() {
    p1 = new Player();
    p2 = new Player();
    p3 = new Player();

    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;
    int x = 0;

    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    p1.guess(1);
    p2.guess(2);
    p3.guess(3);

    guessp1 = p1.getGuessNumber();
    guessp2 = p2.getGuessNumber();
    guessp3 = p3.getGuessNumber();

    int targetNumber = (int) (Math.random() * 10);
    System.out.println("0이상 9이하의 숫자를 맞춰보세요.");

    while (x < count) {
      System.out.println("맞춰야 할 수는 " + targetNumber + "입니다");


      if (guessp1 == targetNumber) {
        p1isRight = true;
      }
      if (guessp2 == targetNumber) {
        p2isRight = true;
      }
      if (guessp3 == targetNumber) {
        p3isRight = true;
      }
      if (p1isRight || p2isRight || p3isRight) {
        System.out.println("맞힌 선수가 있습니다.");
        System.out.println("1번 선수 " + p1isRight);
        System.out.println("2번 선수 " + p2isRight);
        System.out.println("3번 선수 " + p3isRight);
        System.out.println("게임 끝.");
        break;
      } else {
        System.out.print("다시 시도해야합니다.");
      }
      x++;
    }
  }
    public int getCount(){
      return count;
    }
    }
