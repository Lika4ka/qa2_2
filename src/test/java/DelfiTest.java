import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DelfiTest {
    private String  titleToCompare = "KHL spēle: Rīgas 'Dinamo' - 'Severstaļ'. Teksta tiešraide ";
    private final By TITLE = By.xpath(".//h1[contains(@class, 'headline__title')]");

    @Test
    public void newDelfiTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/anrom/Desktop/Downloads/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://delfi.lv");

        WebElement firstTitle = driver.findElement(TITLE);
        String titleText = firstTitle.getText();

        Assertions.assertEquals(titleToCompare, titleText, "Titles are not equal!");
    }
}