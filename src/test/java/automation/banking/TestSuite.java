package automation.banking;

import net.serenitybdd.jbehave.SerenityStories;

public class TestSuite extends SerenityStories{
	
	public TestSuite() {
		// TODO Auto-generated method stub
		System.setProperty("metafilter", "+banking - manualsync");
		System.setProperty("webdriver.base.url", "https://demo.guru99.com/V4/index.php");
		System.setProperty("webdriver.driver", "chrome");
		findStoriesCalled("SignIn.story");
	}
}
