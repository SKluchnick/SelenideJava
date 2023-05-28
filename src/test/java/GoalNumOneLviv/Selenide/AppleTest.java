package GoalNumOneLviv.Selenide;

import com.codeborne.selenide.Configuration;
import org.junit.Assert;
import org.junit.Test;

public class AppleTest extends BaseTestTwo {

    private final static String BASE_URL = "https://appleinsider.ru/";
    private final static String SEARCH_STRING = "Чем iPhone 13 отличается от iPhone 12";
    private final static String EXPECTED_WORD = "iphone-13";


    @Test
    public void checkHref() {
//        MainPage mainPage = new MainPage(BASE_URL);
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        mainPage.search(SEARCH_STRING);
        SearchPage searchPage = new SearchPage();
        String href = searchPage.getHrefFromFirstArticle();
        boolean FlagTrue = href.contains("iphone-13");
        Assert.assertTrue(FlagTrue);
        Assert.assertTrue(href.contains("iphone-13"));
    }

    @Test
    public void checkHref2() {
//        MainPage mainPage = new MainPage(BASE_URL);
        MainPage mainPage = new MainPage();
        mainPage.openWebSite(BASE_URL);
        /**
         * Записываем в String так как последний метод getHrefFromFirstArticle()
         * возвращает String
         */
         String href = mainPage.search(SEARCH_STRING).getHrefFromFirstArticle();
         Assert.assertTrue(href.contains("iphone-13"));
    }

    @Test
    public void checkHref3() {
     Assert.assertTrue(new MainPage(BASE_URL)
             .search(SEARCH_STRING)
             .getHrefFromFirstArticle().contains(EXPECTED_WORD));

    }
    }
