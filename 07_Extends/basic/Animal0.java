class Dog {
    String name;  int age;
    Dog(String name, int age) { this.name = name; this.age = age; }
    void eat() { System.out.println(name + "が食べる"); }
    void wan() { System.out.println("ワン"); }
}

class Cat {
    String name;  int age; // Dogと同じ
    Cat(String name, int age) { this.name = name; this.age = age; } // Dogと同じ
    void eat() { System.out.println(name + "が食べる"); } // Dogと同じ
    void nya() { System.out.println("ニャー"); }
}

public class Animal0 {
    public static void main(String[] args) {
        Dog dog = new Dog("ポチ", 3); dog.eat(); dog.wan();
        Cat cat = new Cat("タマ", 2); cat.eat(); cat.nya();
    }
}

