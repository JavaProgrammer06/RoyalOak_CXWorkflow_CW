package royalOak_CX_Flow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalOak_login2WithMailID_Password {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royaloakindia.com/");
		driver.manage().window().maximize();
		WebElement E5=driver.findElement(By.cssSelector("#__next > main > div:nth-child(3) > div > header > div.py-2 > div > div > div.w-full.items-center.justify-end.px-4.grid.grid-cols-4 > div.xs\\:hidden.lg\\:flex.w-full.items-center.justify-end.space-x-4.md\\:pr-16.lg\\:pr-0 > div.xs\\:absolute.top-7.right-0.lg\\:top-0.lg\\:right-0.lg\\:relative.z-20 > div > div.flex.cursor-pointer > span > svg"));
		E5.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[2]/div/div/div[1]/a[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("kirankproyaloak@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Goodgoing@3");
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[2]/div/div/div[2]/div/form/div[3]/div/button")).click();
		
		

	}

}
