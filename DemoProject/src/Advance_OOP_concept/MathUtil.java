package Advance_OOP_concept;

public class MathUtil {
    // Static variable
    public static int counter = 0;

    // Static method
    public static int add(int a, int b) {
        counter++; // បន្ថែមចំនួនការប្រើប្រាស់
        return a + b;
    }

    public static void main(String[] args) {
        // ចូលប្រើ static method ដោយផ្ទាល់
        System.out.println("5 + 3 = " + MathUtil.add(5, 3));
        System.out.println("10 + 20 = " + MathUtil.add(10, 20));
        System.out.println("ចំនួនការប្រើប្រាស់: " + MathUtil.counter);
    }
}