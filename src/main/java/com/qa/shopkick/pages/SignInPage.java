package com.qa.shopkick.pages;

import com.qa.shopkick.utils.AbstractPage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends AbstractPage {
    final private static Logger log = Logger.getLogger((SignInPage.class));
    //@iOSFindBy()
    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/title_text\").text(\"Choose your login method\").className(\"android.widget.TextView\")")
    @iOSFindBy(uiAutomator = ".staticTexts()[\"Sign in or sign up\"]")
    private static WebElement signInMethodText;

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/button_text\").text(\"FACEBOOK\")")
    @iOSFindBy(uiAutomator = ".buttons()[\"Facebook\"]")
    private static MobileElement signInFacebookSignIn;

    public static boolean isFacebookLoginAvail() {
        if (signInFacebookSignIn.isDisplayed()) {
            return true;
        } else {
            return false;
        }
    }

    public static void clicksignInFacebookSignIn() {
        signInFacebookSignIn.click();
        log.info("signInFacebookSignIn.click()");
        PageFactory.initElements(new AppiumFieldDecorator(driver), new DidYouKnowPage());
        PageFactory.initElements(new AppiumFieldDecorator(driver), new LandingPage());
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/button_text\").text(\"GOOGLE\")")
    @iOSFindBy(uiAutomator = ".buttons()[\"Google\"]")
    private static WebElement signInGooglePlusSignIn;

    public static void clicksignInGooglePlusSignIn() {
        signInGooglePlusSignIn.click();
        log.info("signInGooglePlusSignIn.click()");
        PageFactory.initElements(new AppiumFieldDecorator(driver), new LandingPage());
        PageFactory.initElements(new AppiumFieldDecorator(driver), new DidYouKnowPage());
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/button_text\").text(\"EMAIL\")")
    @iOSFindBy(uiAutomator = ".buttons()[\"Email\"]")
    private static WebElement signInEmailSignIn;

    public static void clicksignInEmailSignIn() {
        signInEmailSignIn.click();
        log.info("signInEmailSignIn.click()");
        log.info("Click signInEmailSignIn");
        PageFactory.initElements(new AppiumFieldDecorator(driver), new EmailSignInPage());
        PageFactory.initElements(new AppiumFieldDecorator(driver), new EmailSignUp());
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/facebook_flow_text\").text(\"We will never post anything without your permission.\")")
    private static WebElement signInFacebookFlowText;

}
