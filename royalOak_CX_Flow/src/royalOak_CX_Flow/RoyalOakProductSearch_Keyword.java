package royalOak_CX_Flow;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalOakProductSearch_Keyword {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.royaloakindia.com/");
		driver.manage().window().maximize();
		Set<Cookie> cookielist = driver.manage().getCookies();
		for (Cookie S1:cookielist) 
		{
		  System.out.println("Avaiable cookies in the website are" + "  " + S1);	
		}
		
		String S1=driver.getTitle();
		System.out.println("The Title of the website is " + "  " + S1);
		WebElement Egmail=driver.findElement(By.cssSelector("#__next > main > div:nth-child(3) > div > header > div.py-2 > div > div > div.w-full.items-center.justify-end.px-4.grid.grid-cols-4 > div.xs\\:hidden.lg\\:flex.w-full.items-center.justify-end.space-x-4.md\\:pr-16.lg\\:pr-0 > div.xs\\:absolute.top-7.right-0.lg\\:top-0.lg\\:right-0.lg\\:relative.z-20 > div > div.flex.cursor-pointer > span > svg"));
		Egmail.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[2]/div/div/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("royaloaktesting712@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("royaloaktesting01@");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[2]/div/div/div[2]/div/form/div[3]/div/button")).click();
		System.out.println("Login was successful");
		Thread.sleep(1000);
		WebElement W1= driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div/header/div[1]/div/div/div[3]/div[2]/form/input"));
		W1.sendKeys("single seater recliner");
		W1.submit();
		//Select SC = new Select (W1);
        //SC.selectByVisibleText("Table");
		JavascriptExecutor Js= (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0, 750)");
		WebElement SelectedPro =driver.findElement(By.xpath("//*[@id=\"products_10\"]/div/div[1]/a/img"));
	    String S2 = SelectedPro.getAccessibleName();
	    System.out.println("The Selected product is " + " " + S2);
	    SelectedPro.click();
	    //driver.navigate().refresh();
	    //Thread.sleep(500);
	    System.out.println("The Refreshing of the curren window is successful");
	    String S4= driver.getCurrentUrl();
	    System.out.println("The current URl is " + "  " + S4 );
	    
	    WebElement W2 =driver.findElement(By.xpath("//*[@id=\"__next\"]/main/footer/div/div[2]/div[2]/div/h3"));
	    //Thread.sleep(500);
	    /*String S3=W2.getText(); 
	    System.out.println(S3);*/
	    String S5 =W2.getText();
	    System.out.println(S5);
	    List <WebElement> frames = driver.findElements(By.xpath("//iframe | //frame"));
		System.out.println(frames.size());
		for (WebElement SU:frames)
		{
		 System.out.println(SU);	
			
		}
		
		driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
		Js.executeScript("window.scrollBy(0, 500)");
		WebElement E1 =driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[5]/button[1]"));
	    String Su=E1.getText();
		System.out.println(Su);
		if(Su.contains("Add to Cart")) 
		{
		System.out.println("The stock is availbale");	
		}
		else 
		{
			System.out.println("The stock is not availbale");	
		}
		E1.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[6]/span")).click();
		Thread.sleep(500);
		WebElement PIN = driver.findElement(By.xpath("//*[@id=\"pincode\"]"));
		PIN.clear();
		//driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("500032");
		PIN.sendKeys("521456");
		//Thread.sleep(500);
		WebElement su = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div[1]/div/div/div/div/div/div/form/div/div/div[2]/button"));
		su.click();
		WebElement ESTD1= driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[7]/ul/li[1]"));
		WebElement ESTD2= driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[7]/ul/li[2]"));
		String E5=ESTD1.getText();
		String E6=ESTD2.getText();
		System.out.println(E5);
		System.out.println(E6);
		driver.navigate().refresh();
		
		Thread.sleep(500);
		Js.executeScript("window.scrollBy(0, -500)");
		WebElement u=driver.findElement(By.cssSelector("#__next > main > div:nth-child(3) > div > header > div.py-2 > div > div > div.w-full.items-center.justify-end.px-4.grid.grid-cols-4 > div.xs\\:hidden.lg\\:flex.w-full.items-center.justify-end.space-x-4.md\\:pr-16.lg\\:pr-0 > div.xs\\:absolute.top-7.xs\\:right-16.lg\\:left-auto.lg\\:top-0.lg\\:right-0.lg\\:relative.z-20 > div > button > span > span"));
		u.click();
		WebElement U=driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[2]/div/div/div[2]/div/div[4]/button[1]"));
		U.click();
		System.out.println("Now we are in view cart page");
		//driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/section/div/div/div[2]/div[2]/div[4]/button"));
		cart.click();
		System.out.println("Now we are in Checkout Page");
		//driver.navigate().refresh();
		
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/section/div/div/div[2]/div[2]/div[4]/button")).click();
		WebElement address = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[3]/div/div[1]/div/div[1]/div/div[1]/div[3]/div"));
		String CustomerAddress=address.getText();
		System.out.println("Customershipping address is :" + "  " +CustomerAddress);
		Thread.sleep(500);
		
		Scanner Sc= new Scanner(System.in);
		System.out.println("Customer payment Method as per his desire..............");
		
		String PaymentOption =Sc.next();
		
		if (PaymentOption.contains("UPI / Wallet / Pay Later / Net Banking / American Express / Corporate Card")) 
		{
			driver.findElement(By.xpath("//*[@id=\"flexRadioDefault1\"]")).click();
		}
		else 
		{
			driver.findElement(By.xpath("/html/body/div[1]/main/div[3]/div/div[1]/div/div[1]/div/div[7]/div[3]/div[2]/form/input")).click();
		}
		WebElement paymentConfirmation=driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[3]/div/div[1]/div/div[1]/div/div[8]/button"));
		paymentConfirmation.click();
	}

}


	


