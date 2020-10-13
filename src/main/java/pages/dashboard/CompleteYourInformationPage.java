package pages.dashboard;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ElementAction;
import utilities.PageGenerator;

public class CompleteYourInformationPage extends BasePage {
    @FindBy(xpath="//*[contains(text(),'Get Started')]")
    private WebElement getStartButton;

    public  PersonalDetailPage clickStartButton() throws InterruptedException {
        ElementAction.click(getStartButton,"Get Start Button");
        return PageGenerator.getInstance(PersonalDetailPage.class);
    }
}
