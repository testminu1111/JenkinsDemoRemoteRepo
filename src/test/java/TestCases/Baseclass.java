package TestCases;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Baseclass {


        public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

        @BeforeClass
        public void setupDriver() {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            webDriver.set(new ChromeDriver(options));
            webDriver.get().manage().window().maximize();
            webDriver.get().get("https://www.google.com");
        }

        @AfterClass
        public void tearDown() {
            if (webDriver.get() != null) {
                webDriver.get().quit();
            }
        }
    }








