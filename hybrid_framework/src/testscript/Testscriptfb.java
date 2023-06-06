package testscript;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import generic.Base_Test;
import pom.Loginfb;



public class Testscriptfb extends Base_Test
{
	@Test(dataProvider="testdata")
		public void login(String d1,String d2) throws InterruptedException 
		{
			Loginfb p=new Loginfb(driver);
				p.username(d1);
				Thread.sleep(2000);
				p.password(d2);
				Thread.sleep(2000);
				p.login();
				Assert.fail();
	}
@DataProvider(name="testdata")
	public Object[][] createData1()
	{
		return new Object[][]{
			{"abhvgg","1122"},};
	}

}
