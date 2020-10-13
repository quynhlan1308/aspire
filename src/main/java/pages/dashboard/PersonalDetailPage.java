package pages.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ElementAction;
import utilities.PageGenerator;

public class PersonalDetailPage extends BasePage {
    @FindBy(css="input[placeholder=\"Set your date of birth\"]")
    private WebElement dateTimePicker;

    @FindBy(css="input[placeholder=\"Select any of the following\"]")
    private WebElement nationalDdl;

    public  PersonalDetailPage clickOnBirthDayPicker() throws InterruptedException {
        ElementAction.click(dateTimePicker,"Birthdate DateTimepicker");
        Thread.sleep(5000);
        return PageGenerator.getInstance(PersonalDetailPage.class);
    }
    public  PersonalDetailPage typeBirthday(String birthDay) throws InterruptedException {
        ElementAction.sendKeyUntil(dateTimePicker,birthDay);
        Thread.sleep(5000);
        return PageGenerator.getInstance(PersonalDetailPage.class);
    }

    public  PersonalDetailPage clickOnNational() throws InterruptedException {
        ElementAction.click(nationalDdl,"Drop down list National");
        Thread.sleep(5000);
        return PageGenerator.getInstance(PersonalDetailPage.class);
    }

}
