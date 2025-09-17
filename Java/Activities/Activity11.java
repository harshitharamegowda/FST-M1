import java.util.HashMap;

public class Activity11_Alternative {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> colorMap = new HashMap<>();

        // Add entries to the HashMap
        colorMap.put(1, "Red");
        colorMap.put(2, "Green");
        colorMap.put(3, "Blue");
        colorMap.put(4, "White");
        colorMap.put(5, "Black");

        // Print the original map
        System.out.println("Original Map: " + colorMap);

        // Remove the entry with key 4 (White)
        String removedColor = colorMap.remove(4);
        System.out.println("Removed color with key 4: " + (removedColor != null ? removedColor : "No such key"));

        // Print the map after removal
        System.out.println("Map after removal: " + colorMap);

        // Check if "Green" exists in the map
        boolean hasGreen = colorMap.containsValue("Green");
        System.out.println("Does 'Green' exist in the map? " + (hasGreen ? "Yes" : "No"));

        // Print the size of the map
        System.out.println("Total number of entries in the map: " + colorMap.size());
    }
}

