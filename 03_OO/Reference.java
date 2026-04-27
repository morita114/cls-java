class Person {
    String name;
    int age;

    void greet() {
        System.out.println("私は" + name + "です。" + age + "歳です。");
    }
}

public class Reference {
    public static void main(String[] args) {
        Person bob = new Person();    bob.name = "Bob";     bob.age = 19;
        Person alice = new Person();  alice.name = "Alice"; alice.age = 20;
        bob.greet();    // 私はBobです。19歳です。
        alice.greet();  // 私はAliceです。20歳です。

        Person tom = bob;             tom.name = "Tom";     tom.age = 21;
        bob.greet();    // 私はTomです。21歳です。
        alice.greet();  // 私はAliceです。20歳です。
        tom.greet();    // 私はTomです。21歳です。
    }
}

