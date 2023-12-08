package royalOak_CX_Flow;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Royal_Staging {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("http://staging.royaloakindia.com/");
		driver.manage().window().maximize();
		String E1=driver.getTitle();
		System.out.println(E1);
		driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[2]/section[2]/a")).click();
		WebElement E2=driver.findElement(By.xpath("//*[@id=\"modal-content-2\"]/div/div/div/div[2]/div[1]/div/input"));
		Thread.sleep(500);
		System.out.println(E2.getText());
		E2.sendKeys("uma");
		WebElement E3=driver.findElement(By.xpath("//*[@id=\"modal-content-2\"]/div/div/div/div[2]/div[2]/div/input"));
		System.out.println(E3.getText());
		E3.sendKeys("mailid");
		WebElement E4=driver.findElement(By.xpath("//*[@id=\"modal-content-2\"]/div/div/div/div[2]/div[3]/div/input"));
		System.out.println(E4.getTagName());
		E4.sendKeys("8247478456");
		driver.findElement(By.xpath("//*[@id=\"modal-content-2\"]/div/div/div/div[2]/div[4]/div/input")).sendKeys("pincode");
		driver.findElement(By.xpath("//*[@id=\"modal-content-2\"]/div/div/div/div[2]/div[5]/div/input")).sendKeys("City name");
		driver.findElement(By.xpath("//*[@id=\"modal-content-2\"]/div/div/div/div[2]/div[6]/div/textarea")).sendKeys("uashjshdhsiuhskjxkjsdkjsdasyuyeriolzkkxkjzhjxzhjxjhkjdsjdjlsklajsjas");
		driver.findElement(By.xpath("//*[@id=\"html-body\"]/div[3]/aside[2]/div[2]/footer/button")).click();
		System.out.println("The Callback request Tab was sucessfully functioning");

	}

}
