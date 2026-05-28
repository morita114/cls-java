// Animal.java
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void speak();

    void introduce() {
        System.out.println("私は" + name + "です。");
    }
}

// Dog.java
class Dog extends Animal {
    Dog(String name) { super(name); }

    @Override
    void speak() { System.out.println("ワン"); }
}

// Cat.java
class Cat extends Animal {
    Cat(String name) { super(name); }

    @Override
    void speak() { System.out.println("ニャー"); }
}

// Cow.java
class Cow extends Animal {
    Cow(String name) { super(name); }

    @Override
    void speak() { System.out.println("モー"); }
}

class Ex1Animal {
    public static void main(String[] args) {
        Animal[] animals = {
            new Dog("犬"),
            new Cat("猫"),
            new Cow("牛")
        };

        for (Animal a : animals) {
            a.introduce();
            a.speak();
            if (a instanceof Dog) {
                System.out.println("お手");
            }
        }
    }
}