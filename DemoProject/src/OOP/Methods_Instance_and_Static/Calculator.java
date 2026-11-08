public class Calculator {
    // Instance method (ត្រូវការបង្កើត object សិនទើបហៅប្រើបាន)
    int add(int a, int b) {
        return a + b;
    }

    // Static method (អាចហៅឈ្មោះ Class ប្រើផ្ទាល់តែម្ដង មិនបាច់បង្កើត object ទេ)
    static int multiply(int a, int b) {
        return a * b;
    }

    // Main method ដាក់នៅក្នុង Calculator ផ្ទាល់ ដើម្បីអាច Run file Calculator.java បាន
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // បង្កើត object
        int sum = calc.add(5, 3);           // ហៅ instance method
        System.out.println("Plus: " + sum);

        int product = Calculator.multiply(4, 2); // ហៅ static method
        System.out.println("Multiply: " + product);
    }
}
