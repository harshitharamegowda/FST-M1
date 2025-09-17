import java.util.*;

public class Activity13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        System.out.println("Enter integers (EOF or non-integer to terminate):");

        while (scanner.hasNextInt()) {
            numbers.add(scanner.nextInt());
        }

        if (numbers.isEmpty()) {
            System.out.println("No integers were entered. Exiting program.");
        } else {
            int randomIndex = random.nextInt(numbers.size());
            int valueAtRandomIndex = numbers.get(randomIndex);

            System.out.println("Random index generated: " + randomIndex);
            System.out.println("Value at that index: " + valueAtRandomIndex);
        }

        scanner.close();
    }
}
