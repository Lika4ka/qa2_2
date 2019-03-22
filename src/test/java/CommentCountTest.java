import model.Article;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CommentCountTest {
    private final String URL = "http://rus.delfi.lv";

    private final By ARTICLE = By.tagName("article");
    private  final  By TITLE = By.tagName("h1");
    private final By COMMENTS_COUNTER = By.xpath(".//a[contains(@class ,'text-red')]");

    @Test
    public void commentCountCheck (){
        System.setProperty("webdriver.chrome.driver", "C:/Users/anrom/Desktop/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get(URL);

        List<WebElement> articles = driver.findElements(ARTICLE);
        Article article = getArticle(articles,5);


    }

    private Article getArticle(List<WebElement> elements, int i) {
        WebElement article = elements.get(i); // iz spiska vitaskivajev element

        Article currentArticle = new Article();
        currentArticle.setTitle(article.findElement(TITLE).getText());

        List<WebElement> commentsCounters = article.findElements(COMMENTS_COUNTER);

        if (commentsCounters.isEmpty()) {
            currentArticle.setCommentCount(0);
        } else {
            currentArticle.setCommentCount(commentsCounters.get(0).getText());

        }
        return currentArticle;
    }
}
