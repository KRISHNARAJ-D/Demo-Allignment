import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main(String[] args) throws InterruptedException {

        // Launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Open website
        driver.get("https://saucedemo.com");

        // Enter username
        driver.findElement(By.id("username")).sendKeys("standard_user");

        // Enter password
        driver.findElement(By.id("password")).sendKeys("secret_sauce");

        // Click login button
        driver.findElement(By.id("loginBtn")).click();

        Thread.sleep(3000);

        // Verify login success
        String currentUrl = driver.getCurrentUrl();

        if(currentUrl.contains("dashboard"))
        {
            System.out.println("Login Successful");
        }
        else
        {
            System.out.println("Login Failed");
        }

        // Close browser
        driver.quit();
    }
}