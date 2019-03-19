package com.aqacources.project.pages;

import com.aqacources.project.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.$;

/**
 * Created by Marina on 24.02.2019.
 */
public class DressesPage extends AbstractPage {

    //  Web elements
    @FindBy(xpath = "//ul[@class='tree dynamized']/li/a[contains(text(), 'Summer Dresses')]")
    private WebElement menuSummerDresses;

    /**
     * Constructor
     *
     * @param testClass
     */
    public DressesPage(BaseTest testClass) {
        super(testClass);
    }

    /**
     * click to menu Dressses
     */
    public SummerDressesPage clickMenuSummerDresses() {
        testClass.waitTillElementIsVisible(menuSummerDresses);
        $(menuSummerDresses).click();
        return new SummerDressesPage(testClass);
    }
}
