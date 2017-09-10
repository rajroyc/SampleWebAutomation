package priv.rajroyc.samplewebautomation.browserfactory;

public class BrowserFactory {
	
	public static AbstractDriverManager getBrowserManager(BrowserType type){
		AbstractDriverManager browserManager;
		
		switch(type){
		case Chrome:
			browserManager = new ChromeDriverManager();
			break;
		case FireFox:
			browserManager = new FireFoxManager();
			break;
		case IE:
			browserManager = new IEManager();
			break;
		default:
			browserManager = new FireFoxManager();
			break;
		}
		
		return browserManager;
		
	}

}
