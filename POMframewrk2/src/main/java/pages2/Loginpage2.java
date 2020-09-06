package pages2;

import wrapper2.Projectspecificwrapper2;

public class Loginpage2 extends Projectspecificwrapper2{
	
	public Loginpage2 enterUsername (String uname) {
		enterById("username", uname);
		return this;
			}

	public Loginpage2 enterPassword (String pwd) {
		enterById("password", pwd);
		return this;
	}
	public Homepage2 clicklogin() {
		clickByClassName("decorativeSubmit");
		return new Homepage2();
		
	}

		}
	
	

