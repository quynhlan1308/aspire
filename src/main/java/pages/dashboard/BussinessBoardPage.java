package pages.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ElementAction;
import utilities.PageGenerator;

public class BussinessBoardPage extends BasePage {
    //(//*[contains(text(),'Continue')])[1]
    @FindBy(xpath="" +
            "" +
            "")
    private WebElement continuteButton;

    public  CompleteYourInformationPage clickContinueButton() throws InterruptedException {
        ElementAction.click(continuteButton,"Continue Button of Business board");
        return PageGenerator.getInstance(CompleteYourInformationPage.class);
    }
}
