package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class LoginPage {
        private WebDriverWait wait;

        // Constructor initializes the elements in the page
        public LoginPage(WebDriver driver) {
            PageFactory.initElements(driver, this);
            wait = new WebDriverWait(driver, Duration.ofSeconds(60));  // Set the wait time to 60 seconds
        }

        // Test Case 001 - Example
        public void TC_001() throws InterruptedException {
            System.out.println("Executing TC_001");
            // Add your login functionality here
            Thread.sleep(2000);  // Simulate some delay for actions like login
        }

        // Test Case 002 - Example
        public void TC_002() throws InterruptedException {
            System.out.println("Executing TC_002");
            // Add your login functionality here
            Thread.sleep(2000);  // Simulate some delay
        }

        // Test Case 003 - Example
        public void TC_003() throws InterruptedException {
            System.out.println("Executing TC_003");
            // Add your login functionality here
            Thread.sleep(2000);  // Simulate some delay
        }

        // Test Case 004 - Example
        public void TC_004() throws InterruptedException {
            System.out.println("Executing TC_004");
            // Add your login functionality here
            Thread.sleep(2000);  // Simulate some delay
        }

        // Test Case 005 - Example
        public void TC_005() throws InterruptedException {
            System.out.println("Executing TC_005");
            // Add your login functionality here
            Thread.sleep(2000);  // Simulate some delay
        }
    }


