
package com.guru99.TestCases;
import org.testng.annotations.Test;

import com.guru99.Pages.LoginPage;

/**
 * @author FaisalKhatri
 * This Class will verify login of the Guru99 Site.
 */
public class VerifyBankLogin{

	@Test
	public void ValidLogin () {
		LoginPage login = new LoginPage();
		login.LoadSite();
		login.loginSite("mngr47682", "suqyvag");
		login.VerifyTitle();
		/*login.typeusrname();
		login.typepwd();
		login.clickln();*/
		login.ClSite();
		
		
	}
}
