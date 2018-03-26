package demotest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.io.File;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.testng.Assert;

public class NewTest {
	private WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://google.com");
  }
  @BeforeTest
  public void beforeTest() {
	  File path=new File("C:\\Users\\anna.zhuravleva\\Documents\\Alrquitectura\\phantom\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
	  System.setProperty("phantomjs.binary.path",path.getAbsolutePath());
	  driver = new PhantomJSDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
