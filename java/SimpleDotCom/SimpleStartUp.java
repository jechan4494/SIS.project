package SimpleDotCom;
import java.util.ArrayList;

public class SimpleStartUp {
  private ArrayList<String> locationCellss;

  public void setLocationCells(ArrayList<String> loc) {
    locationCellss = loc;
  }

  public String checkYourself(String userInput) {
    String result = "miss";
    int index = locationCellss.indexOf(userInput);

    if(index>=0){
      locationCellss.remove(index);
      if(locationCellss.isEmpty()){
        result = "kill";
      }else{
        result = "hit";
      }
    }
    return result;
  }
}
