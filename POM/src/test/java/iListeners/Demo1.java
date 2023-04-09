package iListeners;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void abc() {
		
		Assert.assertEquals(100, 100);
	}
	
	@Test
	public void pqr() {
		
		Assert.assertEquals("abcd", 100);
	}
	
	@Test
	public void xyz() {
		
		Assert.assertEquals("varaha", "varaha");
	}

}
