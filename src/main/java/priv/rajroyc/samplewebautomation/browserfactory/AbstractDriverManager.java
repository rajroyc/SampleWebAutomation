package priv.rajroyc.samplewebautomation.browserfactory;

import org.openqa.selenium.WebDriver;

public abstract class AbstractDriverManager {
	
	protected WebDriver driver;
	
	public abstract void startService();
	public abstract void stopService();
	public abstract void createDriver();
	
	public void quitDriver(){
		if(null!=driver){
			driver.quit();
			driver = null;
		}
	}

	public WebDriver getDriver(){
		
		if(null!=driver){
			startService();
			createDriver();
		}
		return driver;
		
	}

}
