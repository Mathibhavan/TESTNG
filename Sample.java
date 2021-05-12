package testNG_Concepts;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Sample {
@Test(retryAnalyzer = Retry_Analyzer.class)

	private void test() {
	String a="ABC";
	String b="AXB";
		Assert.assertEquals(a,b);
	}
}
