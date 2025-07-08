package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    gotoAddNewContactPage();
    fillNewContactForm(new ContactData("6first name test", "6last name test", "6address test", "6mail.ru", "6-1234567890"));
    submitContactCreation();
    returnToHomePage();
  }

}
