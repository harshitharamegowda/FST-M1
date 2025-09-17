import java.util.HashSet;

public class Activity10_Alternative {
    public static void main(String[] args) {
        // Create a HashSet of Strings
        HashSet<String> hs = new HashSet<>();

        // Add elements to the HashSet
        hs.add("M");
        hs.add("B");
        hs.add("C");
        hs.add("A");
        hs.add("M");  // Duplicate, won't be added
        hs.add("X");

        // Print the original HashSet
        System.out.println("Original HashSet: " + hs);

        // Print the size of the HashSet
        System.out.println("Size of HashSet: " + hs.size());

        // Try removing an existing element
        boolean isARemoved = hs.remove("A");
        System.out.println("Removing 'A' from HashSet: " + (isARemoved ? "Successful" : "Not found"));

        // Try removing a non-existing element
        boolean isZRemoved = hs.remove("Z");
        System.out.println("Removing 'Z' from HashSet: " + (isZRemoved ? "Successful" : "Z is not present in the Set"));

        // Check if an element exists
        boolean containsM = hs.contains("M");
        System.out.println("Checking if 'M' is present: " + (containsM ? "Yes" : "No"));

        // Print the updated HashSet
        System.out.println("Updated HashSet: " + hs);
    }
}
