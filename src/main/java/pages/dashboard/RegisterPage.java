package pages.dashboard;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;
import utilities.ElementAction;
import utilities.PageGenerator;

public class RegisterPage extends BasePage {
    //input[type="tel"]
    @FindBy(css="input[type=\"tel\"]")
    private WebElement tel;

    @FindBy(css="input[name=\"full_name\"]")
    private WebElement fullNameInput;

    @FindBy(css="input[name=\"email\"]")
    private WebElement emailInput;

    @FindBy(css="input[name=\"phone\"]")
    private WebElement phoneInput;

    //div.flag-select__icon
    @FindBy(css="div.flag-select__icon")
    private WebElement flagDdl;

    //div.q-item__label
    @FindBy(xpath="//*[contains(text(),'Viet Nam')]")
    private WebElement flagItem;
    @FindBy(css=".q-field__native>input")
    private WebElement questionDdl;

    @FindBy(xpath="//*[contains(text(),'Google')]")
    private WebElement questionItem;


    @FindBy(css=".q-checkbox")
    private WebElement termCheckbox;

    @FindBy(xpath="//span[contains(text(),\"Continue\")]")
    private WebElement continueButton;
    //.q-field__native>span
    //input[name="email"]
    public  RegisterPage typeOnFullName(String fullName){
        ElementAction.type(fullNameInput,"Full Name Textbox",fullName);
        return this;
    }

    public  RegisterPage typeOnEmail(String email){
        ElementAction.type(emailInput,"EmailTextbox",email);
        return PageGenerator.getInstance(RegisterPage.class);
    }

    public  RegisterPage typeOnPhone(String phone){
        ElementAction.type(phoneInput,"Phone",phone);
        return PageGenerator.getInstance(RegisterPage.class);
    }

    public  RegisterPage clickOnFlagDropDownList() throws InterruptedException {
        ElementAction.click(flagDdl,"Flag DropDownList");
        return PageGenerator.getInstance(RegisterPage.class);
    }

    public  RegisterPage clickItemFlag() throws InterruptedException {
        ElementAction.click(flagItem,"Flag Item");
        return PageGenerator.getInstance(RegisterPage.class);
    }

    public  RegisterPage clickQuestionDdl() throws InterruptedException {
        ElementAction.click(questionDdl,"Question drop downlist");
        return PageGenerator.getInstance(RegisterPage.class);
    }

    public  RegisterPage clickQuestionItem() throws InterruptedException {
        ElementAction.click(questionItem,"Question drop downlist");

        return PageGenerator.getInstance(RegisterPage.class);
    }
    //termCheckbox

    public  RegisterPage clickOnCheckBoxTerm() throws InterruptedException {
        ElementAction.click(termCheckbox,"CheckBox Term");

        return PageGenerator.getInstance(RegisterPage.class);
    }

    public  EmailOptPage clickOnContinueButton() throws InterruptedException {
        ElementAction.click(continueButton,"Continue Button");
        return PageGenerator.getInstance(EmailOptPage.class);
    }

}
