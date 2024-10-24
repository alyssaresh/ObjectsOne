package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
        Logger logger=Logger.getLogger(Main.class.getName());
        logger.info("This is a module-using Hello World!");

        Person person1 = new Person("John", 30, 173);
        System.out.println(person1.height);

        Car car1 = new Car("Kia", "Soul", 2012, 200000);
        System.out.println(car1.getMake());
        //why do I use getMake instead of make?

        Chair chair1 = new Chair("wood", "brown", 4);
        System.out.println("The chair has " + chair1.getLegs() + " legs.");

        Dog dog1 = new Dog("Holly", 12, "Cocker Spaniel");
        System.out.println("My dog " + dog1.getName() + " is a " + dog1.getBreed() + ". She is " + dog1.getAge() + " years old.");

        Person[] people = new Person[5];

        Person ppl1 = new Person("Aub", 25, 200);
        Person ppl2 = new Person("Dash", 30, 188);
        Person ppl3 = new Person("Kevin", 28, 210);
        Person ppl4 = new Person("Becca", 29, 180);
        Person ppl5 = new Person("Kenz", 30, 200);

        people[0] = ppl1;
        people[1] = ppl2;
        people[2] = ppl3;
        people[3] = ppl4;
        people[4] = ppl5;

        Person person2 = people[3];
        System.out.println(person2.name);
        System.out.println(people[4].name);

    }

}

