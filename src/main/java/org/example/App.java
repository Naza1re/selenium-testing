package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException {

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://yandex.by");
        WebElement webElement = webDriver.findElement(By.className("mini-suggest__input"));
        webElement.sendKeys("Назар Бачище");
        webElement.submit();

        Thread.sleep(3000);
        webDriver.findElements(By.partialLinkText("Назар")).get(1).click();


    }
}
