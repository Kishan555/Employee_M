package com.example.ems;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SeleniumEdgeExample {
    public static void main(String[] args) {
        // Set the path to your Edge WebDriver
        System.setProperty("webdriver.edge.driver", "C:\\path\\to\\edgedriver\\msedgedriver.exe");

        // Set up Edge options
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");

        // Remove the headless argument to run in headed mode
        // options.addArguments("--headless");

        // Initialize the Edge driver
        WebDriver driver = new EdgeDriver(options);

        try {
            // Open a website
            driver.get("https://www.google.com");

            // Find the search box using its name attribute value
            WebElement searchBox = driver.findElement(By.name("q"));

            // Send a search query
            searchBox.sendKeys("Selenium WebDriver");
            searchBox.sendKeys(Keys.RETURN); 

            // Wait for the results to load and display the title
            Thread.sleep(3000); // This is a simple wait, ideally use WebDriverWait for production code
            System.out.println("Page title is: " + driver.getTitle());

            // Find the first result and print the text
            WebElement firstResult = driver.findElement(By.cssSelector("h3"));
            System.out.println("First result text: " + firstResult.getText());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
