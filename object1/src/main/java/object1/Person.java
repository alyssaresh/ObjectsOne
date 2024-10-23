package object1;
// Define a class

class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height = 0; //units in centimeters

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String... args) {
        Person person1 = new Person("John", 30, 0);
        System.out.println(person1.height);
    }
}