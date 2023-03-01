package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Baseclass {

    WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//input[@name='username']")
    public WebElement loginUserName;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement loginUserPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginSubmit;

    public Baseclass(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void loginApplication()
    {
        try
        {
            wait.until(ExpectedConditions.visibilityOf(loginUserName)).sendKeys("Admin");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOf(loginUserPassword)).sendKeys("admin123");
            Thread.sleep(2000);
            wait.until(ExpectedConditions.visibilityOf(loginSubmit)).click();
            Thread.sleep(3000);
        }

        catch (Exception e)
        {
            System.out.println("Exceptions occured :" + e.getMessage());
        }

    }
}
