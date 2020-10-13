package utilities;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.event.KeyEvent;

public class ElementAction {

    public static void click(WebElement ele, String eleName) {
        if (ele != null) {
            ele.click();
            LogUtils.info(String.format("Click %s", eleName));
        }
    }

    public static void waitToClickable(WebElement ele, String eleName, WebDriver webDriver) {

        if (ele != null) {
            WebDriverWait wait = new WebDriverWait(webDriver,60000);
            wait.until(ExpectedConditions.visibilityOf(ele));
            ele.click();
            LogUtils.info(String.format("Click %s", eleName));
        }
    }
    public static void focus(WebElement wel,WebDriver driver) {
        if ("input".equals(wel.getTagName())) {
            wel.sendKeys("");
        } else {
            new Actions(driver).moveToElement(wel).perform();

        }
    }
    public static void type(WebElement ele, String eleName, String value) {
        if (ele != null) {
            ele.clear();

            ele.sendKeys(value);
            LogUtils.info(String.format("Type '%s' into '%s' input", eleName, value));
        }
    }
    public static String getText(WebElement ele) {
        if (ele != null) {
            LogUtils.info(ele.getText());
            return ele.getText();
         }
        return  null;
    }
    public static void setAttribute(WebElement ele,String value,WebDriver myDriver) {
        if (ele != null) {
            JavascriptExecutor js = (JavascriptExecutor) myDriver;
            js.executeScript("arguments[0].setAttribute(arguments[1],arguments[2])",
                    ele, "value", value);
        }
    }
    public static void sendKeyUntil(WebElement we, String text) {
        int i = 1;
        while (i <= 5) {
            we.clear();
            we.sendKeys(text);
            sleep(1);
            if (we.getAttribute("value").equals(text)){
                sleep(1);
                break;}
            i++;
         //   we.sendKeys(Keys.TAB);
        }

    }
    public static void sleep(int timeInSeconds) {
        try {
            Thread.sleep(timeInSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
