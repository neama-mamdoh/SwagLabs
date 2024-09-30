package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage{
    private WebDriver driver;
    private By asserMsg = By.cssSelector("span[data-test='title']");
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getAssertMsgForEnteringThePage(){
        return driver.findElement(asserMsg);
    }

}
