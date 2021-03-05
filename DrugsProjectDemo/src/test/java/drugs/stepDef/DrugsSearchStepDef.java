package drugs.stepDef;

import drugs.actions.DrugsSearchActions;
import io.cucumber.java.en.*;

public class DrugsSearchStepDef {
	
	DrugsSearchActions drugsAct = new DrugsSearchActions();
	
	@Given("Open Drugs Website")
	public void open_Drugs_Website() {
		drugsAct.homePage();
	}

	@When("click on deaceses and condition from carousel")
	public void click_on_deaceses_and_condition_from_carousel() throws Exception {
		drugsAct.deceasesLink();
	}

	@When("Input fever in search textbox")
	public void input_fever_in_search_textbox() throws Throwable {
		drugsAct.searchText();
	}

	@Then("User showes description of fever msg")
	public void user_showes_description_of_fever_msg() {
		drugsAct.descriptionMsg();
	}


}
