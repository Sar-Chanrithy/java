public class BankAccount {
    // Attributes របស់ម្ចាស់គណនីម្នាក់ៗ
    String owner;
    double balance;

    // Constructor
    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    // 1. Instance Method: ដាក់លុយចូលគណនី (ត្រូវការ Object ព្រោះត្រូវដឹងថាដាក់ឲ្យនរណា)
    public void deposit(double amount) {
        this.balance += amount;
        System.out.println(owner + " បានដាក់ប្រាក់: $" + amount + " | សមតុល្យសរុប: $" + this.balance);
    }

    // 2. Static Method: រូបមន្តគណនាការប្រាក់ទូទៅ (មិនបាច់ Object ទេ អាចប្រើរួមគ្នាបាន)
    public static double calculateInterest(double money, double rate) {
        return money * (rate / 100);
    }

    // 3. Main Method ដាក់ក្នុង file BankAccount.java ដើម្បី Run បានផ្ទាល់
    public static void main(String[] args) {
        System.out.println("=== 1. តេស្ត Instance Method (ត្រូវការបង្កើត Object ជាមួយ new) ===");
        BankAccount user1 = new BankAccount("Sok", 100);
        BankAccount user2 = new BankAccount("Bopha", 500);

        user1.deposit(50);  // ដាក់លុយឲ្យ Sok -> សមតុល្យឡើងដល់ 150
        user2.deposit(100); // ដាក់លុយឲ្យ Bopha -> សមតុល្យឡើងដល់ 600

        System.out.println("\n=== 2. តេស្ត Static Method (មិនបាច់បង្កើត new ទេ) ===");
        // ហៅតាមឈ្មោះ Class: BankAccount.calculateInterest(...)
        double interest = BankAccount.calculateInterest(1000, 5);
        System.out.println("ការប្រាក់ 5% លើប្រាក់ $1000 គឺ: $" + interest);
    }
}
