package TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions2 {
	
	
	    String className = "HardAssertion";

	    @Test
	    public void test_UsingHardAssertion() {
	        //Assert.assertTrue(true == true);
	        Assert.assertEquals("HardAssertion", "HardAssertion");
	        Assert.assertEquals(className, "HardAssertion");
	        System.out.println("Successfully passed!");
	    }

}
