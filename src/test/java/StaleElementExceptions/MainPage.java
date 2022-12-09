package StaleElementExceptions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import org.openqa.selenium.StaleElementReferenceException;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage extends BaseTest {

    ElementsCollection buttons = $$x(".//a[contains(@class,'button')]");

    private boolean invisible(SelenideElement element) {
        try {
            return element.isDisplayed();

        } catch (StaleElementReferenceException nf) {
            return false;
        }
    }

    private void method() {
        for (int i = 0; i < buttons.size(); i++) {
            buttons.get(i).click();
        }

    }

    private void method2() {
        int index = 0;
        for (SelenideElement i : buttons) {
            buttons.get(index).click();
            index++;
        }
    }

    @Test
    public void checkButton() {
        Selenide.open("https://the-internet.herokuapp.com/challenging_dom");
    SelenideElement element = $x("//h3");
    element.shouldBe(Condition.visible);
        for (SelenideElement i : buttons) {
            if (invisible(i)) {
                i.click();
            } else {
                System.out.println("ups");
            }
        }

    }

    @Test
    public void checkButton2() {
//        $("#id").shouldBe(visible, Duration.ofSeconds(30));
        Selenide.open("https://the-internet.herokuapp.com/challenging_dom");
        SelenideElement element = $x("//h3");
        element.shouldBe(Condition.visible);
        method();
// int i = 0;
// method2();
//        for (SelenideElement i: buttons){
//            i.click();
//        }


    }
}
