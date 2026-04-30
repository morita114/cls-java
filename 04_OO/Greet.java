class Person {
    String name;
    int age;

    void greet() {
        System.out.println("私は" + name + "です。" + age + "歳です。");
    }
}

public class Greet {
    public static void main(String[] args) {
        Person bob = new Person();
        bob.name = "Bob";
        bob.age = 19;

        bob.greet();
    }
}

