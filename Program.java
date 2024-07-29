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
    }
}
