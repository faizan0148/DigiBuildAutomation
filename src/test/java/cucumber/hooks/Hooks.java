package cucumber.hooks;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import webdriver.WebDriverContext;

public class Hooks {
    public static String getInstanceId;
    public static String dateTime;

    @After("@endtoendautomation")
    public void afterScenariosWrapper() {
        afterScenario();
    }
    
    @Before("@endtoendautomation")
    public void BeforeScenariosWrapper() {
        beforeScenario();
    }

   public void beforeScenario() {
    WebDriver driver = WebDriverContext.getInstance().getWebDriver();
    driver.manage().window().maximize();

   }
   
    public void afterScenario(){
        WebDriverContext.getInstance().cleanUp();
    }
}
