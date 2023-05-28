package GoalNumOneLviv.Selenide;

import com.codeborne.selenide.Configuration;
import org.junit.Test;

public class AppleTest extends BaseTestTwo {

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";



    @Test
    public void checkHref(){
//        MainPage mainPage = new MainPage(BASE_URL);
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.search(SEARCH_STRING);
    }

}
