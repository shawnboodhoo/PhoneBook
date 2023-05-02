import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    public static void main(String[] args) {

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Shawn", "302-292-2009");

        phoneBook.put("Swati", "302-695-7656");

        phoneBook.put("Junior", "304-706-7068");

        phoneBook.put("Mem", "302-700-7060");

       getAllContacts(phoneBook);
       getAllNumbers(phoneBook);
       getNumberFromName(phoneBook, "Shawn");
       getNameFromNumber(phoneBook, "302-695-7656");
       add(phoneBook, "John", "302-808-7968");
       remove(phoneBook, "Mem","302-700-7060");
       getContactsAndNumbers(phoneBook);
       clear(phoneBook);

    }

    public static void getAllContacts(HashMap<String, String> phoneBook) {
        if (phoneBook.isEmpty()) {
            System.out.println("phonebook is empty");
        } else {
            for (String b : phoneBook.keySet()) {
                System.out.println(b);
            }
        }
    }

    public static void getAllNumbers(HashMap<String, String> phoneBook) {
        if (phoneBook.isEmpty()) {
            System.out.println("phonebook is empty");
        } else {
            for (String b : phoneBook.values()) {
                System.out.println(b);
            }
        }
    }

    public static void getNumberFromName(HashMap<String, String> phoneBook, String name) {
        String nameValue = phoneBook.get(name);
        if (name == null) {
            System.out.println("name not fount");
        } else {
            System.out.println(nameValue);

        }
    }

    public static void getNameFromNumber(HashMap<String, String> phoneBook, String number) {
        if (!phoneBook.containsValue(number)) {
            System.out.println("number not found");
        } else {
            for (Map.Entry<String, String> i: phoneBook.entrySet()){
                if (i.getValue().equals(number)){
                    String x = i.getKey();
                    System.out.println(x);
                }
            }

        }
    }

    public static void getContactsAndNumbers(HashMap<String, String> phoneBook) {
            for (Map.Entry<String, String> i: phoneBook.entrySet()){
                    System.out.println(i);
                }
            }
    public static void add(HashMap<String, String> phoneBook, String name, String number){
        phoneBook.put(name, number);
        System.out.println("contact added");
    }

    public static void remove(HashMap<String, String> phoneBook, String name, String number){
        phoneBook.remove(name, number);
        System.out.println("contact added");
    }


    public static void clear(HashMap<String, String> phoneBook){
        phoneBook.clear();
        System.out.println("phonebook cleared" + phoneBook);
    }


}
