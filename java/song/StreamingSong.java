package song;

public class StreamingSong {
  String title;
  String artist;
  String duration;

  void play(){
    System.out.println("Playing song");
  }

  void printDetails(){
    System.out.println("Title: " + title+"by"+artist);
  }
}

class StreamingSongTestDrive{
  public static void main(String[]args){

    StreamingSong song = new StreamingSong();

    song.artist = "the Beatles";
    song.title = "Come Together";
    song.play();
    song.printDetails();
  }
}
