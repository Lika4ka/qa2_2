import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delfi1 {
   @Test
   public void delfiFirstTitleTest ()  {
       System.setProperty("webdriver.chrome.driver", "C:/Users/anrom/Desktop/Downloads/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://delfi.lv");

   }
}
