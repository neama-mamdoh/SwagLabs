package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By user_name = By.id("user-name");
    private By password = By.id("password");
    private By loginbtn = By.id("login-button");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUsername(String username){
        driver.findElement(user_name).sendKeys(username);
    }

    public void setPassword(String pass){
        driver.findElement(password).sendKeys(pass);
    }

    public ProductsPage clickLoginButton(){
        driver.findElement(loginbtn).click();
        return new ProductsPage(driver);
    }
}