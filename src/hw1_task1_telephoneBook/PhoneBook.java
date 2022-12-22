package hw1_task1_telephoneBook;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class PhoneBook {
    private Map<String, String> phoneBook = new HashMap<>();

    public void addPhone(String name, String phone) {
        phoneBook.put(name, phone);
    }

    public void printPhoneBook() {
        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            System.out.println("Имя: " + entry.getKey() + ", телефон: " + entry.getValue());
        }
    }
}
