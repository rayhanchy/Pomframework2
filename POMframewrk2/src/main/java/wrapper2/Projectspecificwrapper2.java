package wrapper2;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils2.ReadExcel2;

public class Projectspecificwrapper2 extends Genericwrapper2 {
	
	public String excelfile;
	
	@BeforeMethod
	public void login() {
		invokeApp("http://leaftaps.com/opentaps");
				
	}
	
	@AfterMethod
	public void closebrowser() {
		closebrowser();
	}
	@DataProvider
	
	public String[][] getData () throws IOException {
		ReadExcel2 r1 = new ReadExcel2();
		return r1.readexcel(excelfile);
		
	}
	
	
	

}
