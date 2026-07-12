public class Car {
    String model;
    int year;

    // Default constructor
    Car() {
        model = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car(String m, int y) {
        model = m;
        year = y;
    }

    void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

class Main {
    public static void main(String[] args) {
        Car car1 = new Car();          // ប្រើ default constructor
        Car car2 = new Car("Toyota", 2023); // ប្រើ parameterized constructor
        car1.display();
        car2.display();
    }
}