package com.example.tsi.caillan.lovell.demo;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

import java.util.*;

public class PenislandTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void PenislandTest() {
    driver.get("https://www.penisland.net/index.html");
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Wood")).click();
    driver.findElement(By.linkText("Plastic")).click();
    driver.findElement(By.linkText("Samples")).click();
    driver.findElement(By.linkText("Testimonials")).click();
    driver.findElement(By.linkText("FAQ")).click();
    driver.findElement(By.linkText("Contact Us")).click();
    driver.close();
  }
}