package mock3jun;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Organizations {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://demo.vtiger.com/vtigercrm");
        driver.findElement(By.xpath("//button[text()='Sign in']")).click();
        driver.findElement(By.id("appnavigator")).click();
        WebElement ele=  driver.findElement(By.id("SALES_modules_dropdownMenu"));
		  Actions a= new Actions(driver);
    a.moveToElement(ele).perform();
    Thread.sleep(2000);
      WebElement ele1=  driver.findElement(By.xpath("(//span[text()=' Organizations'])[2]"));
        
        Actions b=new Actions(driver);
        b.moveToElement(ele1).click();
        b.perform();
        driver.findElement(By.id("Accounts_listView_basicAction_LBL_ADD_RECORD")).click();
        driver.findElement(By.id("Accounts_editView_fieldName_accountname")).sendKeys("Qspider");
        driver.findElement(By.id("Accounts_editView_fieldName_phone")).sendKeys("12345678909");
        driver.findElement(By.id("Accounts_editView_fieldName_fax")).sendKeys("12345");
        driver.findElement(By.id("Accounts_editView_fieldName_otherphone")).sendKeys("98765123");
        driver.findElement(By.id("Accounts_editView_fieldName_email1")).sendKeys("shendagenana1814@gmail.com");
        driver.findElement(By.id("Accounts_editView_fieldName_website")).sendKeys("www qspider.com");
        driver.findElement(By.id("Accounts_editView_fieldName_tickersymbol")).sendKeys("smiley");
        driver.findElement(By.id("account_id_display")).sendKeys("10");
        driver.findElement(By.id("Accounts_editView_fieldName_employees")).sendKeys("20");
        driver.findElement(By.id("Accounts_editView_fieldName_email2")).sendKeys("shendagenana1814@gmail.com");
 
       
	}

}
