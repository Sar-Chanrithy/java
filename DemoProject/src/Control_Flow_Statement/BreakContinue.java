package Control_Flow_Statement;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break; // បញ្ឈប់នៅ i = 3
            }
            System.out.println("Break: " + i);
        }
        for (int j = 1; j <= 5; j++) {
            if (j == 3) {
                continue; // រំលង i = 3
            }
            System.out.println("Continue: " + j);
        }
    }
}
