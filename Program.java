import java.util.HashMap;

public class Program {

    // Method to print all keys in the given hashmap
    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }
