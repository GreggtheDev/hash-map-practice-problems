import java.util.HashMap;
import java.util.Map;

public class Abbreviations {
    private Map<String, String> abbreviationMap;

    // Constructor
    public Abbreviations() {
        this.abbreviationMap = new HashMap<>();
    }

    // Method to add a new abbreviation and its explanation
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviationMap.put(abbreviation, explanation);
    }

    // Method to check if an abbreviation has already been added
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviationMap.containsKey(abbreviation);
    }

    // Method to find the explanation for an abbreviation
    public String findExplanationFor(String abbreviation) {
        return this.abbreviationMap.getOrDefault(abbreviation, null);
    }
