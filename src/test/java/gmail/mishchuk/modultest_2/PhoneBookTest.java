package gmail.mishchuk.modultest_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    @Test
    void shouldReturnTruesAfterCreatingNewContact() {
        // given
        PhoneBook phoneBook = new PhoneBook();

        // when
        phoneBook.addContact("Петьо кум", "937-99-92");

        // then
        assertTrue(phoneBook.getContacts().containsKey("Петьо кум"));
        assertTrue(phoneBook.getContacts().containsValue("937-99-92"));
    }

    @Test
    void shouldReturnTrueAfterUpdatingExistingContact() {
        // given
        PhoneBook phoneBook = new PhoneBook();

        // when
        phoneBook.addContact("Петьо кум", "937-99-92");
        phoneBook.updateContact("Петьо кум", "937-99");

        // then
        assertTrue(phoneBook.getContacts().containsValue("937-99"));
    }

    @Test
    void shouldReturnTrueAfterDeletingExistingContact() {
        // given
        PhoneBook phoneBook = new PhoneBook();

        // when
        phoneBook.addContact("Петьо кум", "937-99-92");
        phoneBook.deleteContact("Петьо кум");

        // then
        assertTrue(phoneBook.getContacts().isEmpty());
    }

    @Test
    void shouldReturnTruesAfterSearchingExistingContact() {
        // given
        PhoneBook phoneBook = new PhoneBook();

        // when
        phoneBook.addContact("Петьо кум", "937-99-92");
        phoneBook.searchContact("Петьо кум");

        // then
        assertTrue(phoneBook.getContacts().containsKey("Петьо кум"));
        assertTrue(phoneBook.getContacts().containsValue("937-99-92"));
    }
}