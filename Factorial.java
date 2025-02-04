public class Factorial {
    public static void main(String[] args) {
        int number = 5; // Example input
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }

    public static int factorial(int n) {
        // Base cases
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Recursive call
            return n * factorial(n - 1);
        }
    }
}
