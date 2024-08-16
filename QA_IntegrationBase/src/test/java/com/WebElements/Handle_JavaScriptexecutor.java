package com.WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handle_JavaScriptexecutor {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		
		
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

	  //To find and click a elemet using java scriptexecutor
		
	//	js.executeScript("document.getElementById('bmwcheck').click()");
		
		//To highlight a element using JavascriptExecutor
		
		//js.executeScript("document.getElementsByTagName('label')[3].style.border='2px red dashed'");
		
		//Using selenium driver highligh the element 
		
		
		WebElement Sele=driver.findElement(By.xpath("(//label[@for='bmw'])[2]"));
		Sele.click();
		js.executeScript("arguments[0].style.border='2px dashed red';", Sele);
		
		
		WebElement dr=driver.findElement(By.id("autosuggest"));
		dr.sendKeys("rakesh");
		js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background:yellow');", dr);
		//js.executeScript("arguments[0].setAttribute('style','border:5px red solid;background:yellow');", dr);
	}

}

