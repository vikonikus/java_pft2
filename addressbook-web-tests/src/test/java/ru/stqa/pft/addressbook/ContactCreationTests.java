package ru.stqa.pft.addressbook;

import java.time.Duration;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ContactCreationTests {
  private WebDriver driver;


  @BeforeMethod
  public void setUp() {
    driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    driver.get("http://localhost/addressbook/");
    login("admin", "secret");
  }

  private void login(String username, String password) {
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).clear();
    driver.findElement(By.name("user")).sendKeys(username);
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).clear();
    driver.findElement(By.name("pass")).sendKeys(password);
    driver.findElement(By.xpath("//input[@value='Login']")).click();
  }

  @Test
  public void testContactCreationTests() {
    gotoAddNewContactPage();
    fillNewContactForm(new ContactData("5first name test", "5last name test", "5address test", "5@mail.ru", "5-1234567890"));
    submitContactCreation();
    returnToHomePage();
  }

  private void returnToHomePage() {
    driver.findElement(By.linkText("home page")).click();
  }

  private void submitContactCreation() {
    driver.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void fillNewContactForm(ContactData contactData) {
    driver.findElement(By.name("firstname")).click();
    driver.findElement(By.name("firstname")).clear();
    driver.findElement(By.name("firstname")).sendKeys(contactData.firstname());
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).click();
    driver.findElement(By.name("lastname")).clear();
    driver.findElement(By.name("lastname")).sendKeys(contactData.lastname());
    driver.findElement(By.name("address")).click();
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys(contactData.address());
    driver.findElement(By.name("home")).sendKeys(contactData.homephonenumber());
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys(contactData.email());
  }

  private void gotoAddNewContactPage() {
    driver.findElement(By.linkText("add new")).click();
  }


  @AfterMethod
  public void tearDown() {
    driver.quit();
  }




}
