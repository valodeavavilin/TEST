package org.app.test;

import org.app.NumberGeneratorApp;
import org.junit.Assert;
import org.junit.Test;
 
public class NumberGeneratorTest {
 
	@Test
	public void testLengthOfTheUniqueKey() {
		System.out.println("Running Test: ... ... ...");
		NumberGeneratorApp obj = new NumberGeneratorApp();
		String uID = obj.generateUniqueKey();
		System.out.println("Unique ID : " + uID);
		Assert.assertEquals(36, uID.length());
	}
}
