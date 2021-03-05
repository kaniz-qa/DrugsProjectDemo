package drugs.stepDef;

import drugs.actions.CompareDrugsActions;
import io.cucumber.java.en.*;

public class CompareDrugsStepDef {
	
	CompareDrugsActions compareAct = new CompareDrugsActions();
	
	@When("click on compare drugs from carousel")
	public void click_on_compare_drugs_from_carousel() throws Throwable {
		compareAct.compareLink();
		compareAct.compareLink2();
		compareAct.compareLink3();
		
	}

	@When("Click on claritin vs zyrtec")
	public void click_on_claritin_vs_zyrtec() throws Throwable {
		compareAct.caralitinLink();
	}

	@Then("User showes description of claritin vs zyrtec")
	public void user_showes_description_of_claritin_vs_zyrtec() throws Throwable {
		compareAct.desrciptionMsg();
	}


}
