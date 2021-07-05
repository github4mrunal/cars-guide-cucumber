package com.carsguide.pages;

import com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.awt.windows.WBufferStrategy;

public class SearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(SearchPage.class.getName());

    @FindBy(xpath = "//select[@id='makes']")
    WebElement carmake;

    @FindBy(xpath = "//select[@id='models']")
    WebElement carmodel;

    @FindBy(xpath = "//select[@id='locations']")
    WebElement carlocation;

    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement carprice;

    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findmynextcarbutton;

    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement carmaketext;

    public void selectCarMakeFromDropDown(String make){
        log.info("Selecting Car Make" + carmake.toString());
        selectByValueFromDropDown(carmake, make);
    }

    public void selectCarModelFromDropDown(String model){
        log.info("Selecting Car Model" + carmodel.toString());
        selectByValueFromDropDown(carmodel,model);
    }
    public void selectPriceOfTheCarFromDropDown(String price){
        log.info("Selecting Car Price" +carprice.toString());
        selectByVisibleTextFromDropDown(carprice,price);
    }

    public void selectLocationOfTheCarFromDropDown(String location){
        log.info("Selecting Location of the Car" +carlocation.toString());
        selectByValueFromDropDown(carlocation,location);
    }
    public void findMyNextCarButton(){
        log.info("Clicking on Find my next car" +findmynextcarbutton.toString());
        clickOnElement(findmynextcarbutton);
    }
    public String verifyCarMakeInTheResults(){
        log.info("Verifying Car Make in results" +carmaketext.toString());
        return getTextFromElement(carmaketext);
    }
}
