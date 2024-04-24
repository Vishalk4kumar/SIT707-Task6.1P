package sit707_week6;

public class LoopFunctions {
    
    // Function with a conditional loop 
    public static int calculateSumUntilThreshold(int threshold) {
        int sum = 0;
        int i = 1;
        while (i <= threshold) {
            sum += i;
            i++;
        }
        return sum;
    }
    
    // Function with a loop and a conditional statement 
    public static int sumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    // Function with a loop and simple statements
    public static int sumUpTo(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    // Function with a loop and a conditional statement
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    // Function with a loop and a conditional statement
    public static boolean isPerfectSquare(int n) {
        if (n < 0) {
            return false;
        }
        int i = 1;
        while (n > 0) {
            n -= i;
            i += 2;
        }
        return n == 0;
    }
}
