import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, 
// что 1 человек может иметь несколько телефонов
public class HW5_1 {
    
    public static Map<String, List<String>> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя для поиска: ");
        String str = sc.nextLine();
        sc.close();
        findPerson(str);
    }

    public static void addPerson() {
        phoneBook.put("Sveta", List.of("223456", "654387"));
        phoneBook.put("Christina", List.of("987654", "234432"));
        phoneBook.put("Anna",List.of("4567953"));
        phoneBook.put("Peter",List.of("234654", "4593822"));
        phoneBook.put("Pavel",List.of("987523", "988843"));

    }

    public static void findPerson(String surname) {
        System.out.printf("%s: %s", surname, phoneBook.get(surname));
    }
}
