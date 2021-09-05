import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Handling_continuous_Integration {
	public static void main(String[] args) {
	
			System.setProperty("webdriver.chrome.driver", "E:\\Automation\\External JAR files\\Libraries\\chromedriver_win32\\chromedriver.exe");
		    WebDriver dr=new ChromeDriver();//declaring object for child class as Webdriver is an interface, objects cannot be declared for webdriver.chromedriver is child class
		    dr.get("http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx");
		    WebElement username=dr.findElement(By.xpath("//*[@id='ctl00_MainContent_username']"));
		    username.sendKeys("Tester");
		    WebElement password=dr.findElement(By.xpath("//*[@id='ctl00_MainContent_password']"));
		    password.sendKeys("test");
		    WebElement login=dr.findElement(By.xpath("//*[@id='ctl00_MainContent_login_button']"));
		    login.click();
		    //Fetch first cell data
		    WebElement celldata=dr.findElement(By.xpath("//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[2]"));
		    String data=celldata.getText();
		    System.out.println("Data of the first cell is =" + data);
		    //Fetch column data
		    String leftboundary="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[";
		    String rightboundary="]/td[2]";
		    for (int rownum=2;rownum<10;rownum++)
		    {
		    String columndata=dr.findElement(By.xpath(leftboundary+rownum+rightboundary)).getText();
		    System.out.println(columndata);
		    }
		    //Fetch row data
		    String leftdata="//*[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td[";
		    String rightdata="]";
		    for(int firstrow=2; firstrow<13;firstrow++)
		    {
		     String firstrowdata=dr.findElement(By.xpath(leftdata+firstrow+rightdata)).getText();
		     System.out.println(firstrowdata);
		    }
	}

}


