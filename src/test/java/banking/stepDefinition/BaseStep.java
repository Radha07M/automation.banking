package banking.stepDefinition;

import io.cucumber.java.AfterStep;
import io.cucumber.java.BeforeStep;
import net.serenitybdd.core.annotations.events.AfterExample;
import net.serenitybdd.core.annotations.events.AfterScenario;
import net.serenitybdd.core.annotations.events.BeforeExample;
import net.serenitybdd.core.annotations.events.BeforeScenario;

public class BaseStep {

	@BeforeScenario()
	public void beforeScenario()
	{
		System.out.println("Running before scenario");
	}
	
	@BeforeStep()
	public void beforeStep()
	{
		System.out.println("Running before step");
	}
	
	@BeforeExample()
	public void beforeExample()
	{
		System.out.println("Running before example");
	}
	
	@AfterScenario()
	public void afterScenario()
	{
		System.out.println("Running after scenario");
	}
	
	@AfterStep()
	public void afterStep()
	{
		System.out.println("Running after step");
	}
	
	@AfterExample()
	public void afterExample()
	{
		System.out.println("Running after example");
	}
}
