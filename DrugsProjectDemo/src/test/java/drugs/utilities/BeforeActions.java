package drugs.utilities;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeActions {

	
	@Before
	public void beforeScenario(Scenario scen) {

		System.out.println("..Chrome Driver initialization..");
		SetupDrivers.setupChromeDriver();
		System.out.println("..Chrome Driver initialized..");
		System.out.println("scen.getName()");

	}
	
}
