package SimpleDotCom;

public class SimpleStartUPGame {
  int numOfGuesses = 0; // 추측 횟수
  GameHelper helper = new GameHelper(); // 사용자 입력을 받는 도우미 클래스

  public void startGame() {
    int resultnum = (int) (Math.random() * 5); // 랜덤으로 0부터 4까지의 숫자를 생성

    // SimpleStartUp 객체 생성 및 위치 설정
    SimpleStartUp start = new SimpleStartUp();
    int[] location = {resultnum, resultnum + 1, resultnum + 2}; // 위치 배열 설정

    boolean isAlive = true; // 게임 진행 여부

    // 게임 루프
    while (isAlive) {
      int guess = helper.getUserInput("Enter a number"); // 사용자 입력 받기
      String result = start.checkYourself(String.valueOf(guess)); // 결과 확인
      numOfGuesses++; // 추측 횟수 증가

      if (result.equals("kill")) { // "kill"이면 게임 종료
        isAlive = false;
        System.out.println("You took " + numOfGuesses + " guesses");
      }
    }
  }
}
