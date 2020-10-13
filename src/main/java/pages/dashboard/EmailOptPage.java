package pages.dashboard;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.CommonUtil;
import utilities.ElementAction;
import utilities.PageGenerator;

public class EmailOptPage extends BasePage {
    //.q-field__native
    @FindBy(css=".digit-input")
    private WebElement emailOptDiv;

    @FindBy(css=".q-field__native")
    private WebElement emailOptInput;


    @FindBy(xpath="//*[contains(text(),'Verify')]")
    private WebElement verifyButton;

    public  EmailOptPage typeOnEmailOpt(String emailOpt,WebDriver driver){
        //ElementAction.type(emailOptInput,"EmailOpt",emailOpt);
       // ElementAction.focus(emailOptInput,driver);
        ElementAction.sendKeyUntil(emailOptInput,emailOpt);
        //ElementAction.setAttribute(emailOptDiv,emailOpt,driver);
       // emailOptDiv.getAttribute("value");
        return this;
    }


    public  EmailOptSuccessPage clickOnVerifyButton(WebDriver driver){
       // ElementAction.waitToClickable(verifyButton,"Verify Button",driver);

        //ElementAction.focus(verifyButton,driver);
        ElementAction.click(verifyButton,"Verify Button on Email Opt");
      //  ElementAction.click(verifyButton,"Verify Button on Email Opt");
        return PageGenerator.getInstance(EmailOptSuccessPage.class);
    }
}
