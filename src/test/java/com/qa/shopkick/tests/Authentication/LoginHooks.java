package com.qa.shopkick.tests.Authentication;

import com.qa.shopkick.pages.*;
import com.qa.shopkick.utils.AbstractTest;
import com.qa.shopkick.utils.CustomHooks;

public class LoginHooks extends AbstractTest {

    public static void loginWithFacebook() {
        //from first use flow log into facebook
        SignInPage.clickFacebookSignInButton();

        if (platformType.equalsIgnoreCase("IOS")) {
            if (MicrophonePermissionPage.isMicroPhonePermissionRequired()) {
                //if iOS and if mic permission is asked, give the permission
                MicrophonePermissionPage.clickOKButton();
            }
        }

        FacebookSignInPage.typeEmailANDROID("cm.manish@yahoo.com");
        FacebookSignInPage.typePasswordANDROID("relaxManish");
        FacebookSignInPage.clickLogInANDROID();

    }

    public static void loginWithGoogleplus() {
        CustomHooks.dismissPotHoleError();
        //tap on the 'Guest' button to open left nav bar
        SignInPage.clicksignInGooglePlusSignInButton();
        CustomHooks.dismissMultiLoginMessage();
    }

    public static void loginWithEmail() {
        CustomHooks.dismissPotHoleError();

        //User logs in via email
        SignInPage.clickSignInEmailSignInButton();

        //Element issues, using two different methods to sign in

        if (platformType.equalsIgnoreCase("Android")) {

            //add email address
            EmailSignInPage.typeEmailANDROID("a@b.com");
            //add password
            EmailSignInPage.typePasswordANDROID("aaaaaa");
        } else {
            EmailSignInPage.clickAndEnterEmailIOS("a@b.com");

            EmailSignInPage.clickAndEnterPasswordIOS("aaaaaa");
        }

        EmailSignInPage.clickLoginButton();

        CustomHooks.dismissMultiLoginMessage();
    }

    public static void GoThroughFirstUse() {
        //Go through the first use flow
        FirstUseDealsEducationPage.clickGetStartedButton();

        if (platformType.equals("IOS")) {
            CountryPickerPage.clickCountryUSA();
            CountryPickerPage.clickNextButton();
        }
        //Redeem your kicks for rewards screen
        FirstUseWalkinEducationPage.clickNextButton();

        //User has to tap on pick a reward
        FirstUseRewardsEducationPage.clickPickARewardButton();

        //Pick default reward
        RewardsPickerPage.clickSelectRewardButton();

        //Click on Login button
        FirstUseRegistrationIntroPage.clickLoginButton();
    }
}
