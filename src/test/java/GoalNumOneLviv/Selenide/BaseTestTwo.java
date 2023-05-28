package GoalNumOneLviv.Selenide;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;


abstract public class BaseTestTwo {

    public void setUp(){
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.browserSize = "1920x1080";
//        будем видеть браузер в тестах
        Configuration.headless = false;


    }

    /**
     * Выполнение метода перед каждым запуском тестов
     */
    @Before
    public void init(){
        setUp();

    }

    /**
     * Выполнение метода после каждого закрытия тестов
     */
    @After
       public void tearDown(){
        Configuration.holdBrowserOpen = true;
//        Selenide.closeWebDriver();
    }
}
