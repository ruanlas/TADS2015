import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\IFSP\\Mat�rias 5� Semestre\\Qualidade de Software\\Ferramentas de Teste\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.learn-automation.com");
		System.out.println(driver.getTitle());;
	}
}
