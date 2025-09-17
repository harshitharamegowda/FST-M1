import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names to the ArrayList
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("Diana");
        myList.add("Ethan");

        // Print all the names using a for loop
        System.out.println("Names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Retrieve the 3rd name (index 2) using get()
        String thirdName = myList.get(2);
        System.out.println("\n3rd name in the list: " + thirdName);

        // Check if a name exists using contains()
        String nameToCheck = "Diana";
        if (myList.contains(nameToCheck)) {
            System.out.println(nameToCheck + " exists in the list.");
        } else {
            System.out.println(nameToCheck + " does not exist in the list.");
        }

        // Print the number of names using size()
        System.out.println("\nNumber of names in the list: " + myList.size());

        // Remove a name from the list
        myList.remove("Charlie");

        // Print the new size of the list
        System.out.println("Size after removing a name: " + myList.size());
    }
}
