package WorkUa;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static com.codeborne.selenide.Selenide.$x;

public class WorkResumePage {
    private final SelenideElement gender = $x("//h1[@class='add-top-xs']/text()");
    private final SelenideElement date = $x("//span[@class='text-muted add-right-xs']/text()");
    private final SelenideElement city = $x("//dl[@class='dl-horizontal']/dd[3]/text()");
    private final SelenideElement liveNativePlace = $x("//dl[@class='dl-horizontal']/dd[4]");

    public WorkResumePage(String url) {
        Selenide.open(url);
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
        if (genderValue == "Виталик"){
                return "m";
        }
        return "w";
    }
    public String getGenderHard(){
        return gender.getText().equals("Виталик")?"m":"w";
    }
}
