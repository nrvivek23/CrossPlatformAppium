package com.qa.shopkick.appium;

import io.appium.java_client.AppiumDriver;
import org.apache.log4j.Logger;

/**
 * Created by Manish on 10/28/15.
 */
public class ScreenBaseClass {

    final private static Logger log = Logger.getLogger(ScreenBaseClass.class);
    public static AppiumDriver driver = AbstractTestCase.driver;

    public ScreenBaseClass() {
    }

    public static void pressBack() {
        log.info("pressBack");
        driver.navigate().back();
    }

    public static void waitFor(int seconds) {
        int millSeconds = seconds * 1000;
        try {
            Thread.sleep(millSeconds);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}