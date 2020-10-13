package id.minerva.com.dashboard;

import id.minerva.com.BaseTest;
import org.apache.tools.ant.taskdefs.Sleep;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.authentication.LoginPage;
import pages.dashboard.*;
import utilities.CommonUtil;
import utilities.DriverFactory;
import utilities.PageGenerator;

public class RegisterTest extends BaseTest {
    private LoginPage loginPage;
    protected SoftAssert softAssert =new SoftAssert();
    private  RegisterPage registerPage;
    private EmailOptPage emailOptPage;
    private EmailOptSuccessPage emailOptSuccessPage;
    private CompleteYourInformationPage completeYourInformationPage;
    private PersonalDetailPage personalDetailPage;
    private BussinessBoardPage bussinessBoardPage;
    @BeforeTest
    public void beforeClass(){
        loginPage = PageGenerator.getInstance(LoginPage.class);
        registerPage=PageGenerator.getInstance(RegisterPage.class);
        emailOptPage=PageGenerator.getInstance(EmailOptPage.class);
        emailOptSuccessPage=PageGenerator.getInstance(EmailOptSuccessPage.class);
        completeYourInformationPage=PageGenerator.getInstance(CompleteYourInformationPage.class);
        personalDetailPage=PageGenerator.getInstance(PersonalDetailPage.class);
        bussinessBoardPage=PageGenerator.getInstance(BussinessBoardPage.class);
    }

    @Test(groups={"check_register"},description = "Register successfull" ,priority =1)
    public void Register() throws InterruptedException {
       // registerPage=loginPage.clickOnRegisterLink();
        registerPage.clickOnFlagDropDownList().clickItemFlag();
       // Thread.sleep(5);
        registerPage.typeOnFullName("Lan").typeOnEmail("quynhlan.opt+"+ CommonUtil.getRandom() +"@gmail.com").typeOnPhone("7859"+ CommonUtil.getRandom());
        registerPage.clickQuestionDdl().clickQuestionItem();
        registerPage.clickOnCheckBoxTerm();
        emailOptPage=  registerPage.clickOnContinueButton();
        Thread.sleep(5);
        emailOptPage.typeOnEmailOpt("12345",getDriver());
        Thread.sleep(2);
        emailOptPage.typeOnEmailOpt("6",getDriver());

        emailOptPage.clickOnVerifyButton(getDriver());
        Thread.sleep(5);
        emailOptSuccessPage.clickContinueButton();
        Thread.sleep(2);
        bussinessBoardPage.clickContinueButton();
        Thread.sleep(2);

       completeYourInformationPage.clickStartButton();
       personalDetailPage.clickOnBirthDayPicker().typeBirthday("Oct 22, 1990");


        Thread.sleep(50000);
    }

}
