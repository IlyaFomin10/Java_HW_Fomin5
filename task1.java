//Реализуйте структуру телефонной книги с помощью HashMap,учитывая,что 1 человек может иметь несколько телефонов.

import java.util.ArrayList;
import java.util.HashMap;

public class task1 {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) { //containsKey - метод для проверки наличия ключа перед вызовом Add метода
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> values = new ArrayList<>();
            values.add(phoneNum);
            phoneBook.put(name, values);
        }
    }

    public ArrayList<Integer> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        }
        return new ArrayList<Integer>();
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        return phoneBook;
    }

    public static void main(String[] args) {
        task1 phoneBook = new task1();
        phoneBook.add("Andreev", 895322211);
        phoneBook.add("Andreev", 899915478);
        phoneBook.add("Kisilev", 899675312);
        phoneBook.add("Noskov", 895353563);
        phoneBook.add("Noskov", 899994253);
        System.out.println(phoneBook.getPhoneBook());
        System.out.printf("User's phone - %s", phoneBook.find("Andreev"));
    }}
