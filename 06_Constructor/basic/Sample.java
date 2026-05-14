class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class Sample {
    public static void main(String[] args) {
        Person obj = new Person("John", 20);
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
}

