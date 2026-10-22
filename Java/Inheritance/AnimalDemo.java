
class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    private String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void display() {
        super.display();
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal {
    private String color;

    Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    void display() {
        super.display();
        System.out.println("Color: " + color);
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", 3, "Labrador");
        Cat c = new Cat("Kitty", 2, "White");

        d.display();
        System.out.println();
        c.display();
    }
}
