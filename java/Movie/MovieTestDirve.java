package Movie;

public class MovieTestDirve{
  public static void main(String[] args) {
    MOVIE one = new MOVIE();
    one.title = "Gone with the Stock";
    one.genre = "Tragic";
    one.rating = -2;
    MOVIE two = new MOVIE();
    two.title = "Lost in cubicle Space";
    two.genre = "Comedy";
    two.rating = 5;
    two.playIt();
    MOVIE three = new MOVIE();
    three.title = "Byre Club";
    three.genre = "Tragic but ultimately uplifting";
    three.rating = 127;
  }
}
