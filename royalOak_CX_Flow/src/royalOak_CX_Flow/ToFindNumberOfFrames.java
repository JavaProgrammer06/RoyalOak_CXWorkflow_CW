package royalOak_CX_Flow;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFindNumberOfFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.navigate().to("https://www.royaloakindia.com/royaloak-leo-office-table-1-4-m-with-trevo-computer-chair.html");
		driver.navigate().to("https://www.royaloakindia.com/royaloak-zara-wardrobe-3-door-3.html");
		//driver.get("https://www.royaloakindia.com/royaloak-riyu-bench-sheesham-wood.html");
		driver.manage().window().maximize();
		JavascriptExecutor Js= (JavascriptExecutor) driver;
		Js.executeScript("window.scrollBy(0, 500)");
		List <WebElement> frames = driver.findElements(By.xpath("//iframe | //frame"));
		System.out.println(frames.size());
		//driver.switchTo().frame("No content");
		
		WebElement E1 =driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[5]/button[1]"));
	    String S1=E1.getText();
		System.out.println(S1);
		if(S1.contains("Add to Cart")) 
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
		driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("201301");
		Thread.sleep(500);
		//driver.findElement(By.xpath("//*[@id=\"pincode\"]")).sendKeys("032");
		//Thread.sleep(1000);
		WebElement su = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[1]/div[1]/div/div/div/div/div/div/form/div/div/div[2]/button"));
		su.click();
		WebElement ESTD1= driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[7]/ul/li[1]"));
		WebElement ESTD2= driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[7]/ul/li[2]"));
		String E5=ESTD1.getText();
		String E6=ESTD2.getText();
		System.out.println(E5);
		System.out.println(E6);
		System.out.println("The product availble for UP");
		//List <WebElement> ESTD = driver.findElements(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/div[1]/div/section/div/div[2]/div[2]/div/div/div[7]/ul/li"));
        //String Sname =ESTD.toString();
        //System.out.println(Sname);
	}

}
