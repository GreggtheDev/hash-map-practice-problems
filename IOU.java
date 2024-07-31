import java.util.HashMap;
import java.util.Map;

public class IOU {
    // Map to store the amounts owed to each person
    private Map<String, Double> debts;

    // Constructor to create a new IOU instance
    public IOU() {
        // Initialize the debts map
        this.debts = new HashMap<>();
    }

    // Sets the amount owed to a specific person
    public void setSum(String toWhom, double amount) {
        // Put the person's name and the amount owed in the debts map
        this.debts.put(toWhom, amount);
    }
