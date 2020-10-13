package pages.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ElementAction;
import utilities.PageGenerator;

public class EmailOptSuccessPage extends BasePage {
    @FindBy(xpath="//*[contains(text(),'Continue')]")
    private WebElement continuteButton;

    public  BussinessBoardPage clickContinueButton() throws InterruptedException {
        ElementAction.click(continuteButton,"Continue Button of Email Successfull Wohoo!");
        return PageGenerator.getInstance(BussinessBoardPage.class);
    }
}
