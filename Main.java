import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a new HashMap<String, String> object
        HashMap<String, String> nicknames = new HashMap<>();

        // Store the names and nicknames in the hashmap
        nicknames.put("matthew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        // Get Matthew's nickname from the hashmap
        String matthewsNickname = nicknames.get("matthew");

        // Print Matthew's nickname
        System.out.println("Matthew's nickname is: " + matthewsNickname);
    }
}

