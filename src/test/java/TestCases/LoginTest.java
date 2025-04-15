package TestCases;


import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(org.testng.reporters.EmailableReporter2.class)
public class LoginTest extends Baseclass {

        private LoginPage loginPage;

        @BeforeClass
        public void init() {
            this.loginPage = new LoginPage(webDriver.get());
        }

        @Test(priority = 1)
        public void TC_001() throws InterruptedException {
            loginPage.TC_001();
        }
    @Test(priority = 2)
    public void TC_002() throws InterruptedException {
        loginPage.TC_002();
    }
    @Test(priority = 3)
    public void TC_003() throws InterruptedException {
        loginPage.TC_003();
    }
    @Test(priority = 4)
    public void TC_004() throws InterruptedException {
        loginPage.TC_004();
    }
    @Test(priority = 5)
    public void TC_005() throws InterruptedException {
        loginPage.TC_005();
    }
        // Add the remaining test methods here...
    }

