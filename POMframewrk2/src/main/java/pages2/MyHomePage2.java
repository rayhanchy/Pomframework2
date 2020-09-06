package pages2;

import wrapper2.Projectspecificwrapper2;

public class MyHomePage2 extends Projectspecificwrapper2{
	
	public CreateLeadpage2 Creatleadlink() {
		
		clickbylinktext("Create Lead");
		return new CreateLeadpage2();
		
	}
	

}
