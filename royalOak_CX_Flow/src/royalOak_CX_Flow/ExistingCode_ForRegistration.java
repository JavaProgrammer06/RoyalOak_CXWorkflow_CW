package royalOak_CX_Flow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class ExistingCode_ForRegistration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royaloakindia.com/");
		driver.manage().window().maximize();
        WebElement Register = driver.findElement(By.cssSelector("#__next > main > div:nth-child(3) > div > header > div.py-2 > div > div > div.w-full.items-center.justify-end.px-4.grid.grid-cols-4 > div.xs\\:hidden.lg\\:flex.w-full.items-center.justify-end.space-x-4.md\\:pr-16.lg\\:pr-0 > div.xs\\:absolute.top-7.right-0.lg\\:top-0.lg\\:right-0.lg\\:relative.z-20 > div > div.flex.cursor-pointer > span > svg"));
        Thread.sleep(3000);
        Register.click();
        
        
		driver.findElement(By.cssSelector("#__next > main > section > div.xs\\:p-2.fixed.top-0.right-0.h-screen.w-full.max-w-\\[500px\\].overflow-y-auto.bg-white.transition-all.duration-200.sm\\:px-8.md\\:p-12.translate-x-0 > div > div > div:nth-child(2) > div > form > div.flex.flex-col.space-y-16 > div.text-base.font-thin.text-center > a")).click();
		Thread.sleep(3000);
		WebElement E1 = driver.findElement(By.xpath("//input[@id=\"firstname\" or @name=\"firstname\"]"));
		Thread.sleep(3000);
		E1.sendKeys("uma");
		WebElement E2 = driver.findElement(By.name("lastname"));
		boolean lastname = E2.isEnabled();
		if (lastname == true)
		 {
			 E2.sendKeys("pallapu");
		 }
		 else
		 {
			 System.out.println(" the text box is not Enabled"); 
		 }
		  
		  WebElement mobileNumber =driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
		  mobileNumber.sendKeys("8247478456");
		  driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("umamaheswaridaddy22@gmail.com");
		  WebElement E3 = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		  E3.sendKeys("UmaAnu99@");
		  
		  driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/form/div[5]/div/button")).click();
		  
		  
		  System.out.println(" Registarion was Successful");
		  System.out.println(" Automation script executed successfully");
		  
		  


	}

}
