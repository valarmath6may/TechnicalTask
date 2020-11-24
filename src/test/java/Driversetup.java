import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driversetup
{
    public static void main (String arg[])
        {
            WebDriver driver;
           // System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.navigate().to("https://www.bbc.co.uk/iplayer/live/bbcnews");
            driver.findElement(By.id("inputEmail"));
            driver.findElement(By.name("email"));
            driver.findElement(By.linkText("Forgot password?"));
            driver.findElement(By.partialLinkText("in"));
            driver.findElement(By.className("unique"));
//**classname
          //  driver.get("https://beautyworksonline.com/?gclid=CjwKCAiAqJn9BRB0EiwAJ1SztUa2WHPT-YlrCenxFet88tmTAh-mDeYd7T7i0n4yzFhMZVUvF9M2dxoCcOkQAvD_BwE");
            driver.manage().window().maximize();
           //driver.close();
           // driver.quit();
        }
}
