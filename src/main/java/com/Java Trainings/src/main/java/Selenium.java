import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mvnrepository.com/");
        String title = driver.getTitle();
        System.out.println("Browser title:" + title);
        driver.close();
        //driver.switchTo().frame();
        driver.switchTo().alert();









    }


}
