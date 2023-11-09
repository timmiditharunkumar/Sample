import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicTables {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();

		driver.findElement(By.id("input-username")).sendKeys("demo");
		driver.findElement(By.id("input-password")).sendKeys("demo");
		driver.findElement(By.xpath("//div[@class='card-body']/descendant::div/button")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("btn-close"))).click();
//		driver.findElement(By.className("btn-close")).click();

		driver.findElement(By.xpath("//li[@id='menu-sale']/a")).click();
		driver.findElement(By.xpath("(//ul[@id='collapse-4']/li/a)[1]")).click();

		List<WebElement> Statuses = driver
				.findElements(By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr/td[5]"));

		for (int i = 0; i < Statuses.size(); i++) {
			if (Statuses.get(i).getText().equals("Canceled")) {
				int index = i + 1;
//				driver.findElement(
//						By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[" + index + "]/td[1]")).click();
				wait.until(ExpectedConditions.visibilityOfElementLocated(
						By.xpath("//table[@class='table table-bordered table-hover']/tbody/tr[" + index + "]/td[1]")))
						.click();
			}
		}
		
		String text = driver.findElement(By.cssSelector(".col-sm-6.text-end")).getText();
		int totalPages = Integer.parseInt(text.substring(text.indexOf("(")+1, text.indexOf("Pages")-1));
		
		for(int i=0; i<totalPages; i++) {
			WebElement pages = driver.findElement(By.xpath("(//li[@class='page-item active']/following-sibling::li)[1]"));
			pages.click();
		}
	}

}
