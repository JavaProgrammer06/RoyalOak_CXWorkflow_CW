package royalOak_CX_Flow;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RoyalOak_Login_CurrentWebsite {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royaloakindia.com/");
		driver.manage().window().maximize();
		WebElement E5=driver.findElement(By.cssSelector("#__next > main > div:nth-child(3) > div > header > div.py-2 > div > div > div.w-full.items-center.justify-end.px-4.grid.grid-cols-4 > div.xs\\:hidden.lg\\:flex.w-full.items-center.justify-end.space-x-4.md\\:pr-16.lg\\:pr-0 > div.xs\\:absolute.top-7.right-0.lg\\:top-0.lg\\:right-0.lg\\:relative.z-20 > div > div.flex.cursor-pointer > span > svg"));
		E5.click();
        driver.findElement(By.xpath("//*[@id=\"mobile\"]")).sendKeys("6366430535");
        driver.findElement((By.xpath("//*[@id=\"__next\"]/main/section/div[2]/div/div/div[2]/div/form/div[2]/div[1]/button"))).click();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the Otp which you have received in the input boxes.......");
        String opt=Sc.nextLine();
       
        
	}

}
