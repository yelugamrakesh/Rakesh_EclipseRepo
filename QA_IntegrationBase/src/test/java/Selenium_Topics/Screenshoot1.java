package Selenium_Topics;

import org.testng.annotations.Test;

public class Screenshoot1 extends Driver {



	@Test
	public void Screen() throws Exception {
		
		
		//Driver se=new Driver();
		setup("chrome");
		driver.get("https://www.selenium.dev/selenium/docs/api/java/org/openqa/selenium/interactions/Actions.html#clickAndHold()");
		Takeascreenshot();
	}

}
