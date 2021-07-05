package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Utility {

    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @FindBy(xpath = "//a[contains( text() , 'buy + sell')]")
    WebElement buyplussell;

    @FindBy(xpath = "//a[contains( text() , 'Search Cars')]")
    WebElement searchCars;

    @FindBy(xpath = "//h1[contains( text() , 'New & Used Car Search - carsguide')]")
    WebElement searchCarsPageText;

    public void mouseHoverOnBuyPlusSellTab(){
        log.info("Mouse hover on buy + sell" +buyplussell.toString());
        mouseHoverToElement(buyplussell);
    }
    public void clickOnSearchCars(){
        log.info("CLicking on Search Cars" +searchCars.toString());
        clickOnElement(searchCars);
    }
    public String getTextFromSearchCarsPage(){
        log.info("Verify Search Page Text" + searchCarsPageText.toString());
        return getTextFromElement(searchCarsPageText);
    }
}

