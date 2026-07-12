public class Calculator {
    // Instance method
    int add(int a, int b) {
        return a + b;
    }

    // Static method
    static int multiply(int a, int b) {
        return a * b;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // បង្កើត object
        int sum = calc.add(5, 3);           // ហៅ instance method
        System.out.println("Addition: " + sum);

        int product = Calculator.multiply(4, 2); // ហៅ static method
        System.out.println("Multiplication: " + product);
    }
}