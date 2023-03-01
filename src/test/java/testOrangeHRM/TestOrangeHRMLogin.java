package testOrangeHRM;

import base.Baseclass;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestOrangeHRMLogin {

    WebDriver driver;
    Baseclass loginSteps;


    @Test()
    public void launchApplication() {
        try
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            Thread.sleep(3000);
            //Login to OrangeHRM Application
            loginSteps = new Baseclass(driver);
            loginSteps.loginApplication();
        }

        catch(Exception e)
        {
            System.out.println("Exceptions occured :" + e.getMessage());
        }

    }
}
