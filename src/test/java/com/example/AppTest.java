package com.example;

import junit.framework.TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest extends TestCase {

    public void testLeetcode() {

        System.setProperty("webdriver.chrome.driver",
                "/usr/bin/chromedriver");

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://leetcode.com");

        System.out.println(driver.getTitle());
    }
}
