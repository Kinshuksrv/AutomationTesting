package AutomationPractise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPlayAround {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Kinshuk\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//form[@autocomplete='on']/div[1]/input")).sendKeys("kinshuksrv@gmail.com");
        driver.findElement(By.xpath("//form[@autocomplete='on']/div[2]/input")).sendKeys("password123@ST");
        driver.findElement(By.xpath("//form[@autocomplete='on']/div[3]/button")).click();
        System.out.println(driver.getTitle());
        driver.close();
    }

}
