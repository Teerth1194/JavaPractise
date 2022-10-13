package com.OrangeHRM.steps;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class stepsLogin {

    WebDriver driver;
    @Given("edge brwser is open")
    public void edge_brwser_is_open() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Given("open orangeHRM is loaded")
    public void open_orange_hrm_is_loaded() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Then("^login into the account with (.*) and (.*)$")
    public void login_into_the_account_with_admin_and_admin123(String username, String password) {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[@type='submit']")).click();
    }

    @Then("verify employee list page is displayed")
    public void verify_employee_list_page_is_displayed() {

        driver.findElement(By.xpath("//a[@href='/web/index.php/admin/viewAdminModule']")).isDisplayed();

    }


}
