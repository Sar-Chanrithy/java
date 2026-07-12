public class Bitwise {
    public static void main(String[] args) {
        int a = 5, b = 3;  // a = 0101, b = 0011
        System.out.println("a & b: " + (a & b)); // 1 (0001)
        System.out.println("a | b: " + (a | b)); // 7 (0111)
        System.out.println("a ^ b: " + (a ^ b)); // 6 (0110)
        System.out.println("~a: " + (~a));       // -6
    }
}
