package resource.page_objects;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import resource.utils.Env;
import resource.utils.locators;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;
import static resource.utils.RunTest.driver;


public class ui_test_pageobject {
    static WebDriverWait wait;

    public static WebDriver driver = new ChromeDriver();

    public static boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        }
        catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


    public static void navigating_home_page(){
        driver.navigate().to(Env.test_page);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        String newBaseURL = Env.test_page;
        String currentURL = driver.getCurrentUrl();
        try{
            Assert.assertEquals(newBaseURL, currentURL);
        }
        catch(Exception e){
            driver.get(newBaseURL);
        }
    }


    public static void clicking_remove_checkbox()  {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement element = driver.findElement(By.xpath(locators.remove_button));
        element.click();
    }

    public static void check_for_checkbox(){
        WebElement element = driver.findElement(By.id(locators.checkbox));
        element.isDisplayed();
    }



    public static void clicking_add(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locators.add_button)));
        element.click();
    }

    public static void check_for_added_message(){
        WebElement element = driver.findElement(By.id(locators.message));
        Assert.assertEquals(locators.added_message, element.getText());
    }

    public static void check_for_remove_message(){
        WebElement element = driver.findElement(By.id(locators.message));
        Assert.assertEquals(locators.remove_message, element.getText() );

    }

    public static void click_enable_button(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locators.enable_button)));
        element.click();
//        WebElement element = driver.findElement(By.xpath(locators.enable_button));
//        element.click();
    }

    public static void check_enable_button_state(){
        WebElement element = driver.findElement(By.xpath(locators.enable_button));
        String text = element.getText();
        String attr = element.getTagName();
//        System.out.println("text"+text);
//        System.out.println("attr"+attr);
        Assert.assertEquals(text, "Disable");
        element.isDisplayed();

    }

    public static void check_enable_default_button_state(){
        WebElement element = driver.findElement(By.xpath(locators.enable_button));
        String text = element.getText();
        Assert.assertEquals(text, "Enable");
        element.isDisplayed();

    }

    public static void check_remove_button_State(){
        WebElement element = driver.findElement(By.xpath(locators.remove_button));
        String element_text = element.getText();
        System.out.println(element_text);
        Assert.assertEquals(element_text, "Add");
    }

    public static void check_add_button_State(){
        WebElement element = driver.findElement(By.xpath(locators.remove_button));
        String element_text = element.getText();
        Assert.assertEquals(element_text, "Remove");
    }

    public static void check_for_enable_state_message(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locators.enable_button)));
        WebElement message = driver.findElement(By.id(locators.message));
        Assert.assertEquals(message.getText(), locators.enabled_text_message);
    }

    public static void check_for_disable_state_message(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        WebElement element =  wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locators.enable_button)));
        WebElement message = driver.findElement(By.id(locators.message));
        Assert.assertEquals(message.getText(), locators.disabled_text_message);
    }

}
