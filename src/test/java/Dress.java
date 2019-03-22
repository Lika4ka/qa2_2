import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dress {
    private final String URL = "http://automationpractice.com";
    private final By Women = By.xpath(".//a[contains(@title,'Women')]");
    private final By Dresses = By.xpath(".//a[contains(@title,'Dresses')]");
    private final By EveningDresses = By.xpath(".//a[contains(@title,'Evening Dresses')]");
    private final By AddToCart = By.xpath(".//a[contains(@title,'Add to cart')]");
    private final By CheckOut = By.xpath(".//a[contains(@title,'Check out')]");
    private final By DressPrice1 = By.xpath(".//span[@itemprop='price']");
    private final By DressPrice2 = By.xpath("");



    private WebDriver driver;

    @Test
    public void titleCheck() {
        //Define driver path
        System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");

        //Open browser
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        //Open home page
        driver.get(URL);

        //Find Women
        WebElement titleWomen = driver.findElement(Women);

        //Find Dresses
        WebElement titleDresses = driver.findElement(Dresses);

        //Find Evening Dresses
        WebElement titleEveningDresses = driver.findElement(EveningDresses);

        //Find dress price1
        WebElement titleDressPrice1 = driver.findElement(DressPrice1);

        //Find Add to Cart
        WebElement titleAddToCart = driver.findElement(AddToCart);

        //Find Cart
        WebElement titleCheckOut = driver.findElement(CheckOut);

        //Find DressPrice 2 ( in cart)
        WebElement titleDressPrice2 = driver.findElement(DressPrice2);

        //Check title
        Assertions.assertEquals(titleDressPrice1, titleDressPrice2, "");


    }
}

