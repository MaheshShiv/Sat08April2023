package com.UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.BaseLayer.BaseClass;

public class HandleDropDown extends BaseClass {
	
	public static void selectByVisibletext(WebElement wb, String value) {
		
//		Select sl = new Select(wb);
//		sl.selectByVisibleText(value);
		new Select(wb).selectByVisibleText(value);
	}
	
	public static void selectByValue(WebElement wb, String value) {
		
		new Select(wb).selectByValue(value);
	}
	
	public static void selectByIndex(WebElement wb, int index) {
		
		new Select(wb).selectByIndex(index);
	}
	
	public static String captureFirstSelectedOption(WebElement wb) {
		
		return new Select(wb).getFirstSelectedOption().getText();	
		
//		Select sel = new Select(wb);
//		WebElement wb1 = sel.getFirstSelectedOption();
//		String str = wb1.getText();
//		return str;
	}
	
	public static int getCountDDValues(WebElement wb) {
		
		return new Select(wb).getOptions().size();
		
//		Select sel = new Select(wb);
//		List<WebElement> ls = sel.getOptions();
//		int size = ls.size();
//		return size;
	}
	
	public static void printAllValues(WebElement wb) {
		
//		Select sl = new Select(wb);
//		List<WebElement> ls = sl.getOptions();
		List<WebElement> ls = new Select(wb).getOptions();
		for(WebElement allvalues : ls)
		{
			String text = allvalues.getText();
			System.out.println(text);
		}
	}
	
	public static boolean checkSpecificValue(WebElement wb, String value) {
		
		List<WebElement> ls = new Select(wb).getOptions();
		for(WebElement list : ls) 
		{
			if(list.getText().equalsIgnoreCase(value)) 
			{
				return true;
			}
		}
		return false;
		
	}


}
