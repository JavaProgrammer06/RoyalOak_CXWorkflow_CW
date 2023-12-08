package royalOak_CX_Flow;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.*;
public class RoyalOakWebSite_ProductSearch {

	public static void main(String[] args) throws InterruptedException {
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
		WebElement W1= driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div/header/div[1]/div/div/div[3]/div[2]/form/input"));
		W1.sendKeys("office");
		W1.submit();
		//Select SC = new Select (W1);
        //SC.selectByVisibleText("Table");
		JavascriptExecutor Js= (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0, 1000)");
		WebElement SelectedPro =driver.findElement(By.xpath("//*[@id=\"products_10\"]/div/div[1]/a/img"));
	    String S2 = SelectedPro.getAccessibleName();
	    System.out.println("The Selected product is " + " " + S2);
	    SelectedPro.click();
	    driver.navigate().refresh();
	    Thread.sleep(500);
	    System.out.println("The Refreshing of the curren window is successful");
	    String S4= driver.getCurrentUrl();
	    System.out.println("The current URl is " + "  " + S4 );
	    //JavascriptExecutor Js1= (JavascriptExecutor) driver;
	    //Js1.executeScript("window.scrollBy(0,1500)");
	    WebElement W2 =driver.findElement(By.xpath("//*[@id=\"__next\"]/main/footer/div/div[2]/div[2]/div/h3"));
	    Thread.sleep(500);
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
		/*WebElement U = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[5]/button[1]"));
	    String U2=U.getText();
	    System.out.println(U2);
	    U.click();*/
		//driver.switchTo().frame("dummy-iframe");
        //driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[5]/button[1]"));
        //Thread.sleep(500);
	}

}
