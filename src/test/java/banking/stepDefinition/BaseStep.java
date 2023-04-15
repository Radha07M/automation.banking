package banking.stepDefinition;

import org.jbehave.core.annotations.AfterStories;
import org.jbehave.core.annotations.BeforeStories;

public class BaseStep {
	
	@BeforeStories
	public void beforeStories()
	{
		System.out.println("Running before stories");
	}
	
	/*@AfterScenario(uponOutcome=AfterScenario.Outcome.FAILURE)
	public void afterFailedScenario()
	{
		System.out.println("Running after failed scenario");
	}
	
	@AfterStory(uponGivenStory=true)
	public void afterGivenStory()
	{
		System.out.println("Running after Given Story");
	}*/
	
	@AfterStories
	public void afterStories()
	{
		System.out.println("Running after stories");
	}
}
