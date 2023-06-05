import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/home/ib-developer/Desktop/chromedriver_linux64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.flipkart.com");
        String title = driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}