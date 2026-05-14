class Person {
    final String name = "billy";;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
        // Error: finalフィールドは初期化後に「再」代入不可
        // this.name = "John"; 
    }

}

public class InitFinal {
    public static void main(String[] args) {
        Person p = new Person("John", 21);
        // p.name = "Bob"; // Error: finalフィールドは再代入不可
        System.out.println("Name: " + p.name); // Name: John
        System.out.println("Age: " + p.age);   // Age: 21
    }
}

