package hw1_task1_telephoneBook;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone("Саврасов Алексей", "+79816392763");
        phoneBook.addPhone("Стрельникова Алина", "+79201853982");
        phoneBook.addPhone("Сладкова Анна", "+79532085428");
        phoneBook.addPhone("Смирнов Дмитрий", "+79462961098");
        phoneBook.addPhone("Мыльникова Юлия", "+79356392856");
        phoneBook.addPhone("Красников Андрей", "+79116523975");
        phoneBook.addPhone("Иванов Олег", "+79452089328");
        phoneBook.addPhone("Тарасова Полина", "+79561086729");
        phoneBook.addPhone("Соколов Владимир", "+79762084983");
        phoneBook.addPhone("Воробьева Арина", "+79855083862");
        phoneBook.addPhone("Саврасова Елена", "+79381973928");
        phoneBook.addPhone("Стрельников Роман", "+79204962719");
        phoneBook.addPhone("Сладков Матвей", "+79562753491");
        phoneBook.addPhone("Смирнова Екатерина", "+79672696052");
        phoneBook.addPhone("Мыльников Евгений", "+79715284549");
        phoneBook.addPhone("Красникова Мария", "+79521753907");
        phoneBook.addPhone("Иванова Ксения", "+79553851874");
        phoneBook.addPhone("Тарасов Александр", "+79532087917");
        phoneBook.addPhone("Соколова Олеся", "+79665831097");
        phoneBook.printPhoneBook();
    }
}