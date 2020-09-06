package testcases2;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages2.Loginpage2;
import wrapper2.Projectspecificwrapper2;

public class TC002_CreateLead extends Projectspecificwrapper2{
	@BeforeTest
	public void setData() {
		excelfile = "tc002_createlead";
		
	}

	@Test (dataProvider = "getData")
	public void CreateLead(String uname, String pwd, String cName, String fName, String lName) {
		
		 new Loginpage2()
		.enterUsername(uname)
		.enterPassword(pwd)
		.clicklogin()
		.clickCRMSFA()
		.Creatleadlink()
		.entercomapnyname(cName)	
		.enterfirstname(fName)
		.enterlastname(lName)
		.clicksubmitbutton();
		
		 

}
}