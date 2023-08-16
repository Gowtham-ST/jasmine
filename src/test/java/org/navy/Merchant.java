package org.navy;

import org.testng.annotations.Test;

public class Merchant {
	
	public class LoginTestingClass{
		@Test(priority=-1)
		private void tc() {
			System.out.println("test1");
		}
		@Test
		private void tc02() {
			System.out.println("test2");
		}
		
	}

}
