package wrapper2;

public interface Wrappermethod {
	
	public void invokeApp(String url);
	public void enterById (String idvalue, String data);
	public void enterbyName (String namevalue, String data);
	public void enterbyClassname (String cnamevalue, String data);
	public void enterbyLinktext(String value, String data);
	public void enterbyXpath (String xpathvalue, String data);
	public void clickbyid(String value);
	public void clickbyname(String value);
	public void clickByClassName(String value);
	public void clickbylinktext(String value);
	public void clickbyxpath(String value);
	
	public void SelectbyvisibletextbyId(String Id, String value);
	public void closebrowser();
	
	
	
	

}
