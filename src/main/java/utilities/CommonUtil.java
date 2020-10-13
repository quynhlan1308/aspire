package utilities;

import org.openqa.selenium.WebElement;

import java.util.Random;

public class CommonUtil {

    public static void vsleep(int timeInSeconds) {
        try {
            Thread.sleep(timeInSeconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

   public static String getRandom(){
       Random r = new Random( System.currentTimeMillis() );
       int random= 10000 + r.nextInt(20000);
        return String.valueOf(random);
    }

}
