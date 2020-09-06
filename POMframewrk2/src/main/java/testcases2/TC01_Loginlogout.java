package testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages2.Loginpage2;
import wrapper2.Projectspecificwrapper2;

public class TC01_Loginlogout extends Projectspecificwrapper2{
	@BeforeTest 
	public void setData() {
		excelfile ="tc001_login";
	}
	
	@Test (dataProvider = "getData")
	public void loginlogout(String uname, String pwd) {
		new Loginpage2()
		.enterUsername(uname)
		.enterPassword(pwd)
		.clicklogin()
		.clicklogout();
		
				
	}

}
