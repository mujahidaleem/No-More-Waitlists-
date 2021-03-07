package edureka;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class HandlingAllControls {
static WebDriver driver;
@Test( priority = 0)
public void EdurekaProfile() throws InterruptedException{
System.setProperty("webdriver.chrome.driver","C:\\Selenium-java-enrollment\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//Launch the Edureka Website
driver.get("https://www.acorn.utoronto.ca/");
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
driver.findElement(By.linkText("Login to ACORN")).click();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
Actions actions = new Actions(driver);
actions.moveToElement(driver.findElement(By.id("j_username")));
Thread.sleep(2000);
actions.click();
actions.sendKeys("TESTEMAIL@ETC.COM");
Thread.sleep(2000);
actions.build().perform();
actions.moveToElement(driver.findElement(By.id("j_password")));
Thread.sleep(2000);
actions.click();
actions.sendKeys("RandomPassword");
Thread.sleep(2000);
actions.build().perform();
Thread.sleep(5000);
driver.findElement(By.linkText("Enrol & Manage")).click();
Thread.sleep(2000);
actions.moveToElement(driver.findElement(By.xpath("//button[@class='btn btn-primary btn-padded']")));
Thread.sleep(2000);
actions.click();
actions.build().perform();
driver.findElement(By.linkText("Search in this session by course code or title")).click();
Thread.sleep(1000);
actions.sendKeys("COURSENUMBER");
Thread.sleep(2000);
actions.build.perform();
} 
catch (InterruptedException e) {
e.printStackTrace();
}
}
}