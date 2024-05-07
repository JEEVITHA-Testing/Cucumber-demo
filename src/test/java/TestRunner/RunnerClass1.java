package TestRunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\resources\\Features",
		dryRun=true
		,glue="Steps", plugin = {"pretty", "html:target/CucumberReports/index.html",
	"json:reports/result.json",
	"junit:reports/result.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//plugin =  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

		//plugin = {"pretty", "html:target/index.html"}
		//plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		//plugin= {"pretty","html:target/cucumber-reports/Cucumber.html"}
		)
public class RunnerClass1 {

}
