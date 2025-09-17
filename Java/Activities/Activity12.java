package examples;

interface Addable {
    int add(int a, int b);
}

public class Activity12 {
    public static void main(String[] args) {

        
        Addable ad1 = new Addable() {
            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println("Using Anonymous Class: " + ad1.add(10, 20));

        
        Addable ad2 = (a, b) -> {
            if (a < 0 || b < 0) {
                System.out.println("Warning: Negative input values.");
            }
            return a + b;
        };
        System.out.println("Using Lambda with logic: " + ad2.add(100, 200));
    }
}
