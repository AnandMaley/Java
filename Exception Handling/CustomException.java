import java.util.*;

public class CustomException {
    public static void validateAge() throws IllegalArgumentException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close(); // Closing scanner

        if (age < 18) {
            throw new IllegalArgumentException("Error: Age must be 18 or above.");
        }
    }

    public static void checkArray() {
        try {
            int[] a = new int[5];
            a[6] = 8;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds!");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(); 
            checkArray();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
