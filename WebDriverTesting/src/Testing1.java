import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing1 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for Mozzila Firefox");
		System.out.println("Press 2 for Google Chrome");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.setProperty("webdriver.gecko.driver","/home/dhruv/geckodriver");
			driver=new FirefoxDriver();
			break;
		case 2:
			System.setProperty("webdriver.chrome.driver","/home/dhruv/chromedriver2.42");
			driver=new ChromeDriver();
			break;
		default:
			System.out.println("INVALID CHOICE");
		
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);																																		
		WebElement username=driver.findElement(By.xpath("//input[@id='identifierId']"));
		username.sendKeys("test245588@gmail.com");
		WebElement next=driver.findElement(By.xpath("//span[contains(text(),'Next')]"));
		next.click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("SoftwareTesting1");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='password']"))).sendKeys("SoftwareTesting");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		//System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='GQ8Pzc']"))).getText());
		//driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3 T-I-JW T-I-JO']")).click();
	//Thread.sleep(1000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='z0']/div"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//textarea[@id=':9f']"))).sendKeys("dhruv.pande.07@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=':a2']"))).sendKeys("hello how are you");
		//driver.findElement(By.xpath("//button[@name='ok']")).click();
		driver.findElement(By.xpath("//div[text()='Send']")).click();
	}

}
