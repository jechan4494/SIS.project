package Episode;

class Episode{
  int seriesNumber;
  int episodeNumber;

  void skipIntro(){
    System.out.println("Skipping intro");
  }

  void skipToNext(){
    System.out.println("loading next episode");
  }

  void play(){
    System.out.println("playing episode" + episodeNumber);
  }
}

public class EpisodeTestDrive {
  public static void main(String[] args) {

    Episode episode = new Episode();
    episode.seriesNumber = 4;
    episode.play();
    episode.skipIntro();
  }
}
