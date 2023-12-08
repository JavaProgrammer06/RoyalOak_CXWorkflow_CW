package royalOak_CX_Flow;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_module {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bing.com/ck/a?!&&p=636fd98388361b52JmltdHM9MTcwMTM4ODgwMCZpZ3VpZD0wNmU0YjZiNi01YzRhLTZhM2EtMzY3OC1hNTZjNWRlNzZiMzImaW5zaWQ9NTI2NQ&ptn=3&ver=2&hsh=3&fclid=06e4b6b6-5c4a-6a3a-3678-a56c5de76b32&psq=royaloak+furniture+india&u=a1aHR0cHM6Ly93d3cucm95YWxvYWtpbmRpYS5jb20v&ntb=1");
		String E1=driver.getTitle();
		System.out.println(E1);
		driver.navigate().to("https://www.bing.com/aclk?ld=e8mxJXaQv6jptMZ3XWyJ_YDTVUCUwDk_ejOkfrDzc3uBW7y9i7H6w2tFf-bQx69PjXtFXs-X7L1q6NdH1A5n-HFalRvFQm7iFbVJmKgUQXYAmj2Yecc1ooYMG1eDHmQLXR_ayno6ebFPn7Yyw73sAvntI8T-Dl56mJMFsKuMg54Zjok3ZiSnAfGNMCE5Abkrf1uBWS4g&u=aHR0cHMlM2ElMmYlMmZ3d3cucGVwcGVyZnJ5LmNvbSUyZmNhdGVnb3J5JTJmcmVjbGluZXJzLmh0bWwlM2Ztc2Nsa2lkJTNkNDIwMDViZWVjMWY4MTNiNWQzMTQzZTg0Njc3MTNkNjglMjZ1dG1fc291cmNlJTNkYmluZyUyNnV0bV9tZWRpdW0lM2RjcGMlMjZ1dG1fY2FtcGFpZ24lM2RQRl9GdXJuaXR1cmVfR2VuZXJpY19NYXkyMyUyNnV0bV90ZXJtJTNkZnVybml0dXJlJTI1MjBpbmRpYSUyNnV0bV9jb250ZW50JTNkRnVybml0dXJlX1BocmFzZQ&rlid=42005beec1f813b5d3143e8467713d68&ntb=1&ntb=1");
		String E2=driver.getTitle();
		System.out.println(E2);
		driver.navigate().back();
		driver.manage().window().maximize();
		String E4 =driver.getTitle();
		driver.navigate().refresh();
		System.out.println(E4);
		
		WebElement E3=driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[2]/div/header/div[1]/div/div/div[2]/a/img"));
	    String S1=E3.getTagName();
	    Dimension S2=E3.getSize();
	    System.out.println(" Tag of the Logo was" + "    " +S1);
	    System.out.println("Dimensions of the Logo was"+ S2);
	    Thread.sleep(500);
	    WebElement E5=driver.findElement(By.cssSelector("#__next > main > div:nth-child(3) > div > header > div.py-2 > div > div > div.w-full.items-center.justify-end.px-4.grid.grid-cols-4 > div.xs\\:hidden.lg\\:flex.w-full.items-center.justify-end.space-x-4.md\\:pr-16.lg\\:pr-0 > div.xs\\:absolute.top-7.right-0.lg\\:top-0.lg\\:right-0.lg\\:relative.z-20 > div > div.flex.cursor-pointer > span > svg"));
		E5.click();
		driver.findElement(By.xpath("//*[@id=\"__next\"]/main/section/div[2]/div/div/div[2]/div/form/div[2]/div[2]/a")).click();
		Thread.sleep(500);
        driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys("first name");
        driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys("last name");
        WebElement E6= driver.findElement(By.cssSelector("#__next > main > div:nth-child(5) > div > form > div:nth-child(2) > div"));
        String S3=E6.getText();
        System.out.println("The country code of the mobile number is " + "  " + S3);
        if(S3.contains("+91")) 
        {
        	System.out.println("The country code is correct");
        }
        else
        {
        	System.out.println("The country code is not correct");
        }
        
       
        WebElement E8=driver.findElement(By.xpath("/html/body/div[1]/main/div[4]/div/form/div[2]/div/div/div[1]/input"));
        Thread.sleep(500);
        E8.sendKeys("8247478456");
       
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("umamaheswaridaddy51@gmail.com");
        WebElement E7=driver.findElement(By.xpath("//*[@id=\"password\"]"));
        String S4="Anusha@12";
        E7.sendKeys(S4);
        if(S4.length()>= 8) 
        {
        	System.out.println("The password is according the password policy");
        
        }
        else 
        {
        	System.out.println("The password is not according the policy");
        }
        driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div[4]/div/form/div[6]/div/button")).click();
        System.out.println("Registration module is working fine");
        //String alertMSG =driver.switchTo().alert().getText();
        //System.out.println(alertMSG);
        
	}

}
