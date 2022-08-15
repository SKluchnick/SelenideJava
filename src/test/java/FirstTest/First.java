package FirstTest;

import com.codeborne.selenide.Condition;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class First {


    @Test
    public void test(){
        open("https://google.com/");
        $x("//input[@name='q']").setValue("CromeDriver").pressEnter();
        $x("//div[@id='result-stats']").shouldBe(Condition.visible);
    }

}
