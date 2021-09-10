import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
    public static void main(String[] args) {

        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiI2s_P7ufyAhVg_7sIHa1NCFcQPAgI");
        driver.manage().window().setSize(new Dimension(1800, 1040));
        driver.findElement(By.name("q")).sendKeys("Енот");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".g:nth-child(1) > div:nth-child(2) .LC20lb")).click();
        Assertions.assertEquals(driver.findElement(By.id("firstHeading")).getText(), ("Еноты"));
    }
}
