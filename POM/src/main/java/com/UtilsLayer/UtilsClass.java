package com.UtilsLayer;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseLayer.BaseClass;

public class UtilsClass extends BaseClass {
	
	public static void sendKeys(WebElement wb, String value) {
		
		if(wb.isDisplayed() && (wb.isEnabled())) 
		{
			wb.sendKeys(value);
		}
	}
	
	public static void clickButton(WebElement wb) {
		
		if(wb.isDisplayed() && (wb.isEnabled())) 
		{
			wb.click();
		}
	}
	
	public static void clcikOnRadioButton(List<WebElement> ls, String name) {
		
		for(WebElement list : ls)
		{
			if(list.getAttribute("id").equals(name))
			{
				if(!list.isSelected())
				{
					list.click();
				}
			}
		}		
	}
	
	public static void clcikOnCkeckBox(List<WebElement> ls, String value) {
		
		for(WebElement list : ls) 
		{
			if(list.getText().equalsIgnoreCase(value))
			{
				list.click();
			}
		}
	}
	
	public static WebElement explicitlyWait(By by, Long seconds) {
		
		WebDriverWait wait = new WebDriverWait(driver, seconds);
		
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	
	
	

}
