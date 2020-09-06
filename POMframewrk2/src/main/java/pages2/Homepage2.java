package pages2;

import wrapper2.Projectspecificwrapper2;

public class Homepage2 extends Projectspecificwrapper2 {
	
	public Loginpage2 clicklogout() {
		clickbyxpath("//input[@value='Logout']");
		return new Loginpage2();
		
	}
	public MyHomePage2 clickCRMSFA() {
		clickbylinktext("CRM/SFA");
		return new MyHomePage2();
	}
	
	
	
}


