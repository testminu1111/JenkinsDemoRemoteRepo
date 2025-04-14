package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static void main(String[] args) {
        Map<String, Object> prefs = new HashMap<>();
        // Set preferences for Chrome (e.g., allow camera access)
        prefs.put("profile.default_content_setting_values.media_stream_camera", 1);  // Allow camera
        prefs.put("profile.default_content_setting_values.notifications", 2);  // Disable notifications

        try {
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("prefs", prefs);
            options.addArguments("--disable-notifications");
            options.addArguments("--ignore-ssl-errors=yes");
            options.addArguments("--ignore-certificate-errors");

            WebDriver driver = new ChromeDriver(options);  // Initialize WebDriver
            driver.manage().window().maximize();

            driver.get("https://www.google.com");
            System.out.println("Chrome started successfully!");

            // Wait for a few seconds (in this case, 5 seconds)
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Close the browser after the task
            driver.quit();


            // Close browser
          //  driver.quit();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
}}