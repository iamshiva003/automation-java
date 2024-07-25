package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utility.BrowserDriver;

public class HomePage {

    public static WebDriver driver;
    public static String hamburger_menu_xpath = "//*[@id=\"menuToggle\"]/input";

    public static String signIn_link_LinkText = "Sign In Portal";

    public static void click_hamburger_menu() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath(hamburger_menu_xpath)).click();
    }

}
