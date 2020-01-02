package resource.page_objects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import resource.utils.Env;
import resource.utils.locators;

import static org.junit.Assert.assertTrue;
import static resource.utils.RunTest.driver;


public class ui_test_pageobject {

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
        WebElement element = driver.findElement(By.xpath(locators.remove_button));
        element.click();
    }

    public static void check_for_checkbox(){
        WebElement element = driver.findElement(By.id(locators.checkbox));
        element.isDisplayed();
    }



    public static void clicking_add(){
        WebElement element = driver.findElement(By.xpath(locators.remove_button));
        element.click();
    }

    public static void check_for_added_message(){
        WebElement element = driver.findElement(By.id(locators.added_message));
        element.isDisplayed();

    }

    public static void check_for_remove_message(){
        WebElement element = driver.findElement(By.id(locators.message));
        String text = element.getText();
        System.out.println(text);
        Assert.assertFalse(text.equals(locators.remove_message));

    }

    public static void click_enable_button(){
        WebElement element = driver.findElement(By.xpath(locators.enable_button));
        element.click();
    }

    public static void check_disable_button_state(){
        WebElement element = driver.findElement(By.xpath(locators.enable_button));
        String text = element.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Enable");
        element.isDisplayed();

    }

    public static void check_enable_button_state(){
        WebElement element = driver.findElement(By.xpath(locators.enable_button));
        String text = element.getText();
        String attr = element.getTagName();
        System.out.println("text"+text);
        System.out.println("attr"+attr);
        Assert.assertEquals(text, "Enable");
        element.isDisplayed();

    }

    public static void check_enable_default_button_state(){
        WebElement element = driver.findElement(By.xpath(locators.enable_button));
        String text = element.getText();
        Assert.assertEquals(text, "Enable");
        element.isDisplayed();

    }
}
