package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


import generic.Base_page;

public class Loginfb extends Base_page{
@FindBy(id="email")
private WebElement usname;
@FindBy(id="pass")
private WebElement Pwdtxt;
@FindBy(name="login")
private WebElement login_btn;
public Loginfb(WebDriver driver)
{
  super(driver);
}
public void username(String user)
{
  usname.sendKeys(user);	
}
public void password(String pwd)
{
	Pwdtxt.sendKeys(pwd);
}
public void login()
{
	login_btn.click();
}

}
