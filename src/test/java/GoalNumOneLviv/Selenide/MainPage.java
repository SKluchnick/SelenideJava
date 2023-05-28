
package GoalNumOneLviv.Selenide;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;
import static com.codeborne.selenide.Selenide.$x;

import com.codeborne.selenide.SelenideElement;

/**
 * Главная страница сайта
 */

public class MainPage {

    private final SelenideElement textBoxInput = $x("//input[@type='text']");

//    public MainPage(String url) {
//        Selenide.open(url);
//    }


    /**
     *Cтавим значение в value и нажимаем Enter
     * @param searchString поисковая строка
     */
    public void search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);

    }

    public void openWebSite(String url){
        Selenide.open(url);
    }
}
