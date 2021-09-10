import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;

public class Test1
{
    public static void main(String[] args) {
        System.setProperty(
                "webdriver.chrome.driver", "src/main/resources/chromedriver.exe"
        );
        WebDriver driver = new ChromeDriver();
        driver.get("https://diary.ru/");
        driver.manage().window().setSize(new Dimension(1800, 1040));
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        Assertions.assertEquals(driver.findElement(By.cssSelector(".new-user > p")).getText(), ("Придумайте логин и присоединяйтесь:"));
        driver.findElement(By.linkText("Регистрация")).click();
        {
            WebElement element = driver.findElement(By.linkText("Регистрация"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element).perform();
        }
        {
            WebElement element = driver.findElement(By.tagName("body"));
            Actions builder = new Actions(driver);
            builder.moveToElement(element, 0, 0).perform();
        }
        Assertions.assertEquals(driver.findElement(By.cssSelector(".grey:nth-child(2)")).getText(), ("Пожалуйста заполните поля для регистрации:"));
        driver.findElement(By.id("signupform-username")).click();
        driver.findElement(By.id("signupform-username")).sendKeys("Charamsswesd");
        driver.findElement(By.id("signupform-email")).click();
        driver.findElement(By.id("signupform-email")).sendKeys("jjjjjs@mail.ppspaape");
        driver.findElement(By.id("chk_box_user_confirm")).click();
        driver.findElement(By.id("signup_btn")).click();
        driver.findElement(By.id("newblogform-title")).click();
        driver.findElement(By.id("newblogform-title")).sendKeys("tututucha");
        driver.findElement(By.name("new-blogs-button")).click();
    }
}
