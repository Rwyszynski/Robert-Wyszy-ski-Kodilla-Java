package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_AGREE = "(//div[@role=\"button\"])[14]/div/div/div";
    public static final String XPATH_CREATE = "//div[@class=\"_6ltg\"][2]";
    public static final String XPATH_NAME = "(//div[contains(@class, \"uiStickyPlaceholderInput\")])[1]/input";
    public static final String XPATH_LASTNAME = "(//div[contains(@class, \"uiStickyPlaceholderInput\")])[2]/input";
    public static final String XPATH_DAY = "(//select[@id=\"day\"])";
    public static final String XPATH_MONTH = "(//select[@id=\"month\"])";
    public static final String XPATH_YEAR = "(//select[@id=\"year\"])";
    public static final String XPATH_SEX = "(//label[@class=\"_58mt\"])[2]";
    public static final String XPATH_TEL = "(//div[contains(@class, \"uiStickyPlaceholderInput\")])[5]/input";
    public static final String XPATH_PASS = "(//div[contains(@class, \"uiStickyPlaceholderInput\")])[7]/input";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath(XPATH_AGREE)).click();
        driver.findElement(By.xpath(XPATH_CREATE)).click();
        driver.findElement(By.xpath(XPATH_AGREE)).click();

        WebElement firstName = driver.findElement(By.xpath(XPATH_NAME));
        firstName.sendKeys("Robert");

        WebElement lastName = driver.findElement(By.xpath(XPATH_LASTNAME));
        lastName.sendKeys("Wyszynski");

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoard1 = new Select(selectDay);
        selectBoard1.selectByIndex(15);

        WebElement selectMonth = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoard2 = new Select(selectMonth);
        selectBoard2.selectByIndex(5);

        WebElement selectYear = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoard3 = new Select(selectYear);
        selectBoard3.selectByIndex(33);

        driver.findElement(By.xpath(XPATH_SEX)).click();

        WebElement phone = driver.findElement(By.xpath(XPATH_TEL));
        phone.sendKeys("789789789");

        WebElement password = driver.findElement(By.xpath(XPATH_PASS));
        password.sendKeys("Robert");
    }
}
