/*Add a new instance variable, called "height", to the Person class.
Make "height" an integer, note in a comment that the units are "centimeters".
Make sure the constructor initializes this instance variable to zero centimeters.```
Inside of Main.java, create a new Person object,
and _log_ or print out the value of the "height" instance variable.*/
// Define a class
class Person {
    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height; //units in centimeters

    // Constructor
    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        /* Declare and initialize an object */
        Person person1 = new Person("John", 30, 0);
        /* Now you can use the Object `person1` */

    }
}