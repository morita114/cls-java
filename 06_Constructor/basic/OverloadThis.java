class Person {
    String name;
    int age;

    Person()            { this("Hoge", 18); }
    Person(String name) { this(name, 18); }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OverloadThis {
    public static void main(String[] args) {
        Person obj = new Person("John");
        System.out.println("Name: " + obj.name); // John
        System.out.println("Age: " + obj.age);   // 18
    }
}

