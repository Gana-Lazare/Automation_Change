package pageObject;

import helper.Waiterhelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testBase.Base;

public class IndexObject extends Base {

    public WebDriver driver;
    Waiterhelper waiterhelper;
    public IndexObject(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        waiterhelper = new Waiterhelper(driver);
    }

    @FindBy(xpath = "//*[text()='Your Account']")
    public WebElement yourAccount;

    //Your Account Navigation
    public void yourAccount_click(){
        try{
            waiterhelper.waitforElement(yourAccount);
        yourAccount.click();}
        catch (Exception e){ e.getMessage();}

    }

}
