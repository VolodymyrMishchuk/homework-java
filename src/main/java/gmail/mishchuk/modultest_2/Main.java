package gmail.mishchuk.modultest_2;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.displayAllContacts();

        phoneBook.addContact("Петьо кум", "937-99-92");
        phoneBook.addContact("Вєрка сусідка напротів", "937-99-93");
        phoneBook.addContact("Люся поштарка", "937-99-94");

        phoneBook.displayAllContacts();

        phoneBook.updateContact("Люся поштарка", "937-99-99");
        phoneBook.searchContact("Люся поштарка");
        phoneBook.deleteContact("Люся поштарка");

        phoneBook.displayAllContacts();
    }
}
