
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

    public MainPage(String url) {
        Selenide.open(url);
    }
    public MainPage() {

    }


    /**
     *Cтавим значение в value и нажимаем Enter
     * @param searchString поисковая строка
     * логика метода переход на следующую страницу searchPage
     *  поэтому делаем возврат класса с метода
     */
    public SearchPage search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
        return new SearchPage();
    }

    public SearchPage openWebSite(String url){
        Selenide.open(url);
        return new  SearchPage();
    }
}
