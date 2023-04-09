package com.UtilsLayer;

import org.openqa.selenium.Alert;

import com.BaseLayer.BaseClass;

public class HandleAlert extends BaseClass{
	
	public static void clickOnOKButton() {
		
//		Alert alt = driver.switchTo().alert();
//		alt.accept();
		
		driver.switchTo().alert().accept();
	}
	
	public static void clickOnCancel() {
		
		driver.switchTo().alert().dismiss();
	}
	
	public static String CaptureAlertPopupText() {
		
//		Alert alt = driver.switchTo().alert();
//		String text = alt.getText();
//		return text;
		
		return driver.switchTo().alert().getText();
	}
	
	public static void enterDataInAlert(String value) {
		
		driver.switchTo().alert().sendKeys(value);
	}

}
