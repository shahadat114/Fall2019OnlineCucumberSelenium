package com.vtrack.pages.fleet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehiclePage extends AbstractBasePage{

    @FindBy(partialLinkText = "Create Car")

    private WebElement createCar;

    public void clickToCreateCar(){

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.elementToBeClickable(createCar)).click();

    }
}
