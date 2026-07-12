public class Student {

    String name = "Sok";
    int age = 20;

    void study() {
        System.out.println(name + " studying ");
    }

    public static void main(String[] args) {
        Student student1 = new Student();

        System.out.println("Name: " + student1.name);
        System.out.println("Age: " + student1.age);

        student1.study();
    }
}