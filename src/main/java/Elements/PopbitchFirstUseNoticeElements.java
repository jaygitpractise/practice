package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;




public class PopbitchFirstUseNoticeElements {

	WebDriver driver_PopbitchFirstUseNoticeElements;														//driver_PopbitchFirstUseNoticeElements
	
	//Popbitch First use Notice elements finding
	By green_tab= By.className("triangle__3TvaE");																	//green tab
	By Nav_To_First_Use_Stories= By.xpath("//*[@id=\"menu-item-35878\"]/a");								//stories
	By Nav_To_First_Use_PremiumStory= By.xpath("//*[@id=\"post-37523\"]/div/div[2]/header/h2/a");	//first premium story
	By First_use_Login=By.id("btn_login");							//login to agate
	By First_Use_CreateWallet= By.id("btn_cta");									//create wallet
	By First_Use_WhatIsAgate= By.linkText("What is Agate?");												//what is Agate
	
	


	public PopbitchFirstUseNoticeElements(WebDriver driver_PopbitchFirstUseNoticeElements2) {							//constructor
		this.driver_PopbitchFirstUseNoticeElements= driver_PopbitchFirstUseNoticeElements2;
		}
	
	public void click_on_green_tab() throws InterruptedException {
		Thread.sleep(2000);
		WebElement svgobject = driver_PopbitchFirstUseNoticeElements.findElement(green_tab);
		Actions builder = new Actions(driver_PopbitchFirstUseNoticeElements);
		builder.click(svgobject).build().perform();
						
	}
	
	public void Popbitch_premium_Story_create_wallet__Displayed()													//Check if all elements displayed on First use notice
	{
		Boolean Pop_First_Use_Notice_Create_Wallet_Displayed = driver_PopbitchFirstUseNoticeElements.findElement(First_Use_CreateWallet).isDisplayed();
		if(Pop_First_Use_Notice_Create_Wallet_Displayed==true)
		{
			System.out.println("create wallet button present");
		}
		else
		{
			
			System.out.println("create wallet button not present, please check ");
			
		}
		}
	
	
	
// Login in to wallet		
		public void Click_On_Popbitch_First_Use_Notice_Login() throws InterruptedException {					//Login from popbitch First use Notice	
		Thread.sleep(5000);
		//Scoll to the second half of Reg page
		JavascriptExecutor js = (JavascriptExecutor)driver_PopbitchFirstUseNoticeElements;
		js.executeScript("window.scrollBy(0,700)");
		Thread.sleep(3000);	
		WebElement frame = driver_PopbitchFirstUseNoticeElements.findElement(By.id("iframe__inpage_notices"));		
		driver_PopbitchFirstUseNoticeElements.switchTo().frame(frame);
		Thread.sleep(4000);
		Thread.sleep(4000);
		WebElement Login = (new WebDriverWait(driver_PopbitchFirstUseNoticeElements, 20))
				.until(ExpectedConditions.elementToBeClickable(By.id("btn_login")));		
		Login.click();		
		driver_PopbitchFirstUseNoticeElements.switchTo().defaultContent();
		}
	
	
	
// Create wallet 	
		public void Click_On_Popbitch_First_Use_Notice_Create_Wallet() throws InterruptedException {										//Register from popbitch First use Notice		
		Dimension d = new Dimension(1382,744); 
		//Resize the current window to the given dimension		
		driver_PopbitchFirstUseNoticeElements.manage().window().setSize(d); 		
		WebElement iframe__inpage_notices = driver_PopbitchFirstUseNoticeElements.findElement(By.id("iframe__inpage_notices"));		
		driver_PopbitchFirstUseNoticeElements.switchTo().frame(iframe__inpage_notices);			
		WebElement element = driver_PopbitchFirstUseNoticeElements.findElement(By.id("btn_cta"));
		/*Actions actions = new Actions(driver_PopbitchFirstUseNoticeElements);
		actions.moveToElement(element).sendKeys(Keys.RETURN).perform();	*/
		element.click();
		Thread.sleep(4000);
		WebElement element1 = driver_PopbitchFirstUseNoticeElements.findElement(By.id("btn_cta"));
		element1.click();
		driver_PopbitchFirstUseNoticeElements.switchTo().defaultContent();
		}
		

//what is agate 
	public void Click_On_Popbitch_First_Use_Notice_What_Is_Agate() {	
		driver_PopbitchFirstUseNoticeElements.findElement(First_Use_WhatIsAgate).click();
		}

	
	
	
	
	
	
	
	
	
	
	
}
