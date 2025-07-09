package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.gotoAddNewContactPage();
    app.fillNewContactForm(new ContactData("9first name test", "9last name test", "9address test", "9mail.ru", "9-1234567890"));
    app.submitContactCreation();
    app.returnToHomePage();
  }

}
