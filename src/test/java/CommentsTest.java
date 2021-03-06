import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommentsTest {
    private final String URL = "http://delfi.lv";
    private final By TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");
    private final By ARTICLE_PAGE_TITLE = By.xpath(".//h1[contains(@class, 'd-inline')]");
    private final By COMMENT_COUNT = By.xpath(".//a[contains(@class, 'text-red-ribbon')]");
    private final By COMMENT_PAGE_TITLE = By.xpath(".//h1[@class = 'article-title']/a");

    @Test
    public void commentsNumberCheck (){
//Set driver path
        System.setProperty("webdriver.chrome.driver", "C:/Users/anrom/Desktop/Downloads/chromedriver.exe");

        //Open Browser
        WebDriver driver = new ChromeDriver();

        //Full screen
        driver.manage().window().maximize();

        //Open Home Page
        driver.get(URL);
//Find first article title
//        WebElement homePageTitle = driver.findElement(TITLE);

        //Save to String
        String homePageTitle = driver.findElement(TITLE).getText();

        //Click on article
        driver.findElement(TITLE).click();

        //Find Title
        WebElement articlePageTitle = driver.findElement(ARTICLE_PAGE_TITLE);

        //Save to string
        String articlePageTitleTxt = articlePageTitle.getText();

        //Check article title
        Assertions.assertEquals(homePageTitle, articlePageTitleTxt, "Wrong article page title!");

        //Find comment count
        WebElement commentCount = driver.findElement(COMMENT_COUNT);

    }
}

