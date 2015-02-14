package com.qa.shopkick.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.qa.shopkick.utils.AbstractPage;

public class LearnHowGetMoreKicks extends AbstractPage{
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/app_screen_header\").text(\"Get more kicks\")")
	private static WebElement getMoreKicksHeader;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/app_screen_header\").text(\"Use kicks to get gift cards in shopkick.\")")
	private static WebElement getMoreKicksTutorial;

	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/tutorial_button_walkin\")")
	private static WebElement walkinTutorialButton;
	
	public static void clickOnWalkinTutorial(){
		walkinTutorialButton.click();
		PageFactory.initElements(new AppiumFieldDecorator(driver),new WalkInTutorialPage());
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/tutorial_button_scan\")")
	private static WebElement scanTutorialButton;
	
	public static void clickOnScanTutorial(){
		scanTutorialButton.click();
		PageFactory.initElements(new AppiumFieldDecorator(driver),new ScanTutorialPage());
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/tutorial_button_purchases\")")
	private static WebElement purchasesTutorialButton;
	
	public static void clickOnPurchaseTutorial(){
		purchasesTutorialButton.click();
		PageFactory.initElements(new AppiumFieldDecorator(driver),new PurschasKicksPage());
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().resourceId(\"com.shopkick.app:id/tutorial_button_invite\")")
	private static WebElement inviteTutorialButton;
	
	public static void clickOnInviteTutorial(){
		inviteTutorialButton.click();
		PageFactory.initElements(new AppiumFieldDecorator(driver),new InviteAndGetKicksPage());
	}
}
