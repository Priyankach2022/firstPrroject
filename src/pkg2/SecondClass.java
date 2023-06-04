package pkg2;

import java.util.List;

import org.apache.bcel.generic.Select;
import org.apache.jasper.Options;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

import io.netty.util.internal.ThreadLocalRandom;

public class SecondClass {
	public static void main(String[] args) throws InterruptedException
	{
		//System.out.println("this is my first program");
		System.setProperty("webdriver.chrome.driver","../FirstPoject/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	org.openqa.selenium.WebDriver.Options op=driver.manage();
      // org.openqa.selenium.WebDriver.Options op=driver.manage();      
       org.openqa.selenium.WebDriver.Window w=op.window();
       w.maximize();
     /* WebElement username=driver.findElementByCssSelector("input#email");
      username.sendKeys("priyanka221");
      
    WebElement password=driver.findElementById("pass");
    password.sendKeys("priyanka");
    	
   WebElement loginbutton=driver.findElement(By.name("login"));
   loginbutton.click();*/
   
WebElement createnewaccount=driver.findElementByLinkText("Create New Account");
createnewaccount.click();
Thread.sleep(3000);

WebElement firstname=driver.findElementByCssSelector("input[placeholder='First name']");
firstname.sendKeys("priyanka");

WebElement surname=driver.findElement(By.name("lastname"));
surname.sendKeys("Choudhary");

WebElement mobile=driver.findElement(By.name("reg_email__"));
mobile.sendKeys("9627563077");

WebElement password=driver.findElement(By.cssSelector("input#password_step_input"));
password.sendKeys("priyanka@123");

WebElement drop=driver.findElementById("day");
org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(drop);
//s.selectByVisibleText("15");
s.selectByIndex(14);


WebElement drop1=driver.findElementById("month");
org.openqa.selenium.support.ui.Select s1=new org.openqa.selenium.support.ui.Select(drop1);

s1.selectByValue("8");

WebElement drop3=driver.findElementById("year");
org.openqa.selenium.support.ui.Select s2=new org.openqa.selenium.support.ui.Select(drop3);
s2.selectByVisibleText("2000");

WebElement radio=driver.findElement(By.xpath("//input[@value='2']"));
radio.click();

WebElement signup=driver.findElement(By.name("websubmit"));
signup.click();
}
	
}
