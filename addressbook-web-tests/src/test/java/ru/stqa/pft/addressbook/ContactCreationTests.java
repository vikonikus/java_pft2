package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    gotoAddNewContactPage();
    fillNewContactForm(new ContactData("9first name test", "9last name test", "9address test", "9mail.ru", "9-1234567890"));
    submitContactCreation();
    returnToHomePage();
  }

}
