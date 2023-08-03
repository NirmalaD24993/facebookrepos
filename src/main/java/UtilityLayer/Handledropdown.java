package UtilityLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseLayer.BaseClass;

public class Handledropdown extends BaseClass {

	public static void handleDrodown(WebElement wb, String value)
	{
		
		
		Select sel=new Select(wb);
		sel.selectByVisibleText(value);
		
	}
	
	public static void handleRadioButton(List<WebElement> ls, String Gender)
	{
		
		for(WebElement abc:ls)
		{
			if(abc.getText().equalsIgnoreCase(Gender))
					{
				abc.click();
				break;
					}
				
					
		}
	}
	
	
}
