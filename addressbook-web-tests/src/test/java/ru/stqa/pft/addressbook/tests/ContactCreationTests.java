package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().gotoAddNewContactPage();
    app.getContactHelper().fillNewContactForm(new ContactData("1first name test", "1last name test", "1address test", "1mail.ru", "1-1234567890"));
    app.getContactHelper().submitContactCreation();
    app.getNavigationHelper().returnToHomePage();
  }

}
