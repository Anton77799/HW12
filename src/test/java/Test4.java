import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import java.util.concurrent.TimeUnit;

public class Test4 {

    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiI2s_P7ufyAhVg_7sIHa1NCFcQPAgI");
        driver.manage().window().setSize(new Dimension(1800, 1040));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.name("q")).sendKeys("Кошка");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".g:nth-child(1) > div:nth-child(2) .LC20lb")).click();
        driver.findElement(By.id("searchInput")).click();
        driver.findElement(By.id("searchInput")).sendKeys("Чумазый");
        driver.findElement(By.id("searchInput")).sendKeys(Keys.ENTER);
        driver.findElement(By.linkText("Чумазый")).click();
        driver.findElement(By.cssSelector(".mw-wiki-logo")).click();
        Assertions.assertEquals(driver.findElement(By.id("Добро_пожаловать_в_Википедию,")).getText(),("Добро пожаловать в Википедию,"));
        driver.close();
    }
}
