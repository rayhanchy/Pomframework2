package pages2;

import wrapper2.Projectspecificwrapper2;

public class CreateLeadpage2 extends Projectspecificwrapper2 {
	
	public CreateLeadpage2 entercomapnyname (String cName) {
		enterById("createLeadForm_companyName", cName);
		return this;
				
	}

	public CreateLeadpage2 enterfirstname(String fName) {
		enterById("createLeadForm_firstName", fName);
		return this;
	}	
	
	
	public CreateLeadpage2 enterlastname(String lName) {
		enterById("createLeadForm_marketingCampaignId", lName);
		return this;
		
	}
	
	public CreateLeadpage2 entercurrency(String value) {
		SelectbyvisibletextbyId("Selectbyvisibletext", value);
		return this;
	
}
	public Viewleadpage clicksubmitbutton() {
		clickbyname("submitButton");
		return new Viewleadpage();
	}
	
}