package WorkUa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$x;

public class WorkResumePage {
    private final SelenideElement gender = $x("//h1[@class='add-top-xs']");
    private final SelenideElement date = $x("//span[@class='text-muted add-right-xs']");
    private final SelenideElement city = $x("//dl[@class='dl-horizontal']/dd[3]");
    private final SelenideElement liveNativePlace = $x("//dl[@class='dl-horizontal']/dd[4]");
    private final SelenideElement tick = $x("//span[@class='glyphicon glyphicon-confirmed text-success']");

    public static String Gender = "пол";
    public static String Date = "значение";
    public static String City = "город";
    public static String LiveNativePlace = "значение2";
    public static String Tick = "значение3";

    public WorkResumePage(String url) {
        Selenide.open(url);
    }

    public Map  <String, Object> getAttributes(){
        Map <String, Object> attr = new HashMap<>();
        attr.put(Gender, getGender());
        attr.put(Date, getDate());
        attr.put(City, getSity());
        attr.put(LiveNativePlace, isReadyToRemout());
        attr.put(Tick, isTick());
        return attr;
    }

    public boolean isTick(){
      return tick.isDisplayed();
    }

    public boolean isReadyToRemout2(){
        String  res = liveNativePlace.getText();
        String [] array = res.split(",");
        if(array[0].equals("Дистанційно")){
            return true;
        }
       return false;

    }

    public boolean isReadyToRemout(){
        return liveNativePlace.getText().split(",")[0].equals("Дистанційно");
       }

      public String getSity(){
        return city.getText();
    }

    public int getDate(){
      return Integer.parseInt(date.getText().replaceAll("[^0-9]",""));
    }

    public String getGender (){
        String genderValue = gender.getText();
        if (genderValue.equals("Виталик")){
                return "m";
        }
        return "w";
    }
    public String getGenderHard(){
        return gender.getText().equals("Виталик")?"m":"w";
    }
}
