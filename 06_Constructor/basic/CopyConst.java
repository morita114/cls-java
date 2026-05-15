class Person {
    String name;
    int age;

    Person(String name, int age) { this.name = name; this.age = age; }
    Person(Person obj) {
        this.name = obj.name;
        this.age = obj.age;
    }
}

public class CopyConst {
    public static void main(String[] args) {
        Person original = new Person("John", 20);
        original.age = 20;
        
        Person copy = new Person(original);
        System.out.println("Name: " + copy.name);
        System.out.println("Age: " + copy.age);
    }
}

