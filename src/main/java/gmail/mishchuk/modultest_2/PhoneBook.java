package gmail.mishchuk.modultest_2;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class PhoneBook {

    private Map<String, String> contacts = new HashMap<>();

    //можна було б і не створювати пустий конструктор
    public PhoneBook() {
    }

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
        System.out.println("Створено контакт:\n\t"
                + name + ", номер: "
                + phone);
    }

    public void updateContact(String name, String newPhone) {
        if (contacts.containsKey(name)) {
            contacts.put(name, newPhone);
            System.out.println("\nКонтакт оновлено:\n\t"
                    + name + ", новий номер: "
                    + newPhone);
        } else {
            addContact(name, newPhone);
        }
    }

    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            String removedContact = contacts.remove(name);
            System.out.println("\nУспішно видалено!\n\tІм'я: "
                    + name + ", номер: "
                    + removedContact);
        }
    }

    public void searchContact(String name) {
        if (contacts.get(name) != null) {
            String phone = contacts.get(name);
            System.out.println("\nЗнайдено контакт:\n\tІм'я: "
                    + name + ", номер: "
                    + phone);
        }
    }

    public void displayAllContacts() {
        if (!contacts.isEmpty()) {
            System.out.println("\nСписок контактів:");
            for (Map.Entry<String, String> entry : contacts.entrySet()) {
                System.out.println("\tІм'я: " + entry.getKey()
                        + ", номер: " + entry.getValue() + ";");
            }
        } else {
            System.out.println("\nСписок контактів пустий\n");
        }
    }
}
