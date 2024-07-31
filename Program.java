import java.util.HashMap;

public class Program {

    // Method to print all keys in the given hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    // Method to print keys in the given hashmap which contain the specified text
    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    // Method to print values of keys in the given hashmap which contain the specified text
    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }

    // Method to print all values in the given hashmap of Books
    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    // Method to print books in the given hashmap which name contains the specified text
    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }

    // Main method for testing the implemented methods
    public static void main(String[] args) {
        HashMap<String, String> sampleMap = new HashMap<>();
        sampleMap.put("apple", "fruit");
        sampleMap.put("banana", "fruit");
        sampleMap.put("carrot", "vegetable");
        sampleMap.put("apricot", "fruit");

        System.out.println("Printing all keys:");
        printKeys(sampleMap);

        System.out.println("\nPrinting keys containing 'ap':");
        printKeysWhere(sampleMap, "ap");

        System.out.println("\nPrinting values of keys containing 'ap':");
        printValuesOfKeysWhere(sampleMap, "ap");

        HashMap<String, Book> bookMap = new HashMap<>();
        bookMap.put("Sense and Sensibility", new Book("Sense and Sensibility", 1811, "..."));
        bookMap.put("Pride and Prejudice", new Book("Pride and Prejudice", 1813, "...."));

        System.out.println("\nPrinting all book values:");
        printValues(bookMap);

        System.out.println("\nPrinting books with names containing 'Pride':");
        printValueIfNameContains(bookMap, "Pride");
    }
}
