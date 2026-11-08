public class Car {
    // 1. Encapsulation: កំណត់ attribute ជា private ដើម្បីការពារទិន្នន័យ
    private String model;
    private int year;

    // Default constructor
    public Car() {
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor: ប្រើពាក្យ 'this'
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Getter និង Setter សម្រាប់ model
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    // Getter និង Setter សម្រាប់ year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1886) {
            this.year = year;
        } else {
            System.out.println("Error: Year cannot be less than 1886!");
        }
    }

    // Method បង្ហាញព័ត៌មាន
    public void display() {
        System.out.println("Model: " + model + ", Year: " + year);
    }

    public static void main(String[] args) {
        System.out.println("=== 1. បង្កើត Car ធម្មតា ===");
        Car car1 = new Car(); 
        Car car2 = new Car("Toyota", 2023);
        car1.display();
        car2.display();

        System.out.println("\n=== 2. ប្រើ Setter និង Getter ===");
        car1.setModel("Honda Civic");
        car1.setYear(2022);
        System.out.println("Car 1 updated: " + car1.getModel() + " (" + car1.getYear() + ")");

        System.out.println("\n=== 3. បង្កើត ElectricCar (Inheritance) ===");
        ElectricCar ev = new ElectricCar("Tesla Model 3", 2024, 75);
        ev.display(); // ហៅ Method ដែល Override រួច
    }
}

// 2. Inheritance: ElectricCar ស្នងមរតកពី Car
class ElectricCar extends Car {
    private int batteryCapacity; // សមត្ថភាពថ្ម (kWh)

    public ElectricCar(String model, int year, int batteryCapacity) {
        super(model, year); // ហៅ Constructor របស់ Car (Parent class)
        this.batteryCapacity = batteryCapacity;
    }

    // 3. Polymorphism (Method Overriding): កែប្រែ display() ឲ្យបង្ហាញថ្មបន្ថែម
    @Override
    public void display() {
        super.display(); // បង្ហាញ model និង year
        System.out.println(" -> Battery Capacity: " + batteryCapacity + " kWh (Electric Vehicle)");
    }
}


// 2. Inheritance: ElectricCar ស្នងមរតកពី Car
class ElectricCar extends Car {
    private int batteryCapacity; // សមត្ថភាពថ្ម (kWh)

    public ElectricCar(String model, int year, int batteryCapacity) {
        super(model, year); // ហៅ Constructor របស់ Car (Parent class)
        this.batteryCapacity = batteryCapacity;
    }

    // 3. Polymorphism (Method Overriding): កែប្រែ display() ឲ្យបង្ហាញថ្មបន្ថែម
    @Override
    public void display() {
        super.display(); // បង្ហាញ model និង year
        System.out.println(" -> Battery Capacity: " + batteryCapacity + " kWh (Electric Vehicle)");
    }
}