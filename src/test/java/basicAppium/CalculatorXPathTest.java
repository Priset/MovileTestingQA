package basicAppium;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class CalculatorXPathTest {
    AppiumDriver phone;
    @BeforeEach
    public void openApp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","Tubo");
        capabilities.setCapability("platformVersion","9.0");
        capabilities.setCapability("appPackage","com.android.calculator2");
        capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","uiautomator2");

        phone = new AndroidDriver(new URL(" http://192.168.50.144:4723/wd/hub"),capabilities);
        phone.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterEach
    public void closeApp(){
        phone.quit();
    }

    @Test
    public void verifyAddTwoNumber() throws InterruptedException {
        // click  5
        phone.findElement(By.xpath("//android.widget.Button[@text='5']")).click();
        // click +
        phone.findElement(By.xpath("//android.widget.Button[@text='+']")).click();
        // click 7
        phone.findElement(By.xpath("//android.widget.Button[@text='7']")).click();
        // click  =
        phone.findElement(By.xpath("//android.widget.Button[@content-desc=\"equals\"]")).click();
         // verification  expectedResult 12 = actualResult 12
        Thread.sleep(5000);
        String expectedResult="12";
        String actualResult= phone.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.android.calculator2:id/result\"]")).getText();
        Assertions.assertEquals(expectedResult,actualResult,"ERROR la suma esta mal");
    }



}
